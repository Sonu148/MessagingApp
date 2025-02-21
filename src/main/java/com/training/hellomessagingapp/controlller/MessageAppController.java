package com.training.hellomessagingapp.controlller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageAppController {

    // Method for the simply messaging
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello from BridgeLabz!!!";
    }

}
