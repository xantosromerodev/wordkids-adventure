package com.wordkids.service;

import com.wordkids.model.Lesson;
import com.wordkids.model.Word;


import java.util.ArrayList;
import java.util.List;

public class LessonManager {

    private static LessonManager instance;

    private List<Lesson> lessons;

    private int currentLessonIndex;


    public LessonManager() {

        if (instance == null) {

            instance = this;

            lessons = new ArrayList<>();

            currentLessonIndex = 0;

            loadLessons();
        }
    }

    public static LessonManager getInstance() {

        if (instance == null) {
            instance = new LessonManager();
        }

        return instance;
    }

    private void loadLessons() {

        List<Word> lesson1Words = List.of(

                new Word(
                        "MANZANA",
                        "/images/apple.jpg",
                        List.of("APPLE", "DOG", "CAR"),
                        "APPLE"
                ),

                new Word(
                        "PERRO",
                        "/images/dog.jpg",
                        List.of("DOG", "HOUSE", "BANANA"),
                        "DOG"
                ),

                new Word(
                        "CARRO",
                        "/images/car.png",
                        List.of("DOG", "CAR", "APPLE"),
                        "CAR"
                ),

                new Word(
                        "SOL",
                        "/images/sun.png",
                        List.of("SUN", "BOOK", "CAT"),
                        "SUN"
                ),

                new Word(
                        "GATO",
                        "/images/cat.png",
                        List.of("HOUSE", "CAT", "DOG"),
                        "CAT"
                )
        );

        lessons.add(
                new Lesson(
                        "Lesson 1",
                        lesson1Words
                )
        );


        List<Word> lesson2Words = List.of(

                new Word(
                        "AVION",
                        "/images/airplane.png",
                        List.of("AIRPLANE", "CAR", "DOG"),
                        "AIRPLANE"
                ),

                new Word(
                        "PELOTA",
                        "/images/ball.png",
                        List.of("BALL", "CAT", "HOUSE"),
                        "BALL"
                ),

                new Word(
                        "BANDERA",
                        "/images/flag.png",
                        List.of("FLAG", "SUN", "DOG"),
                        "FLAG"
                ),

                new Word(
                        "CAFE",
                        "/images/coffee.png",
                        List.of("COFFEE", "CAR", "APPLE"),
                        "COFFEE"
                ),

                new Word(
                        "MALETA",
                        "/images/suitcase.png",
                        List.of("SUITCASE", "DOG", "CAT"),
                        "SUITCASE"
                )
        );


        lessons.add(
                new Lesson(
                        "Lesson 2",
                        lesson2Words
                )
        );

    }

    public Lesson getCurrentLesson() {

        return lessons.get(currentLessonIndex);

    }

    public boolean hasNextLesson() {

        return currentLessonIndex < lessons.size() - 1;

    }

    public void nextLesson() {

        if (hasNextLesson()) {
            currentLessonIndex++;
        }

    }

    public boolean isLastLesson() {
        return currentLessonIndex >= lessons.size() - 1;
    }

    public void reset() {
        currentLessonIndex = 0;
    }
}