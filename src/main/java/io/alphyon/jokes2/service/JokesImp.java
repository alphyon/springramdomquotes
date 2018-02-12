package io.alphyon.jokes2.service;

import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Controller
public class JokesImp implements IJoke {
    @Override
    public String getJoke(int id) {
        List<String> quotes = new ArrayList<>();
        String res = new String();
        quotes.add("Toc Toc, ! es, Nadie, Nadie quien ......");
        quotes.add("Toc Toc, @ es, Nadie, Nadie quien ......");
        quotes.add("Toc Toc, # es, Nadie, Nadie quien ......");
        quotes.add("Toc Toc, $ es, Nadie, Nadie quien ......");
        quotes.add("Toc Toc, % es, Nadie, Nadie quien ......");
        quotes.add("Toc Toc, ^ es, Nadie, Nadie quien ......");
        quotes.add("Toc Toc, & es, Nadie, Nadie quien ......");

        if(quotes.get(id).isEmpty()){
            res = "No se encontro broma";
        }else{
            res = quotes.get(id);
        }

        return res;
    }
}
