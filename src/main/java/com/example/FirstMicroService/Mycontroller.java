package com.example.FirstMicroService;

//first microservice
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//on terminal please run below command
// mvn spring-boot:run
//after running above command run http://localhost:8080/hi
//http://localhost:8082/hello default port
//in application.properties add port 8082
//video https://www.youtube.com/watch?v=c3gKseNAs9w&t=1587s
@RestController
public class Mycontroller {
    @GetMapping("/hello")
    public String getfirstoutput(){
        return "my first microservice project.. I did it really good!";
    }
    @GetMapping("/hi")
    public String getresult(){
        return "WOW";
    }

}
