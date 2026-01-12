# MovieFlix API

API RESTful desenvolvida para gerenciar um catálogo de filmes e serviços de streaming, com foco principal em segurança e autenticação de usuários via tokens.

**Projeto ainda em desenvolvimento

## Tecnologias Utilizadas

* **Java** & **Spring Boot**
* **Spring Security** (Controle de autenticação e autorização)
* **JWT (JSON Web Token)** (Gerenciamento de sessões stateless)
* **PostgreSQL** (Banco de dados relacional)
* **Docker** (Containerização do banco de dados)
* **Flyway** (Versionamento e migração do banco de dados)
* **Swagger/OpenAPI** (Documentação da API)

## Arquitetura e Design

O projeto foi estruturado pensando em escalabilidade e segurança:

* **Arquitetura em Camadas:** Separação clara entre Controllers, Services e Repositories.
* **Segurança Declarativa:** Configuração de proteção de rotas baseada em roles/permissões.
* **Tratamento de Exceções:** Manipulação global de erros para respostas HTTP consistentes.
* **Migrations:** Uso do Flyway para garantir a integridade e evolução do esquema do banco de dados.

## Funcionalidades

* **Autenticação e Autorização:** Cadastro de usuários e login seguro com geração de Token JWT.
* **Gestão de Catálogo:** Cadastro e listagem de Filmes, Categorias e Serviços de Streaming.
* **Proteção de Rotas:** Endpoints protegidos que exigem autenticação via Bearer Token.
* **Relacionamentos:** Estruturação complexa de dados entre filmes e streamings.

---
*Projeto desenvolvido com foco em Spring Security e arquitetura backend moderna.*
