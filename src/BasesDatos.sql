

create table Usuario(
idUser  serial,
email VARCHAR(30),
pswd VARCHAR(20),
nombre VARCHAR(30),
apellido VARCHAR(30),
colegio VARCHAR(30),
PRIMARY key (idUser)
)

create Table Experiencia(
idExp serial,
nombreExp VARCHAR(30),
curso INTEGER,
asignatura VARCHAR(30),
tema VARCHAR(30),
descripcion VARCHAR(100),
idUser INTEGER,
PRIMARY key (idExp),
FOREIGN key (idUser) REFERENCES Usuario (idUser))

create Table Comentario(
idCom serial,
descripcion VARCHAR(50),
UserLocal INTEGER,
UserExt INTEGER,
PRIMARY key (idCom),
FOREIGN key (UserLocal) REFERENCES Usuario (idUser),
FOREIGN key (UserExt) REFERENCES Usuario (idUser))



create Table Calificacion(

idCal serial,
calificacion INTEGER,
UserLocal INTEGER,
UserExt INTEGER,
PRIMARY key (idCal),
FOREIGN key (UserLocal) REFERENCES Usuario (idUser),
FOREIGN key (UserExt) REFERENCES Usuario (idUser))

