package com.thecaveman.form.springform.controllers;

import com.thecaveman.form.springform.model.Caveman;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class CavemanController {

    @GetMapping("/register") //localhost:8080/register
    public String showForm(Model model){
        Caveman caveman = new Caveman();
        model.addAttribute("caveman", caveman);

        List<String> jobList = Arrays.asList("Software Developer","Yakuza","Mafia","Drug Dealer","Prostitute");
        model.addAttribute("jobList",jobList);
        return "form_register";
    }

    @PostMapping("/register")
    public String submitForm(@ModelAttribute("caveman") Caveman caveman){
        System.out.println(caveman.toString());
        return "register_completed";
    }

}
