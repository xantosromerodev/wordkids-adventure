package com.wordkids.service;

import com.wordkids.model.Word;

import java.util.ArrayList;
import java.util.List;

public class GameService {

    private final List<Word> words;

    public GameService() {

        words = new ArrayList<>();

        loadWords();

    }

    private void loadWords() {

        words.add(
                new Word(
                        "APPLE",
                        "/images/apple.jpg",
                        List.of("APPLE", "DOG", "CAR"),
                        "APPLE"
                )
        );

        words.add(
                new Word(
                        "DOG",
                        "/images/dog.jpg",
                        List.of("DOG", "BANANA", "HOUSE"),
                        "DOG"
                )
        );

    }

    public List<Word> getWords() {

        return words;

    }
}