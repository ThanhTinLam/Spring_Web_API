package com.example.spring_web_api.test;

import org.springframework.web.bind.annotation.*;

class User {
    public  String username;
    public String password;

}
@RestController
class EmployeeController {
    private Employee e = new Employee();

    @GetMapping("/login")
    public String login(@RequestParam(name = "username", required = false, defaultValue = "Stranger") String username,
                        @RequestParam(name = "password", required = false, defaultValue = "Stranger") String password) {


        return "User name is " + username + "Password is" + password;
    }

    @PostMapping("/loginV2")
    String loginV2 (@RequestBody User user) {
        return "User name is " + user.username + "Password is" + user.password;
    }

    @GetMapping("/employees")
    public String welcomeAsHTML() {
        return e.userName;
    }

    @PostMapping("/employees")
    public String newEmployee() {
        e = new Employee();
        e.userName = "xyz";
        return e.userName;

    }
}