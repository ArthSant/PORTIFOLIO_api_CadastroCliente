## CRUD - Api simples de cadastro de clientes com Java,Spring boot e MySQL.

# Sobre o projeto
Este CRUD é uma aplicação back-end desenvolvida para exercitar meu aprendizado nas tecnologias utilziadas. A aplicação consiste em um
cadastro de clientes de uma determinada loja fictícia, onde ela recebe os dados via JSON e efetua as operações de acordo com as requisições
http como: POST,GET,PUT e DELETE.

# Pré-Requisito
Para testar e utlizar a api é imporante que você tenha as seguintes ferramentas instaladas no seu computador:
* Java 17 ou superior.
* Um software para mandar requisições http como o Insomnia e Postman.
* Uma IDE ou editor de texto para JAVA (Aconselho o IntelliJ,Eclipse ou VSCode).
* MySQL.

# Como instalar
Para utilizar a aplicação é bem simples, basta baixar o projeto diretamente do github ou usar um git clone para clonar todo o repositório em seu computador. Após baixar o projeto,
extraia os arquivos(caso necessário) e abra a pasta do projeto em sua IDE ou editor de preferência.

# Utilizando a API
Com o projeto aberto em sua IDE ou editor, é de EXTREMA importância que o usuário configure o arquivo application.properties que se localiza na pasta resources, caso contrário a aplicação
não ira funcionar.
Após abrir o arquivo application.properties na pasta resources, digite as seguintes linhas de código:
spring.datasource.url=jdbc:mysql://localhost:3306/INSIRA O NOME DO BANCO DE DADOS AQUI
spring.datasource.username=INSIRA SEU NOME DE USUÁRIO NO MYSQL AQUI
spring.datasource.password=INSIRA SUA SENHA DO MYSQL AQUI

Exemplo
spring.datasource.url=jdbc:mysql://localhost:3306/api_CadastroCliente
spring.datasource.username=Fernando
spring.datasource.password=123456
