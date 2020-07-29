package com.phos.jokegenerationapp.controllers;

import com.phos.jokegenerationapp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping(value = {"","/"})
    public String getJoke(Model model){

        model.addAttribute("joke",jokeService.newJoke());

        return "index";
    }
}
