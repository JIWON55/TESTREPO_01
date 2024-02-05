create database testdb2;
use testdb2;

-- 1
create table tbl_member(
	member_id int not null,
    member_name varchar(10) not null,
    member_identity varchar(10) null,
    member_grade varchar(10) not null,
    member_addr varchar(100) not null,
    member_phone varchar(20) null
);
desc tbl_member;
select * from tbl_member;

create table tbl_book(
	book_code int not null,
    classification_id int not null,
    book_author varchar(45) null,
    book_name varchar(45) null,
    publisher varchar(45) null,
    isrental char(1) not null
);
desc tbl_book;

create table tbl_rental(
	rental_id int not null,
    book_code int not null,
    member_id int not null
);
desc tbl_rental;

-- 2
alter table tbl_member change column member_id member_id int not null auto_increment primary key ;
show table status where name = 'tbl_member';
desc tbl_member;
-- 3
alter table tbl_book add constraint pk_tbl_book primary key (book_code);
alter table tbl_book modify book_code int not null auto_increment;
show table status where name = 'tbl_book';
desc tbl_book;
-- 4
alter table tbl_rental add constraint pk_tbl_rental primary key (rental_id);
alter table tbl_rental modify rental_id int not null auto_increment;
show table status where name = 'tbl_rental';
desc tbl_rental;
-- 5
alter table tbl_rental add constraint fk_tbl_book_tbl_rental_fk 
foreign key(book_code) references tbl_book(book_code)
on update restrict
on delete cascade; 

-- 5번 확인
SELECT * FROM information_schema.table_constraints 
WHERE  table_name = 'tbl_rental';

-- 6
alter table tbl_rental add constraint fk_tbl_member_tbl_rental_fk
foreign key(member_id) references tbl_member(member_id);

-- 7
insert into tbl_member values
(111,'aaa','111','일반','대구','000-111-2222'),
(222,'bbb','222','VIP','울산','000-111-2222'),
(333,'ccc','333','VIP','인천','000-111-2222'),
(444,'ddd','444','일반','부산','000-111-2222'),
(555,'eee','555','VIP','서울','000-111-2222'),
(666,'fff','666','일반','경기','000-111-2222');
select*from tbl_member;

insert into tbl_book values
(1010,1,'윤성우','열혈C','오렌지미디어','1'),
(1011,1,'남궁성','JAVA의정석','00미디어','1'),
(1012,1,'남길동','이것이리눅스다','한빛미디어','1'),
(2010,2,'데일카네기','인간관계론','00미디어','1'),
(2011,2,'홍길동','미움받을용기','00미디어','1');
select*from tbl_book;

insert into tbl_rental values
(1,1010,111),
(2,1011,222),
(3,1012,333);
select*from tbl_rental;

-- 8

SELECT * FROM information_schema.table_constraints 
WHERE  table_name = 'tbl_member';

SELECT * FROM information_schema.table_constraints 
WHERE  table_name = 'tbl_book';

SELECT * FROM information_schema.table_constraints 
WHERE  table_name = 'tbl_rental';

-- 9
create index member_addr_idx on tbl_member(member_addr);
show index from tbl_member;

create index book_author_idx on tbl_book(book_author);
create index book_name_idx on tbl_book(book_name);
create  index publisher_idx on tbl_book(publisher);
show index from tbl_book;

-- 10
create or replace view View_ShowRental as
select rental_id, M.member_name, book_name
from tbl_member M
inner join tbl_rental R
on M.member_id=R.member_id
inner join tbl_book B
on R.book_code=B.book_code;

select * from view_showrental;