# Library - Sistema de Gerenciamento de Biblioteca

Este é um sistema web de gerenciamento de biblioteca desenvolvido com **Java** e **Spring Boot**. O objetivo do projeto é fornecer funcionalidades essenciais para a administração de uma biblioteca, como cadastro de clientes, cadastro de livros, registro de aluguéis, controle de inventário e pesquisa de livros por categorias e autores.

## Funcionalidades

- **Cadastro de Clientes**: Permite o cadastro de novos clientes que podem alugar livros.
- **Cadastro de Livros**: Permite o registro de livros com informações como título, autor, categoria e disponibilidade.
- **Registro de Aluguéis**: Gerencia o aluguel de livros para os clientes, incluindo a data de retirada e devolução.
- **Controle de Inventário**: Acompanha a disponibilidade de livros na biblioteca, atualizando o status de cada livro após o aluguel ou devolução.
- **Pesquisa de Livros**: Permite a pesquisa de livros por categorias e autores, facilitando a localização de títulos específicos.

## Tecnologias Utilizadas

- **Java 11+**
- **Spring Boot 2.x**
- **Spring Data JPA** (para persistência de dados)
- **MySQL** (banco de dados relacional)
- **Thymeleaf** (para renderização das páginas web)
- **Maven** (para gerenciamento de dependências e build)
- **H2** (opcional para testes em ambiente local)

## Pré-Requisitos

Antes de rodar o projeto, certifique-se de ter as seguintes ferramentas instaladas:

- [Java 11+](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [Maven](https://maven.apache.org/)
- [MySQL](https://www.mysql.com/) (ou use H2 como banco de dados embutido para testes)

## Como Rodar o Projeto

### 1. Clone o repositório

```bash
git clone https://github.com/lucasbpaixao/library
cd library
```

#### 2. Configure o banco de dados
Se você estiver usando o MySQL, crie um banco de dados e configure o arquivo application.properties para a conexão. Exemplo de configuração para MySQL:

``` properties
spring.datasource.url=jdbc:mysql://localhost:3306/library_db
spring.datasource.username=<SEU-USERNAME>
spring.datasource.password=<SUA-SENHA>
spring.jpa.hibernate.ddl-auto=update
```
Ou, se preferir usar o H2 para testes locais, basta deixar a configuração padrão:

``` properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password
spring.jpa.hibernate.ddl-auto=update
```

#### 3. Rode o projeto
Use o Maven para rodar o projeto:

```bash
mvn spring-boot:run
```

#### 4. Acesse o sistema
Após a aplicação estar rodando, acesse o sistema pelo navegador no endereço:

``` bash
http://localhost:8080
```

## Estrutura do Projeto
A estrutura do projeto é organizada da seguinte maneira:

``` bash
src/
 └── main/
      ├── java/
      │    └── com/
      │        └── lucasbpaixao/
      │            └── library/
      │                ├── controller/  # Contém os controladores (endpoints)
      │                ├── model/       # Modelos de dados (entidades)
      │                ├── repository/  # Repositórios (JPA)
      │                └── service/     # Lógica de negócios
      └── resources/
           ├── application.properties  # Configurações do Spring Boot
           ├── static/                 # Arquivos estáticos (CSS, JS)
           ├── templates/              # Templates Thymeleaf (páginas HTML)
           └── data.sql               # Script de inicialização do banco (opcional)
```
