-- ---------------------
-- Stored Procedure
-- ---------------------
-- 데이터베이스에서 실행 가능한 저장 프로그램
-- SQL문들의 논리적인 묶음
-- Function(함수)와 유사하나 특정부분에서의 차이점이 존재한다. - 데이터베이스 전용 함수 - 함수 : 수를 받아서 처리하는 논리적인 공간

-- -------------------------------------
-- Stored Procedure와 Function 과의 공통점
-- -------------------------------------
-- 01 재사용성
-- 02 모듈화
-- 03 매개변수이 존재
-- 04 흐름제어 처리(if,case,while 사용가능)
-- 05 트랜잭션 처리
-- 06 커서사용
-- 07 반환값 존재
-- 08 동적 SQL문 실행가능(prepare - execute)

-- ------------------------------------
-- Stored Procedure와 Function 과의 차이점
-- -------------------------------------
-- 반환값
	-- 프로시저에서는 반환값이 필수는 아니다
    -- 함수에서는 항상 값을 반환한다
    
-- 허용되는 문맥
		-- 프로시저는 SELECT,INSERT,UPDATE,DELETE 문과 같은 SQL문 내에서 직접 호출 가능
        -- 함수는 주로 SELECT 문이나 WHERE절에서 호출되어 사용, SQL문에서 직접 호출되는 경우가 적음

-- 트랜잭션
	-- 프로시저 : 트랜잭션 내에서 여러 SQL문을 실행할 수 있다.
    -- 함수 : 주로 읽기 전용 작업에 사용되며, 트랜잭션에서 변경 사항을 가지지 않도록 설계
    
-- 예외처리
	-- 프로시저 : 프로시저 내에서 예외처리 가능
    -- 함수 : 예외처리가 가능하지만 주로 SELECT문을 사용하기 때문에(조회) 예외처리를 적용하는 경우가 적음
    

-- -----------------------
-- 예제 01
-- -----------------------

delimiter $$
create procedure pro1() -- 외부로부터 값을 받지않겠다
begin
	-- 변수 선언
    declare var1 int;
    -- 값 삽입
    set var1 = 100;
    -- if문(조건절)
    if var1 = 100 
		then
			select 'var1은 100 입니다';
       else
			select 'var1은 100 이 아닙니다';
    end if;        
end $$
delimiter ;

show procedure status where db='shopdb';  -- procedure 조회

call pro1();	-- 값 부르기


-- ---------------------
-- 02 파라미터
-- ---------------------
delimiter $$
create procedure pro2(in param int) -- 값을 하나만 받겠다
begin
	
    -- if문(조건절)
    if param = 100 
		then
			select param, '은 100 입니다';
       else
			select param, '은 100 이 아닙니다';
    end if;        
    
end $$
delimiter ;



call pro2(105);
call pro2(100);
call pro2(99);

-- -----------------------------

delimiter $$
create procedure pro3(in amt int) -- 값을 하나만 받겠다
begin
	
    select* from buytbl where amount>=amt;
      
end $$
delimiter ;

call pro3(4);
call pro3(6);

delimiter $$
create procedure pro4(in amt int, in isGt int) 
begin
	if isGt != 0
		then
			select* from buytbl where amount>=amt;
		else		
			select* from buytbl where amount<=amt;
	end if;
    
end $$
delimiter ;

call pro4 (4,0);
call pro4 (1,1);

delimiter $$
create procedure pro5() 
begin
	declare avg_total_price double;
    set avg_total_price = (select avg(amount*price)from buytbl);
    select avg_total_price;
    
end $$
delimiter ;

call pro5();

set @avr=(select avg(amount*amount)from buytbl);
select @avr;
select*,price*amount,if(price*amount>=@avr,'평균이상','평균이하')as '평균이상/이하' from buytbl;


-- 문제 01
-- usertbl에서 출생년도를 입력 받아 해당 출생년도보다 나이가 많은 행만 출력
-- birthyear열을 이용
-- 프로시저명 : older (in param int)

select * from usertbl;
delimiter $$
create procedure older (in param int)
begin
	
	select * from usertbl where birthyear<param;
	
end $$
delimiter ;

call older (1989);

