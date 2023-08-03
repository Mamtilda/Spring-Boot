package com.example.MyFirstAPIApplication;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class EmployeeDatabase {

    @GetMapping("/employees")
    public ResponseEntity<String> employee() {
        String employeeTitle = "<center><h1>This is an employees API endpoint!</h1></center>";
        return ResponseEntity.ok().body(employeeTitle);


    }
    @PostMapping("/employees")
    public ResponseEntity<String> addEmployee(@RequestBody String newEmployee) {
        if (newEmployee == null || newEmployee.trim().isEmpty()) {
            throw new IllegalArgumentException("Employee list cannot be empty!");
        }
        return ResponseEntity.ok("Employees List: " + newEmployee);
    }
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handlePostEmployeeError(IllegalArgumentException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());

    }
    //This is just a test. Just to learn how to add images to your API endpoint
    @GetMapping("/puppy")
    //To write HTML code within your Spring application, you need to use the ResponseEntity<String> keyword
    public ResponseEntity<String> getPuppy() {
        //Create variables for your image or video
        //Assign the value to the variable which would be the URL of your image or video
        String title = "This is a picture of a maltese puppy!";
        String imageURL = "https://www.dog-learn.com/dog-breeds/maltese/images/maltese-u2.jpg";

        //Create another variable and assign the HTML code to add the above variables to
        String responseText = "<center><h1>" + title + "</h1></center>" + "<center><img src='" + imageURL + "' alt='Maltese Puppy' width= 660px height= 490px></center>";

        //Return the above. The below command is needed so that the image and/or text will be displayed
        return ResponseEntity.ok().body(responseText);

    }




}
