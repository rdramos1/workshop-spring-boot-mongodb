# 🗄️ Workshop Spring Boot + MongoDB

![Java](https://img.shields.io/badge/Java-17-red) ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.0-brightgreen) ![MongoDB](https://img.shields.io/badge/MongoDB-6.0-green) [![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)

---

## 📘 Description

This project is a RESTful API developed with Spring Boot 3 and MongoDB, implementing CRUD operations for managing users, posts, and comments.
It was developed as a practical exercise during Nélio Alves's course on Udemy.

---

## 🧩 Technologies Used

- Java 17
- Spring Boot 3
- Spring Data MongoDB
- MongoDB 
- Maven / Wrapper
- Postman 

---

## ▶️  How to Run the Project Locally

### Prerequisites
- Java 17+
- Maven 
- MongoDB running locally or access to a MongoDB (Atlas) cluster

### Steps
```bash
# Clone the repository
git clone https://github.com/rdramos1/workshop-spring-boot-mongodb.git

# Enter the project directory
cd workshop-spring-boot-mongodb

# Run with the wrapper (Linux / macOS) or with Maven installed
./mvnw spring-boot:run
# or
mvn spring-boot:run

```

> The application will be available at: http://localhost:8080

---

## 🌐 Endpoints Principais (exemplos)

| Method | Endpoint | Description |
|--------|----------|-----------|
| GET    | `/users` | List all users |
| GET    | `/users/{id}` | Get user by id |
| POST   | `/users` | Create user  |
| DELETE | `/users/{id}` | 	Delete user |
| GET    | `/posts` | List posts |
| GET    | `/posts/{id}` | 	Get post by id |
| POST   | `/posts` | Create post |

---

## 🧠 Concepts and practices applied

- Layered architecture: Controller → Service → Repository.
- Use of DTOs for data input/output.
- Integration with MongoDB via Spring Data MongoDB.
- Custom queries with `@Query`** (Spring Data) to retrieve documents with specific criteria.
- Exception handling and appropriate HTTP responses.
- Good practices for package organization and responsibility.

### Example of @Query used in the project (Spring Data MongoDB)
```java
public interface PostRepository extends MongoRepository<Post, String> {

    // search for a title containing the text (case-insensitive) using MongoDB regex
    @Query("{ 'title': { $regex: ?0, $options: 'i' } }")
    List<Post> findByTitleContainingIgnoreCase(String text);

    // search for posts by author id
    @Query("{ 'author.id': ?0 }")
    List<Post> findByAuthorId(String userId);
}
```

> Note: in the project, there are examples of custom queries in the `repository` to filter posts by author and by title content using `@Query`.

---

## 📄 Licença

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more details.

---

## 👤 Autor

**Ricardo Davi Ramos Figueiredo** (professionally  **Ricardo Ramos**)  
- GitHub: https://github.com/rdramos1  
- LinkedIn: https://www.linkedin.com/in/rdramos1  
- Email: dev.ricardoramos@gmail.com

---
