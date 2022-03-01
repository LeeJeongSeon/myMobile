drop table my_mobile_member;

create table my_mobile_member (
userid varchar2(50) not null primary key,
userpw varchar2(50) not null,
name varchar2(50) not null,
email varchar2(50),
hp varchar2(50),
address varchar2(200),
join_date date default sysdate,
manager VARCHAR2(1) default 'x'
);

select * from my_mobile_member;

insert into my_mobile_member (userid, userpw, name, email, hp, address, manager) values
('manager1','Manager!1','관리자1','manager@gmail.com','02-111-0000','서울시','o');
insert into my_mobile_member (userid, userpw, name, email, hp, address, manager) values
('manager2','Manager#2','관리자2','manager@daum.com','02-222-0000','서울시','o');
insert into my_mobile_member (userid, userpw, name, email, hp, address) values
('client12','Client12!','사용자','client@naver.com','010-1111-2222','수원시');
insert into my_mobile_member (userid, userpw, name, email, hp, address) values
('lucky777','Rlacjawl7$','김첨지','lucky777@daum.com','010-7777-7777','남원시');

commit;