package io.alphyon.jokes2.controllers;


import io.alphyon.jokes2.service.JokesImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {
    private JokesImp jokesImp = new JokesImp();

    @RequestMapping("/")
    public String getJokes(Model model){
        model.addAttribute("joke", jokesImp.getJoke(randomWithRange(0,6)));
        return "jokes";
    }

    int randomWithRange(int min, int max)
    {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }
}
