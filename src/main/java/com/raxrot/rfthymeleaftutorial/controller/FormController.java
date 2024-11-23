package com.raxrot.rfthymeleaftutorial.controller;

import com.raxrot.rfthymeleaftutorial.model.UserForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class FormController {
    //handle method to handle user registration page request
    @GetMapping("/register")
    public String userRegistrationPage(Model model){
        //Empty UserForm to store from data
        UserForm userForm = new UserForm();
        model.addAttribute("userForm", userForm);

        //List of professions
        List<String>listProfessions= Arrays.asList("Developer","Tester","Student");
        model.addAttribute("listProfession", listProfessions);

        return "register-form";
    }

    @PostMapping("/register/save")
    public String saveUserForm(@ModelAttribute("userForm") UserForm userForm, Model model){
        model.addAttribute("userForm", userForm);
        return "register-success";
    }
}
