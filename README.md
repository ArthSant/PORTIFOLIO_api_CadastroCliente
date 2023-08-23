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
não irá funcionar.
Após abrir o arquivo application.properties na pasta resources, digite as seguintes linhas de código: </br>
spring.datasource.url=jdbc:mysql://localhost:3306/INSIRA O NOME DO BANCO DE DADOS AQUI </br>
spring.datasource.username=INSIRA SEU NOME DE USUÁRIO NO MYSQL AQUI </br>
spring.datasource.password=INSIRA SUA SENHA DO MYSQL AQUI </br>

Exemplo: </br>
spring.datasource.url=jdbc:mysql://localhost:3306/api_CadastroCliente  </br>
spring.datasource.username=Fernando  </br>
spring.datasource.password=123456  </br>

Com o arquivo editado, execute o arquivo CadastroClienteApplication.java que se encontra na pasta src/main/java no pacote apiCrudCadastroCliente. Com a aplicação em execução, abra o insomnia ou postman
e teste as requisições put,get,post e delete. Lembrando que os dados precisam ser preenchidos em formatos JSON, exemplo de uma requisição POST: </br>

{ </br>  
  "nome":"fulano de tal",  </br>
  "cpf":"12345678910",</br>
  "email":"fulano@gmail.com",</br>
  "endereco": {</br>
     "cidade":"sao paulo",</br>
     "uf":"sp",</br>
     "rua":"rua tal":,</br>
     "complemento":"complemento vem aqui"</br>
  }</br>
}</br>

Após disparar a requesição POST com este corpo, você pode verificar o registro usando um método GET, basta mudar o tipo de requisição no insomnia ou postman. Não é necessário enviar nenhum dado no corpo do GET.
