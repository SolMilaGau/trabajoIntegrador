CREATE DATABASE bicicleteria;

USE bicicleteria;

CREATE TABLE Bicicletas (
  codigo INT PRIMARY KEY,
  marca VARCHAR(50) NOT NULL,
  modelo VARCHAR(50) NOT NULL,
  color VARCHAR(50) NOT NULL,
  tipo_bici INT,
  anio_fab INT,
  FOREIGN KEY (tipo_bici) REFERENCES Tipos_de_bicicletas(codigo)
);

CREATE TABLE Tipos_de_bicicletas (
  codigo INT PRIMARY KEY,
  descripcion VARCHAR(50) NOT NULL
);

CREATE TABLE Clientes (
  codigo INT PRIMARY KEY AUTO_INCREMENT,
  nombre VARCHAR(50) NOT NULL,
  apellido VARCHAR(50) NOT NULL,
  telefono VARCHAR(50),
  dni VARCHAR(50) NOT NULL,
  domicilio VARCHAR(50),
  cod_bici INT,
  FOREIGN KEY (cod_bici) REFERENCES Bicicletas(codigo)
);
