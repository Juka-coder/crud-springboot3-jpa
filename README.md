# 🍃 CRUD com Spring Boot 3 e JPA

## 📌 Descrição 
Aplicação básica de CRUD utilizando Spring Boot 3, JPA e um banco de dados relacional H2.

## 🔧 Tecnologias
- Java 17+
- Programação Orientada a Objetos
- Spring Boot
- Spring Data JPA
- Banco de Dados H2
- Maven

## ▶️ Como Executar

   ```bash
   mvn spring-boot:run
   ```

## 🎯 Funcionalidades implementadas
- Criação de entidades 
- Repositórios Spring Data 
- Serviços
- Controladores REST com endpoints CRUD
- Manipulação de exceções

## 🛠 Endpoints da API

### Entidade User

| Método | Endpoint                | Descrição                          |
|--------|-------------------------|------------------------------------|
| GET    | /api/users              | Retorna todos os registros         |
| GET    | /api/users/{id}         | Retorna um registro pelo ID        |
| POST   | /api/users              | Cria um novo registro              |
| PUT    | /api/users/{id}         | Atualiza um registro existente     |
| DELETE | /api/users/{id}         | Remove um registro pelo ID         |

### Entidade Category
| Método | Endpoint                | Descrição                          |
|--------|-------------------------|------------------------------------|
| GET    | /api/categories         | Retorna todas as categorias        |
| GET    | /api/categories/{id}    | Retorna uma categoria pelo ID      |

### Entidade Product
| Método | Endpoint                | Descrição                          |
|--------|-------------------------|------------------------------------|
| GET    | /api/products           | Retorna todos os produtos          |
| GET    | /api/products/{id}      | Retorna um produto pelo ID         |

### Entidade Order
| Método | Endpoint                | Descrição                          |
|--------|-------------------------|------------------------------------|
| GET    | /api/orders             | Retorna todos os pedidos           |
| GET    | /api/orders/{id}        | Retorna um pedido pelo ID          |

## 📂 Estrutura do Projeto
```
srs/
└── main/
    ├── java/
    │   └── com/github/juka_coder/crud_spring/
    │       ├── config/          # Configurações do projeto (Spring, segurança, etc.)
    │       ├── entities/        # Classes de entidade do banco de dados
    │       ├── repositories/    # Interfaces de repositórios Spring Data JPA
    │       ├── services/        # Serviços com regras de negócio
    │       └── CrudSpringApplication.java  # Classe principal
    └── resources/               # Arquivos de configuração (application.properties, etc.)
```

## 👤 Autor
**João Daniel (Juka-coder)**  
[LinkedIn](https://www.linkedin.com/in/jo%C3%A3o-daniel2/) | [GitHub](https://github.com/Juka-coder)

## 📜 Licença
Este projeto é de uso educacional, desenvolvido para fins de estudo.
