package com.springdemo.demohello;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class SignupController {

    @GetMapping("/signup")
    public String signupPage(Model model) {
        return "signup";
    }

    @GetMapping("/login")
    public String loginPage(){
        return "login";
    }
    @GetMapping("/")
    public String home(){
        return "main";

    }

}
