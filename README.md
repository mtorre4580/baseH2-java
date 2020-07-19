# baseH2-java

H2 sample database with java data, a bat is included to allow connections over TCP

H2 base (http://www.h2database.com/) with spring (https://spring.io/) data is used, a test with junit (http://junit.org/) is performed

A class for a small office attached, the database installer found on the same page is created.

Query table:

create table usuario(
 nombre char(20) not null,
edad int not null,
id int auto_increment,
primary key(id));
Facts H2 database

Controlador :org.h2.Driver //
URL: jdbc:h2:tcp://localhost/~/recibo  //
Nombre Usuario: admin //
Password: admin 
