CREATE DATABASE Aula_20230502;

USE Aula_20230502;

CREATE TABLE TB_Marca
(
Cod_Marca int,
Situacao char(1), 
Desc_Marca varchar(15)
);

/* COMENTÁRIO */

DESCRIBE TB_Marca;

DROP TABLE TB_Marca; /* APAGAR TABELA */

CREATE TABLE TB_Marca
(
Cod_Marca int  NOT NULL,
Situacao char(1) NOT NULL, 
Desc_Marca varchar(15) NOT NULL
);