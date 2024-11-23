package com.raxrot.rfthymeleaftutorial.controller;

import com.raxrot.rfthymeleaftutorial.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    //handle method to handle variable-expression request
    @GetMapping("variable-expression")
    public String variableExpression(Model model) {
        User user = new User("Vlad","das@gmail.com","Admin","Male");
        model.addAttribute("user", user);
        return "variable-expression";
    }

    //handle method to handle selection-expression request
    @GetMapping("selection-expression")
    public String selectionExpression(Model model) {
        User user = new User("Vlad","das@gmail.com","Admin","Male");
        model.addAttribute("user", user);
        return "selection-expression";
    }

    //handle method to handle message-expression request
    @GetMapping("message-expression")
    public String messageExpression() {
        return "message-expression";
    }

    //handle method to handle link-expression request
    @GetMapping("link-expression")
    public String linkExpression(Model model) {
        model.addAttribute("id",1);
        return "link-expression";
    }

    //handle method to handle fragment-expression request
    @GetMapping("fragment-expression")
        public String fragmentExpression() {
        return "fragment-expression";
    }

    //handle method to handle Looping
    @GetMapping("/users")
    public String users(Model model) {
        User user1 = new User("Vlad","das@gmail.com","Admin","Male");
        User user2 = new User("Dasha","sd@gmail.com","Moder","Female");
        User user3 = new User("Oleg","ol@gmail.com","User","Male");
        List<User>users=new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        model.addAttribute("users", users);
        return "users";
    }

    //handle method to handle if/unless
    @GetMapping("/if-unless")
    public String ifUnless(Model model) {
        User user1 = new User("Vlad","das@gmail.com","ADMIN","Male");
        User user2 = new User("Dasha","sd@gmail.com","MODER","Female");
        User user3 = new User("Oleg","ol@gmail.com","USER","Male");
        List<User>users=new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        model.addAttribute("users", users);
        return "if-unless";
    }

}
