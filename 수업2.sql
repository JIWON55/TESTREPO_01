-- select group by
use shopdb;

-- userid별 amount 총합
select userid, sum(amount) from buytbl group by userid;
select userid, sum(amount) as '구매총량' from buytbl group by userid;
-- uerid별 amount*price의 총합(sum) - 총 얼마썼는지를 알 수 있음
select userid, sum(amount*price) from buytbl group by userid;
-- userid별 amount*price의 평균값(avg) 
select avg(amount)  as '구매평균값' from buytbl group by userid;

-- truncate : 소수점 자릿수 결정
select userid, truncate(avg(amount*price),2)  as '구매평균액' from buytbl group by userid;

-- 가장 큰 값 구하기
select max(height) from usertbl;
-- 가장 작은 값 구하기
select min(height) from usertbl;

-- 가장 큰 키를 가지는 user의 모든 열의 값 확인
-- select * from usertbl where height=(가장 큰 키);
select * from usertbl where height=(select max(height)from usertbl);

-- 가장 작은 키를 가지는 user의 모든 열의 값 확인
-- select * from usertbl where height=(가장 작은 키);
select * from usertbl where height=(select min(height)from usertbl);

-- 가장 큰 키와 가장 작은 키의 값만 확인
select * from usertbl where height=(select max(height)from usertbl) or height=(select min(height)from usertbl);


-- 문제
-- 1. buytbl에서 userid 별로 구매량(amount)의 합을 출력하세요
select sum(amount) from buytbl group by userid;
-- 2.
select avg(height) from usertbl;
-- 3.
select userid, max(amount),min(amount) from buytbl group by userid; 
-- 4.
select count(groupName) from buytbl;
-- 5.
use classicmodels; 
select avg(creditlimit) from customers group by city;
select sum(quantityordered) from orderdetails group by ordernumber;
select sum(quantityinstock) from products group by productvendor;


-- 02 select group by + having : 집계 결과값을 조건절로 지정할때 사용
use shopdb;
select userid,sum(amount) as '구매총량' from buytbl group by userid having sum(amount)>5;
-- userid와 userid별로 수량 합계가 5 이상인 상품의 sum을 구매총량이라는 컬럼으로 보여줘

-- select userid,sum(amount) as '구매총량' from buytbl group by userid having '구매총량'>5;  사용 X

select userid, truncate(avg(amount*price),2)  as '구매평균액' from buytbl 
group by userid having truncate(avg(amount*price),2)>50;


-- 03 select + group by + rollup
-- 부분합
select num,groupname,sum(price*amount) from buytbl group by groupname,num with rollup;
-- 총합
select groupname,sum(price*amount) from buytbl group by groupname with rollup;

select userid,addr,avg(height) from usertbl group by addr,userid with rollup; -- group by 이후 순서 중요


-- 문제
select * from buytbl;
-- 1.
select userid,prodname,sum(price*amount) from buytbl group by prodName;
-- group by 같은 열 입력
-- 2.
select prodname,sum(price*amount) from buytbl group by prodName having sum(price*amount)>=1000;
-- 3.

-- 4.

-- 5.
