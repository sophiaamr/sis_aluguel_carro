CREATE DATABASE sisAluguel;
USE sisAluguel;

CREATE TABLE usuario (
    id INT AUTO_INCREMENT PRIMARY KEY,  
    nome VARCHAR(255) NOT NULL,          
    cpf VARCHAR(14) NOT NULL,            
    rg VARCHAR(20),                      
    profissao VARCHAR(100),              
    entidade_empregadora VARCHAR(255),
    rendimento_auferido DOUBLE 
);

ALTER TABLE usuario
ADD COLUMN tipo ENUM('cliente', 'agente') NOT NULL;

