-- --------------------
-- TRANSACTION	
-- --------------------
-- 데이터베이스의 상태를 변환시키는 작업 단위, 작업 수행 단위


-- --------------------
-- TRANSACTION	성질
-- --------------------
-- 원자성
-- 일관성
-- 독립성,격리성
-- 영속성,지속성

-- -------------------
create table tbl_tx(
	no int primary key,
    name varchar(20),
    age int,
    gender char(1)
);
select * from tbl_tx;

insert into tbl_tx values (1,'aa',55,'W'); -- auto commit
insert into tbl_tx values (2,'bb',44,'M'); -- auto commit
select * from tbl_tx;

start transaction;
	insert into tbl_tx values (3,'cc',55,'W'); 
	insert into tbl_tx values (4,'dd',55,'W'); 
    insert into tbl_tx values (5,'ee',55,'W');
    rollback; -- 전체 롤백
    
start transaction;
-- savepoint 어느 위치에서 롤백할지 지정가능
	savepoint s1;
    insert into tbl_tx values (3,'cc',55,'W'); 
	insert into tbl_tx values (4,'dd',55,'W'); 
    savepoint s2;
    insert into tbl_tx values (5,'ee',55,'W');
    insert into tbl_tx values (6,'ff',55,'W');
    savepoint s3;
    insert into tbl_tx values (7,'gg',55,'W');
    insert into tbl_tx values (8,'hh',55,'W');
    rollback to s2;

select * from tbl_tx;
delete from tbl_tx;

drop procedure Tx_test;
delimiter $$
create procedure Tx_test()
begin
	declare continue handler for sqlexception -- 예외상황 처리 핸들러 등록 
		begin
			show errors;
            rollback;
		end;
	start transaction;
		insert into tbl_tx values (1,'hh',55,'W'); 	-- SQL
        insert into tbl_tx values (2,'hh',55,'W');	-- SQL
        insert into tbl_tx values (2,'hh',55,'W');	-- SQL
	
    
    commit;
    
end $$
delimiter ;

call Tx_test();
select * from tbl_tx;