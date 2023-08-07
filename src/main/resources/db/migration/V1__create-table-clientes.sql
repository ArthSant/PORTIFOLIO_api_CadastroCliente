create table cliente (
 id bigint not null auto_increment,
 nome varchar(255) not null,
 email varchar(255) not null unique,
 cpf varchar(20) not null unique,
 cidade varchar(50) not null,
 uf char(2) not null,
 rua varchar(255) not null,
 complemento varchar(255),
 primary key(id)
 
 );