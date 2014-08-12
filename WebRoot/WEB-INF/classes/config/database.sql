
--用户表
create table thl.user(id int auto_increment primary key,name varchar(20),loginName varchar(20),password varchar(30),gender varchar(4),age int,email varchar(20),
description varchar(40),pic varchar(40));



---文章类型
create table thl.atype(id int auto_increment primary key,name varchar(20),createTime timestamp);


-- 文章表(status 发布状态0未发布，1发布
create table thl.article(id varchar(40) primary key,title varchar(20),content text,releaseTime timestamp,status smallint,publisherId int,articleTypeId int,
foreign key(publisherId) references user(id) on delete cascade on update cascade,foreign key(articleTypeId) references aType(id) on delete cascade on update cascade);

--文章类型和文章的关系表(多对多关系)
create table  thl.article_type(id varchar(40) primary key,articleId varchar(40) not null,typeId  int not null,
foreign key(articleId) references article(id) on delete cascade on update cascade,foreign key(typeId) references atype(id) on delete cascade on update cascade);
