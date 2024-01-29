-- ctrl + enter : 실행
-- '--' : 주석 (-- 다음에 띄우기 필수)
-- 대소문자 구분 X
-- mysql에서는 primary key를 기준으로 오름차순정렬됨

-- 00 확인
use shopdb;
show tables;
select * from usertbl;
select * from buytbl;
desc usertbl;
desc buytbl;




-- 01 Select : 조회, db내의 테이블에서 원하는 정보를 가져오는데 사용되는 명령어
select * from usertbl;
select userid,birthyear from usertbl;
select userid as '아이디', birthyear as '생년월일' from usertbl; -- 컬럼명을 변경
select 
userid as '아이디', birthyear as '생년월일', concat(mobile1,'-',mobile2) as '연락처'
from usertbl;

-- 02 Select where(조건절 - 비교연산자)
select * from usertbl where name='김경호';  -- 동등 비교 연산자(=)
select * from usertbl where userid='LSG';
select * from usertbl where birthyear >=1970; -- 대소 비교 연산자
select * from usertbl where height <=170;

-- 03 Select where(조건절 - 논리연산자)

-- and 연산자(참 and 참) 을 만족하는 경우
select * from usertbl where birthyear >= 1970 and height >=180; 

-- or 연산자([참 or 참], [거짓 or 참], [참 or 거짓])
select * from usertbl where birthyear >= 1970 or height >=180; 

select * from usertbl where height >=170 and height <=180;
select * from usertbl where height between 170 and 180;

-- in(포함문자열 - 완성된 문자열), like(포함문자열 - 미완성된 문자열)
select * from usertbl where  addr in('서울','경남');
select * from usertbl where addr='경남' or addr='서울';

select * from usertbl where name='김범수';
select * from usertbl where name like '김%'; -- 김이 포함된, 길이 제한 없는 모든 문자
select * from usertbl where name like '%수';
select * from usertbl where name like '김__'; -- 김을 포함하고, _개수만큼의 길이제한이 있는 모든 문자

select * from usertbl where name like '%경%'; -- 경 문자를 포함하는 모든 이름 검색

-- 문제
desc buytbl;
select * from buytbl where amount >=5;
select userid,prodname from buytbl where price >=50 and price<=500;
select * from buytbl where amount >=10 or price>=100;
select * from buytbl where userid like 'K%';
select * from buytbl where groupName in ('서적', '전자');
select * from buytbl where prodname= '책' or userID like '%w';
select * from buytbl where groupName != 'null';
select * from buytbl where groupName <>'null';

-- 04 Select 조건절 - 서브쿼리

-- 김경호보다 큰키를 가지는 모든 열의 값
select height from usertbl where name='김경호'; -- 김경호의 키

-- select * from usertbl where height >=(김경호의 키);
select * from usertbl where height >(select height from usertbl where name='김경호');

-- 성시경보다 나이가 많은 (birthyear)가 많은 모든 열의 값 출력
select * from usertbl where birthyear<(select birthyear from usertbl where name='성시경');

-- 지역이 '경남'인 height 보다 큰 행 출력 
-- (지역이 '경남'인 height의 값이 두개라 기준을 못 잡고 오류)
select * from usertbl where height>(select height from usertbl where addr = '경남');

-- all (나오는 모든 수를 만족시키는 / A보다도 크고(작고) B보다도 크고(작고)) 
select * from usertbl where height>all(select height from usertbl where addr = '경남');

-- any (어느 조건이든 하나이상 만족)
select * from usertbl where height>any(select height from usertbl where addr = '경남');

-- 문제
-- 1. amount가 10인 행의 price보다 큰 행을 출력하세요(서브쿼리)
select * from buytbl where price>(select price from buytbl where amount = 10);

-- 2. userid 가 k로 시작하는 행의 amount 보다 큰 행을 출력하세요(서브쿼리 + ANY)
select * from buytbl where amount>any(select amount from buytbl where userID like 'k%');

-- 3. amount 가 5인 행의 price 보다 큰 행을 출력하세요(서브쿼리 + All)
select * from buytbl where price>all(select price from buytbl where amount=5);