-- 문제02
-- 근태일, 가입일로부터 지난일 구하기(usertbl)
-- 가입일로부터 지난 날짜 확인(테이블 조회시 열하나 추가해서 보여주세요)
-- select curdate(); -- 현재 날짜(YYYY-MM-DD)
-- select now();	-- 현재 날짜신간
-- select curtime();	-- 현재 시간
-- select *, ceil(datediff(curdate(),mDate)/365) from usertbl;
select *,ceil(datediff(curdate(),mDate)/365) as '근속년수' from usertbl;
select *, datediff(curdate(),mDate) as '근속일수' from usertbl;



delimiter $$
create procedure tmp( )
begin
	select *,datediff(curdate(),mDate) as '가입일로부터 N일' from usertbl;
end $$
delimiter ;
-- select *, :  전체 조회 + 열 추가 조회
-- ceil : 반올림 처리하는 함수
-- datediff : 두 날짜사이의 일, 월, 연도 수를 계산하는 함수
call tmp();

-- ----------------------
-- 인자 2개
-- ----------------------

delimiter $$
create procedure proc6(in arg1 int, in arg2 int)
begin
	select * from usertbl where height between arg1 and arg2;
    -- usertbl에서 arg1 과 arg2 사이의 값을 조회
end $$
delimiter ;
call proc6(170,180);



select *,
case
	when amount>=10 then 'VIP'
    when amount>=5 then '우수'
	when amount>=1 then '일반'
    else '구매없음'
end as 'GRADE'
from buytbl;

delimiter $$
create procedure proc7(in arg1 int, in arg2 int, in arg3 int)
begin
	select *,
	case
		when amount>=arg1 then 'VIP'
		when amount>=arg2 then '우수'
		when amount>=arg3 then '일반'
    else '구매없음'
	end as 'GRADE'
	from buytbl;
end $$
delimiter ;

call proc7(5,3,1);

-- -------------------
-- 프로시저 + 반복문
-- -------------------
-- 흐름제어에는 조건문이 선행 - 분기 처리 or 반복 처리

-- HELLO WORLD 를 10회 반복 출력
-- i=1; 반복탈출용 변수 선언
-- while(1<=10) - 반복을 위한 조건식
-- {select "HELLO WORLD"; 
-- 		i=i+1;} - 반복탈출을 위한 연산작업

delimiter $$
create procedure proc_while_01()
begin
	declare i int;
    set i = 1;
    while i<=10 do
		select "HELLO WORLD";
        set i=i+1;
	end while;
end $$
delimiter ;
call proc_while_01(); -- grid가 열번 나옴

delimiter $$
create procedure proc_while_02(in n int) -- 프로시저를 몇번 반복할거니(몇번:변수지정) 변수값이 10 자리에 대체되어야한다
begin
	declare i int;
    set i = 1;
    while i<=n do
		select "HELLO WORLD";
        set i=i+1;
	end while;
end $$
delimiter ;
call proc_while_02(3);

-- 1-10 합
delimiter $$
create procedure proc_while_03() 
begin
	declare i int;
    declare sum int;
    set i = 1;
    set sum = 0;
    while i <= 10 do 
		set sum = sum + i;
        set i=i+1;
	end while;
    select sum;
end $$
delimiter ;

call proc_while_03();

delimiter $$
create procedure proc_while_03_1(in n int) 
begin
	declare i int;
    declare sum int;
    set i = 1;
    set sum = 0;
    while i <= n do 
		set sum = sum + i;
        set i=i+1;
	end while;
    select sum;
end $$
delimiter ;

call proc_while_03_1(10);

-- 구구단 2단
delimiter $$
create procedure multiple_2()
begin
	declare i int;
    declare mul int;
    set i=1;
    set mul=1;
    while i <= 9 do
		set mul = 2*i;
        set i=i+1;
        select mul;
	end while;
end $$
delimiter ;
drop procedure multiple_2;
call multiple_2();

-- 구구단 N단
delimiter $$
create procedure multiple_N(in n int)
begin
	declare i int;
    declare mul int;
    set i=1;
    set mul=1;
    while i <= 9 do
		set mul = n*i;
        set i=i+1;
        select mul;
	end while;
end $$
delimiter ;

call multiple_N(7);