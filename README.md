# Student CRUD Application

A simple full-stack Student Management CRUD application built using **Spring Boot** for the backend and **HTML, CSS, and JavaScript** for the frontend.

---

## Features

- Create Student
- Read Student by ID
- Update Student
- Delete Student
- Request Validation
- Global Exception Handling
- RESTful APIs
- Interactive Frontend
- HashMap-based Repository (No Database)

---

## Tech Stack

### Backend
- Java 17
- Spring Boot
- Spring MVC
- Maven
- Lombok
- Jakarta Validation

### Frontend
- HTML5
- CSS3
- JavaScript (Vanilla)
- Fetch API

---

## Project Structure

```
Student-CRUD
│
├── backend
│   ├── src
│   ├── pom.xml
│   └── ...
│
└── frontend
    ├── css
    ├── js
    └── index.html
```

---

## API Endpoints

| Method | Endpoint | Description |
|---------|----------|-------------|
| POST | `/students/create` | Create Student |
| GET | `/students/read/{id}` | Read Student |
| PUT | `/students/update/{id}` | Update Student |
| DELETE | `/students/delete/{id}` | Delete Student |

---

## How to Run

### 1. Clone Repository

```bash
git clone <repository-url>
```

---

### 2. Run Backend

Open terminal.

```bash
cd backend
```

Run the application.

Windows

```bash
.\mvnw spring-boot:run
```

or

```bash
mvn spring-boot:run
```

Backend starts at

```
http://localhost:8080
```

---

### 3. Run Frontend

Open the **frontend** folder in VS Code.

Open **index.html**

Start using the **Live Server** extension.

Frontend runs at

```
http://127.0.0.1:5500
```

---

## CORS Configuration

Since frontend and backend run on different ports during development, CORS must be enabled in the backend.

Example:

```java
@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {

        registry.addMapping("/**")
                .allowedOrigins("http://127.0.0.1:5500")
                .allowedMethods("*")
                .allowedHeaders("*");

    }

}
```

---

## Sample Student

```json
{
    "id": 1,
    "firstName": "John",
    "lastName": "Doe",
    "email": "johndoe@example.com",
    "phone": "99999999999",
    "branch": "CSBS"
}
```

---

## Learning Objectives

This project demonstrates:

- Spring Boot Project Structure
- Layered Architecture
- REST APIs
- DTO Pattern
- Mapper Pattern
- Constructor Injection
- Exception Handling
- Validation
- Frontend & Backend Communication
- Fetch API
- CORS Configuration

---

## Future Improvements

- MySQL Integration
- Spring Data JPA
- Swagger/OpenAPI
- Spring Security
- JWT Authentication
- Docker
- React Frontend

---

## Author

**Shreyesh Singh**