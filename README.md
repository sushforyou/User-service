# 👤 User Service

**User Service** is a microservice built with **Spring Boot**, responsible for managing user-related data such as username, password, address, and city.  
It is part of a microservices ecosystem and registers itself with **Eureka Discovery Server** for service discovery.

---

## 🚀 Features

- Create, read, update, and delete (CRUD) users  
- Exposes RESTful APIs for user management  
- Integration with **Eureka Server** for service discovery  
- Built with **Spring Boot JPA & Hibernate**  
- Supports multiple environments via YAML configuration  

---

## 🏗️ Tech Stack

| Layer | Technology |
|-------|-------------|
| Backend | Spring Boot 3+, Java 17 |
| Database | MySQL 8 / H2 (optional for dev/test) |
| ORM | Hibernate / Spring Data JPA |
| Service Discovery | Eureka |
| Build Tool | Maven |
| API Docs | Swagger (optional) |

---

## ⚙️ Configuration

### `application.yml`
```yaml
spring:
  application:
    name: USER-SERVICE

server:
  port: 9092

eureka:
  client:
    service-url:
      defaultZone: http://localhost:8761/eureka/
