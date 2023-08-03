# Spring-Boot

This uses the prebuilt configuration of Spring Initializr. Apart from prebuilt dependencies and the actual full setup of Spring Boot, everything else was coded from scratch.

To run Spring Boot as it uses Spring Initializr setup, run ./mvnw spring-boot:run in the terminal (or IDE terminal). 


Post API endpoint tested in Postman. Created a body in JSON format. See ApiPost.txt for the response.

Added error handling to test that when there is no data in the Employees database, user should get 400 Bad Request status with message "Employee list cannot be empty!"
See employees_error-handling.txt for the output result when tested in Postman.
