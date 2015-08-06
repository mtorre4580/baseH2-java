# baseH2-java
Ejemplo de base de datos H2 con java, se incluye un bat para permitir conectarse a traves de tcp

Se utiliza la base de datos H2(http://www.h2database.com/) con spring (https://spring.io/) , se realiza un test con junit(http://junit.org/)

Se adjunta una clase para realizar una pequeña consulta, se crea la base de datos con el instalador que se encuentra en la página del mismo.

Query de la tabla :

create table usuario(
 nombre char(20) not null,
edad int not null,
id int auto_increment,
primary key(id));

Datos de la base de datos H2:

Controlador :org.h2.Driver //
URL: jdbc:h2:tcp://localhost/~/recibo  //
Nombre Usuario: admin //
Password: admin 

Se agrega un bat para poder realizar consultas desde tcp, permitiendo a otras maquinas conectarse.

----------
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
