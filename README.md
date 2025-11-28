<h1>Dao-JDBC</h1>

Projeto CRUD para acesso ao Banco de Dados Mysql. O projeto contém as operações básicas de toda lógica CRUD; insert, delete, update, reade.
<br><br>
Tecnologias do projeto:<br>
<img src="imagens/PNG%20java.png?" width="40"  alt="Linguagem Java">
<img src="imagens/MySQL.png" width=40 > 
<img src="imagens/JDBC%20java.png" width=55 height=35>

<h2>Pré-Requisitos</h2>
* JDK: Versão 11 ou superior instalada.
* Banco de Dados: Servidor MySQL rodando.
* Driver: O projeto requer o driver JDBC do MySQL 


Script SQL para criar o banco de dados
```sql
CREATE DATABASE NomeBancoDeDados;
USE NomeBancoDeDados;


CREATE TABLE department (
    Id INT AUTO_INCREMENT PRIMARY KEY, 
    Name VARCHAR(60)
);

CREATE TABLE seller (
    Id INT AUTO_INCREMENT PRIMARY KEY, 
    Name VARCHAR(100), 
    Email VARCHAR(100) UNIQUE, 
    BirthDate DATE, 
    BaseSalary DECIMAL(10, 2), 
    departmentId INT, 
    FOREIGN KEY (departmentId) REFERENCES department(Id)
);
```

<h2>Como rodar o projeto</h2>
Clone o repositório.

* Execute o script SQL acima no MySQL.
* onfigure a dependência do driver JDBC,

* Ajuste os parâmetros de conexão no código-fonte para refletir seu usuário e senha.
* Execute a classe principal do projeto.




