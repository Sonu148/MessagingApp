package com.training.hellomessagingapp.controlller;
import com.training.hellomessagingapp.UserData;
import org.springframework.web.bind.annotation.*;

@RestController
public class MessageAppController {

    // Method for the simply messaging
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello from BridgeLabz!!!";
    }

    // Method for the hello message with name
    @GetMapping("/hello/query")
    public String sayHelloQuery(@RequestParam (value= "name") String name){
        return "Hello "+name+" from BridgeLabz!!!";
    }

    // Method for message with pass name as path variable
    @RequestMapping("/hello/path/{name}")
    public String hello(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz!";
    }

    // Method for handling POST request with request body
    @PostMapping("/hello/post")
    public String hello(@RequestBody UserData user) {
        String firstName = user.getFirstName();
        String lastName = user.getLastName();
        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }
}
