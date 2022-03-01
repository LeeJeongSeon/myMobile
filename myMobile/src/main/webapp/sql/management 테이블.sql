drop table my_mobile_member;

create table management (
id varchar2(50) not null primary key,
pw varchar2(50) not null,
name varchar2(50) not null,
keyNum number(6) not null
);

select * from management;

insert into management (id, pw, name, keyNum) values
('manager1','Manager!1','관리자1','594625');
insert into management (id, pw, name, keyNum) values
('manager2','Manager#2','관리자2','875214');

commit;