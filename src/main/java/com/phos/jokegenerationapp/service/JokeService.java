package com.phos.jokegenerationapp.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeService {

    private ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();

    public String newJoke(){
        return chuckNorrisQuotes.getRandomQuote();
    }
}
