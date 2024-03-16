# User inputform

## Objective
This project aims to create a basic web application that allows users to input data, validate it, store it in a database, retrieve it, and display it in a table format.

## Technologies Used
- Programming Language: Java
- Framework: Spring Boot
- Database: MySQL

## Features
1. **User Input Form**:
   - Create a web form with fields for Id,Name, Email, Age, and Date of Birth.
   - Implement client-side validation to ensure valid email format and positive integer age.
   - Display appropriate error messages for invalid inputs.

2. **Database Setup**:
   - Spring Boot auto-configuration: Database credentials provided in application.properties file.
   - Upon application startup, Spring Boot automatically creates necessary tables based on defined entities.

3. **Data Storage**:
   - Store user data in the database upon form submission.

4. **Data Retrieval**:
   - Implement two endpoints for data retrieval:
     - `/api/users/add`: Endpoint for adding a user.
     - `/api/users/display`: Endpoint for displaying all users stored in the database.

## Getting Started
1. **Installation**:
   - Clone this repository.

2. **Database Setup**:
   - Ensure MySQL is installed and running.
   - Update the `application.properties` file with your MySQL database credentials.

3. **Running the Application**:
   - Run the `UserInputFormApplication.java` class located in `src/main/java` as a Java application.

4. **Usage**:
   - Navigate to the following URLs in your web browser:
     - Add a User: [http://localhost:8080/api/users/add](http://localhost:8080/api/users/add)
     - Display Users: [http://localhost:8080/api/users/display](http://localhost:8080/api/users/display)


