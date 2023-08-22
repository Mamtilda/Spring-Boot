# Spring-Boot

This project involves creating a simple RESTful API for employee management using Java and Spring Boot. The API provides endpoints to manage employee data, including adding new employees and retrieving employee information. The project demonstrates how to structure API endpoints, handle errors, and interact with data using HTTP requests.

## Endpoints

- **GET /employees**: Retrieve a message introducing the employee API.

- **POST /employees**: Add employee data and receive an updated list of employees.

## Setup

1. Clone this repository to your local machine.
2. Open the project in your preferred Java IDE.
3. Run the application to start the API server. In the Java IDE terminal, run the command "run ./mvnw".

## Usage

1. After starting the API server, you can use tools like Postman to interact with the API endpoints.
2. Use a POST request to `/employees` to add new employee data.
3. Use a GET request to `/employees` to retrieve the introductory message.

## Dependencies

- Java
- Spring Boot
- Maven

## Contributions

This project serves as a hands-on exercise to demonstrate creating RESTful API endpoints using Spring Boot. Contributions to enhance the project, add new features, or improve code quality are welcome.

## Future Enhancements

- Implement more CRUD operations (update and delete) for employee data.
- Add data validation and error handling for input fields.
- Explore authentication and authorization mechanisms.

## Disclaimer

This project is for educational purposes and showcases basic API creation using Spring Boot. It's recommended to follow best practices and security guidelines when implementing APIs for production use.

## Additional Notes

Added error handling to test that when there is no data in the Employees database, user should get 400 Bad Request status with message "Employee list cannot be empty!"
See employees_error-handling.txt for the output result when tested in Postman.
