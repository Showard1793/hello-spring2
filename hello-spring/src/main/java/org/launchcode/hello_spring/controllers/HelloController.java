package org.launchcode.hello_spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class HelloController {

    //Handles request at path /hello
//    @GetMapping("hello")
//
//    public String hello(){
//        return "Hello, Spring!";
//    }

    //Handles request at path /goodbye
    @GetMapping("goodbye")

    public String goodbye(){
        return "Goodbye, Spring!";
    }

    // Responds to get requests at /hello?coder=LaunchCoder
    @GetMapping("hello")
    @ResponseBody
    public String hello(@RequestParam String coder) {
        return "Hello, " + coder + "!";
    }

    //Handles request of the form /hello?name=Launchcode using methods
//    @RequestMapping(method = {RequestMethod.GET,RequestMethod.POST}, value = "hello")
//
//    public String helloWithQueryParam(@RequestParam String name){
//        return "Hello, " + name + "!";
//    }

    //Handles requests of the form /hello/Launchcode
    @GetMapping("hello/{name}")

    public String helloWithPathParam(@PathVariable String name){
        return "Hello, " + name + "!";
    }

    //Handles requests as a displayed form on website
    @GetMapping("form")

    public String helloForm(){
        return "<html>" +
                "<body>" +
                "<form action = 'hello' method = 'post'>" + //Submit a request to "hello"
                "<input type = 'text' name = 'name'>" +
                "<input type = 'submit' style = 'color:red' value = 'Greet me!'>" +
                "</form>" +
                "</body>" +
                "</html>";

    }


}
