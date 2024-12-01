# BetfairBootcamp Assignment - Design Pattern integration in real-world scenario

The **Educational Learning Platform** is a simple Spring Boot application designed to facilitate online learning. It enables:

- **Course Management**: Create and manage courses with various types of educational content.
- **Content Types**: Support for presentations, bibliographies, assignments, quizzes, and possibility to add more.
- **Notifications**: Notify students when new content is available in their courses.

This assignment implements **design patterns** such as **Factory Method** (for creating different types of content) and **Observer** (for notifying students).


---

##  **Possible Enhancements**
1. **User Authentication & Authorization**:
    - Integrate **Spring Security** for user roles (admin, teacher, student).
    - Implement **JWT** for token-based authentication.
2. **Analytics Dashboard**:
    - Provide insights on student progress.
    - Track performance metrics for courses and learners.
3. **Error Handling Addition**:
    - Add **Custom Exception Classes** for different error scenarios.

## **Further Development**
- **Unit Testing**:
    - Use **JUnit** and **Mockito** for service and controller tests.

- **Frontend Integration**:
    - Create a React or Angular app to serve as the frontend for interacting with the backend.

- **Microservices Architecture**:
    - Decompose the application into **smaller services** (e.g., User Service, Course Service, Notification Service).
- **Dockerization**:
    - Containerize the application using **Docker** for easy deployment and scaling.

---

## **Commands to Run the Application**

### **Using Maven**

1. **Build the project**:
   ```bash
   mvn clean install
   ```
2. **Run the application**:
   ```bash
    mvn spring-boot:run
    ```

## **Example Postman Command**

###  Get Content by Type
- **Request**: `GET /learning/content/{type}`
- **Example**: `http://localhost:8080/learning/content/quiz`

  **Response:**
  ```json
  {
    "id": 1,
    "type": "quiz",
    "title": "Java Quiz",
    "description": "Quiz content",
    "contentDetails": "This is a Java Quiz"
    }