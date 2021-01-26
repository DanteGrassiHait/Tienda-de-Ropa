/*
Database - TiendaDeRopa
*/
create database tienda_de_ropa;
use tienda_de_ropa;

create table if not exists Ropa(
	id_ropa int auto_increment,
    marca varchar(25),
    modelo varchar(25),
    color varchar(15),
    talle varchar(10),
    genero varchar(10),
    paraEdad varchar(15),
    
    constraint pk_id_ropas primary key(id_ropa));
    
create table if not exists Buzo(
	id_buzo int,
    tipo varchar(15),
    capucha boolean,
    bolsillos boolean,
    
    constraint fk_id_buzo foreign key (id_buzo) references Ropa(id_ropa));

create table if not exists Bermuda(
	id_bermuda int,
    tipo varchar(15),
    corte varchar(15),
    
    constraint fk_id_bermuda foreign key (id_bermuda) references Ropa(id_ropa));