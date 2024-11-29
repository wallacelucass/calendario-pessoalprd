# Calendário Pessoal

Este é um projeto de uma aplicação de calendário pessoal desenvolvido com Spring Boot, Thymeleaf e FullCalendar. A aplicação permite criar, editar e excluir lembretes, que são exibidos tanto em uma tabela quanto em um calendário interativo.

## Tecnologias Utilizadas

- **Spring Boot:** Framework principal para a construção da aplicação.
- **Thymeleaf:** Template engine para renderizar as páginas HTML.
- **FullCalendar:** Biblioteca JavaScript para exibição do calendário.
- **JPA (Java Persistence API):** Para a persistência dos dados no banco de dados.
- **MySQL:** Banco de dados utilizado.
- **Lombok:** Para reduzir o código boilerplate.

## Estrutura do Projeto

- **Controller:** Gerencia as rotas e a lógica de apresentação (`LembreteController`).
- **Model:** Representa a entidade `Lembrete`.
- **Repository:** Interface para comunicação com o banco de dados (`LembreteRepository`).
- **Service:** Contém a lógica de negócios (`LembreteService`).
- **Views:** Páginas HTML com Thymeleaf para exibição dos dados.

## Instalação e Configuração

1. **Clone o Repositório:**

    ```bash
    git clone https://github.com/wallacelucass/calendario-pessoalprd.git
    cd calendario-pessoalprd
    ```

2. **Configurar o Banco de Dados:**
    - Crie um banco de dados MySQL chamado `calendario_pessoal`.
    - Atualize as configurações no arquivo `application.properties` para apontar para o seu banco de dados MySQL.

3. **Executar a Aplicação:**
    - Execute o comando abaixo para rodar a aplicação:
    
    ```bash
    ./mvnw spring-boot:run
    ```
    
    - Acesse [http://localhost:8080/lembretes](http://localhost:8080/lembretes) no seu navegador.

## Endpoints

- **GET /lembretes:** Exibe todos os lembretes.
- **GET /lembretes/events:** Retorna os lembretes no formato para o FullCalendar.
- **GET /lembretes/novo:** Formulário para adicionar novo lembrete.
- **POST /lembretes:** Salva um novo lembrete.
- **GET /lembretes/editar/{id}:** Formulário para editar um lembrete existente.
- **POST /lembretes/editar/{id}:** Atualiza um lembrete existente.
- **GET /lembretes/deletar/{id}:** Deleta um lembrete.
