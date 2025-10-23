# 🌐 WebServices - Spring Boot 3 + JPA + Hibernate  

Projeto desenvolvido como estudo de **APIs RESTful com Spring Boot**, utilizando persistência de dados com **JPA/Hibernate** e banco de dados em memória (**H2**).  

---

## 📌 Índice  
- [Sobre o projeto](#sobre-o-projeto-)  
- [Como rodar](#como-rodar-)  
- [Funcionalidades](#funcionalidades-)  
- [Tecnologias utilizadas](#tecnologias-utilizadas-)  
- [Estrutura do projeto](#estrutura-do-projeto-)  
- [Rotas da API](#rotas-da-api-)  
- [Exceções personalizadas](#exceções-personalizadas-)  
- [Licença](#licença-)  

---

## 🔗 Sobre o projeto  

O **WebServices** é uma API REST desenvolvida em **Java + Spring Boot 3**, projetada para simular operações de um sistema de pedidos.  

O projeto foi construído seguindo boas práticas de arquitetura e código limpo, utilizando:  

- **Spring Web** para construção das rotas REST.  
- **Spring Data JPA** para persistência de dados.  
- **H2 Database** como banco de dados em memória.  
- **Camadas organizadas (Controller, Service, Repository)** seguindo o padrão MVC.

---

## 📘 Modelo de Domínio (Domain Model) – Webservices API 

<img src="https://imgur.com/nRgDt8t.png" alt="UML Projeto YouTube" width="800"/>

---

## 🔧 Como rodar  

### Pré-requisitos  
- **Java 21+** ☕  
- **Maven** instalado  

### Rodando localmente  

1. Clone o repositório:  
   ```bash
   git clone https://github.com/hebertesteves/webservices-springboot3-jpa.git
   cd webservices-springboot3-jpa
   ```

2. Compile e rode com Maven:  
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

3. O projeto estará disponível em:  
   ```
   http://localhost:8080
   ```

---

## ✅ Funcionalidades  

- CRUD de **usuários**.  
- CRUD de **pedidos (orders)**.  
- CRUD de **categorias e produtos** com relacionamentos.  
- Relacionamentos entre entidades:  
  - `User` ↔ `Order` (Um-para-Muitos).  
  - `Product` ↔ `Category` (Muitos-para-Muitos).  
  - `Order` ↔ `OrderItem` ↔ `Product` (Relacionamento de associação).  
- Tratamento de exceções personalizadas.  

---

## 🛠️ Tecnologias utilizadas  

- **Java 21**  
- **Spring Boot 3**  
- **Spring Web**  
- **Spring Data JPA**  
- **Hibernate**  
- **H2 Database**  
- **Maven**  

---

## 📂 Estrutura do projeto  

```
webservices-springboot3-jpa/
 ┣ 📂 src/main/java/com/hebertesteves/webservices
 ┃ ┣ 📂 entities       → Classes de entidades (User, Order, Product, Category, OrderItem)  
 ┃ ┣ 📂 repositories  → Interfaces Repository (UserRepository, OrderRepository etc.)  
 ┃ ┣ 📂 services      → Camada de serviços contendo a lógica de negócio  
 ┃ ┣ 📂 resources     → Controllers REST (UserResource, OrderResource etc.)  
 ┃ ┣ 📂 services/exceptions → Exceções personalizadas  
 ┣ 📂 resources
 ┃ ┣ application.properties → Configuração do banco H2  
 ┣ pom.xml
```

---

## 🔀 Rotas da API  

### Usuários  
- `GET /users/` → Listar todos os usuários  
- `GET /users/{id}` → Buscar usuário por ID  
- `POST /users/` → Criar usuário  
- `PUT /users/{id}` → Atualizar usuário  
- `DELETE /users/{id}` → Remover usuário  

### Pedidos  
- `GET /orders/` → Listar pedidos  
- `GET /orders/{id}` → Buscar pedido por ID  

### Produtos e Categorias  
- `GET /products/` → Listar produtos  
- `GET /categories/` → Listar categorias  

---

## ⚠️ Exceções personalizadas  

O sistema conta com tratamento de exceções para melhorar a experiência e padronizar as respostas de erro da API:  

- `ResourceNotFoundException` → Lançada quando um recurso não é encontrado no banco.  
- `DatabaseException` → Lançada em erros relacionados a integridade de banco de dados.  
- `EmailAlreadyExistsException` → Lançada ao tentar cadastrar um usuário com e-mail já existente.  

Essas exceções são capturadas globalmente e retornam respostas JSON padronizadas para o cliente.  

---

## 📜 Licença  

Este projeto está sob a licença **MIT** – sinta-se livre para usar, estudar e contribuir.  
