# Projeto Web Services com Spring Boot e JPA/Hibernate

## Descrição
Este projeto consiste na criação de um serviço web utilizando Spring Boot, Java e JPA/Hibernate para persistência de dados. O objetivo principal é desenvolver uma aplicação organizada em camadas, com operações básicas de CRUD, tratamento de exceções e integração com banco de dados em memória (H2).

## Objetivos
- Criar projeto Spring Boot em Java  
- Implementar modelo de domínio  
- Estruturar camadas lógicas: Resource (Controller), Service, Repository  
- Configurar banco de dados de teste H2  
- Povoar o banco de dados automaticamente  
- Implementar operações CRUD (Create, Retrieve, Update, Delete)  
- Implementar tratamento de exceções para a API  

## Tecnologias utilizadas
- Java 17+  
- Spring Boot  
- Spring Data JPA / Hibernate  
- Banco de dados H2 (em memória)  
- Maven 

## Como executar o projeto

1. Clone este repositório:
   ```bash
   git clone https://github.com/gabriel-vianna1/projetoweb-springboot.git
2. Execute o projeto usando Maven
   ./mvnw spring-boot:run
3. O serviço estará disponível em: http://localhost:8080
4. População do banco
O banco H2 é povoado automaticamente com dados iniciais durante a inicialização da aplicação, facilitando os testes.

5.Tratamento de exceções
O projeto implementa tratamento padronizado de erros, garantindo respostas claras para requisições inválidas ou falhas internas.

6.Observações
Banco de dados em memória H2 é resetado a cada reinício do servidor.

7.Para visualizar o console do H2, acesse: http://localhost:8080/h2-console

