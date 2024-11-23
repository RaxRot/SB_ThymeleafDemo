package com.raxrot.rfthymeleaftutorial.controller;

import com.raxrot.rfthymeleaftutorial.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    //handle method to handle variable-expression request
    @GetMapping("variable-expression")
    public String variableExpression(Model model) {
        User user = new User("Vlad","das@gmail.com","Admin","Male");
        model.addAttribute("user", user);
        return "variable-expression";
    }
}