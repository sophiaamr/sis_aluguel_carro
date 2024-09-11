CREATE DATABASE sisAluguel;
use sisAluguel;
DROP database sisaluguel;

CREATE TABLE IF NOT EXISTS endereco(
	id INT AUTO_INCREMENT PRIMARY KEY, 
	logradouro VARCHAR(100) NOT NULL,
    bairro VARCHAR(50) NOT NULL, 
    cidade VARCHAR(50) NOT NULL, 
    estado VARCHAR(50) NOT NULL, 
    cep VARCHAR(8) NOT NULL, 
    numero INT NOT NULL, 
    complemento VARCHAR(20)
);

CREATE TABLE IF NOT EXISTS usuario (
    idUsuario INT AUTO_INCREMENT PRIMARY KEY,  
    nome VARCHAR(255) NOT NULL,          
    cpf VARCHAR(14) NOT NULL,            
    rg VARCHAR(20), 
    tipo ENUM ('cliente', 'agente') NOT NULL,
    profissao VARCHAR(100),              
    entidade_empregadora VARCHAR(255),
    rendimento_auferido DOUBLE, 
    endereco_id INT,   
    FOREIGN KEY (endereco_id) REFERENCES endereco(id) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS aluguel(
	idAluguel INT AUTO_INCREMENT PRIMARY KEY, 
    valor DOUBLE NOT NULL, 
    metodo_pagamento ENUM ('débito', 'crédito', 'boleto'), 
    numParcela INT,
    idUsuario INT, 
    idVeiculo INT,
    FOREIGN KEY (idUsuario) REFERENCES usuario(idUsuario) ON DELETE CASCADE,
    FOREIGN KEY (idVeiculo) REFERENCES veiculo(idVeiculo) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS veiculo(
	idVeiculo INT AUTO_INCREMENT PRIMARY KEY, 
    matricula VARCHAR(20) NOT NULL, 
    ano INT NOT NULL, 
    marca VARCHAR(100) NOT NULL, 
    modelo VARCHAR(100) NOT NULL, 
    placa VARCHAR(08) NOT NULL
);

CREATE TABLE IF NOT EXISTS contrato(
	idContrato INT AUTO_INCREMENT PRIMARY KEY, 
    idUsuario INT, 
    idAluguel INT, 
    tipo ENUM('crédito', 'assinatura', 'quilometragem') NOT NULL, 
    data_inicio DATE NOT NULL, 
    data_fim DATE, 
    FOREIGN KEY (idUsuario) REFERENCES usuario(idUsuario) ON DELETE CASCADE,
    FOREIGN KEY (idAluguel) REFERENCES aluguel(idAluguel) ON DELETE CASCADE
);