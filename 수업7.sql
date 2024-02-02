use testdb;
-- -------------------
-- JOIN
-- -------------------
-- 두개 이상의 테이블을 서로 묶어서 하나의 조회결과를 만드는데 사용

-- -------------------
-- JOIN 종류
-- -------------------
-- INNER JOIN : ON 이하의 조건절을 만족하는 행만 JOIN
-- OUTER JOIN : ON 이하의 조건절을 만족하지 않는 행도 JOIN
	-- LEFT OUTER JOIN : 조건을 만족하지 않는 왼쪽 테이블의 행도 JOIN
    -- RIGHT OUTER JOIN : 조건을 만족하지 않는 오른쪽 테이블의 행동 JOIN
    -- FULL JOIN : 조건을 만족하지 않는 왼/오른쪽 테이블의 행도 JOIN
-- CROSS JOIN :  한쪽 테이블 모든행과 반대쪽 테이블의 모든 행을 조인, 조건절 X
-- SELF JOIN : 한 테이블내에서 다른 행과의 JOIN

-- INNER JOIN
use shopdb;
select * from usertbl;
select * from buytbl;

select * 
from usertbl 
inner join buytbl
on usertbl.userid=buytbl.userid;

-- INNER JOIN 원하는 열만 출력(열이름 중복시 특정테이블의 열이름으로 선택해서 지정한다)

select name,addr,mobile1,mobile2,prodname,price,amount 
from usertbl 
inner join buytbl
on usertbl.userid=buytbl.userid;

-- select usertbl.userid,name,addr,mobile1,mobile2,prodname,price,amount 
-- from usertbl 
-- inner join buytbl
-- on usertbl.userid=buytbl.userid;

-- INNER JOIN (별칭지정)
select U.userid,name,addr,mobile1,mobile2,prodname,price,amount 
from usertbl U
inner join buytbl B
on U.userid=B.userid
where amount<=5;


-- 문제
-- 1. 바비킴의 userId,birthYear,prodName,GroupName 을 출력하세요
select usertbl.userid, birthyear,prodname, groupname from usertbl
inner join buytbl on usertbl.userid=buytbl.userid where name='바비킴';

-- 2. amount*price 의 값이 100 이상인 행의 name,addr,prodname,mobile1- mobile2를(concat()함수사용) 출력하세요
select name,addr,prodname,concat(mobile1,'-',mobile2) from usertbl
inner join buytbl on usertbl.userid=buytbl.userid where amount*price>=100;

-- 3. groupname이 전자인 행의 userid,name,birthyear prodname을 출력하세요
select usertbl.userid,name,birthyear,prodname from usertbl inner join buytbl
on usertbl.userid=buytbl.userid where groupname='전자'; 



-- LEFT OUTER JOIN(on 조건을 만족하지 않은 left 테이블의 행도 출력)
use shopdb;
select *
from usertbl U
left outer join buytbl B
on  U.userid = B.userid;

-- RIGHT OUTER JOIN(on 조건을 만족하지 않은 left 테이블의 행도 출력)
use shopdb;
select *
from buytbl B
right outer join usertbl U
on  U.userid = B.userid;

-- FULL OUTER JOIN (ON 조건을 만족하지 않는 LEFT,RIGHT 테이블의 행도 출력)
-- MYSQL에서는 FULL OUTER JOIN을 지원하지 않는다.
-- 대신 UNION을 사용해서 LEFT,RIGHT OURTER JOIN을 연결한다

select * from usertbl left outer join buytbl on usertbl.userid=buytbl.userid
union 
select * from usertbl right outer join buytbl on usertbl.userid=buytbl.userid;


-- 여러 테이블들 JOIN
use classicmodels;

select P.productCode,productName,quantityOrdered,priceEach,orderDate,O.status
from products P
inner join orderdetails OD
on P.productCode=OD.productCode
inner join orders O
on O.orderNumber=OD.orderNumber;

select P.productCode,productName,quantityOrdered,priceEach,orderDate,O.status
from orderdetails OD
inner join products P
on P.productCode=OD.productCode
inner join orders O
on O.orderNumber=OD.orderNumber;

-- RIGHT OUTER JOIN
select P.productCode,productName,quantityOrdered,priceEach,orderDate,O.status
from orderdetails OD
right outer join products P
on P.productCode=OD.productCode
inner join orders O
on O.orderNumber=OD.orderNumber;