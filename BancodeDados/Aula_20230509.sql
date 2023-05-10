CREATE DATABASE BD_AULA1;
USE BD_AULA1;
CREATE DATABASE AULA_20230509;
USE AULA_20230509;
CREATE TABLE TB_Modelo
	(
		Cod_Modelo  INT NOT NULL auto_increment PRIMARY KEY,
        Desc_Modelo VARCHAR(15) NOT NULL,
        Situacao CHAR(1)
	);

DESCRIBE TB_Produto;
DROP TABLE TB_Modelo;
CREATE TABLE TB_Marca
	(
		Cod_Marca  INT NOT NULL auto_increment PRIMARY KEY,
        Desc_Marca VARCHAR(15) NOT NULL,
        Situacao CHAR(1)
	);
CREATE TABLE TB_Produto
	(
		Cod_Produto  INT NOT NULL auto_increment PRIMARY KEY,
        Desc_Produto VARCHAR(25) NOT NULL,
        Situacao CHAR(1),
        Dt_Cadastro DATE NOT NULL,
        Vlr_Venda DECIMAL(7,2) NOT NULL,
        Qtde_Estoque INT NOT NULL,
        Cod_Marca INT NOT NULL,
        Cod_Modelo INT NOT NULL,
        CONSTRAINT LIGACAO_PROD_MARCA
        FOREIGN KEY (Cod_Marca)
        REFERENCES TB_Marca(Cod_Marca),
        CONSTRAINT LIGACAO_PROD_MODELO
        FOREIGN KEY (Cod_Modelo)
        REFERENCES TB_Modelo(Cod_Modelo)
	);
