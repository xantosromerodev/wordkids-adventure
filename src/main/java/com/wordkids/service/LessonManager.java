package com.wordkids.service;

import com.wordkids.model.Lesson;
import com.wordkids.model.Word;

import java.util.ArrayList;
import java.util.List;

public class LessonManager {

    private final List<Lesson> lessons;

    private int currentLessonIndex;

    public LessonManager() {

        lessons = new ArrayList<>();

        currentLessonIndex = 0;

        loadLessons();

    }

    private void loadLessons() {

        List<Word> lesson1Words = List.of(

                new Word(
                        "APPLE",
                        "/images/apple.jpg",
                        List.of("APPLE", "DOG", "CAR"),
                        "APPLE"
                ),

                new Word(
                        "DOG",
                        "/images/dog.jpg",
                        List.of("DOG", "HOUSE", "BANANA"),
                        "DOG"
                ),

                new Word(
                        "CAR",
                        "/images/car.png",
                        List.of("DOG", "CAR", "APPLE"),
                        "CAR"
                ),

                new Word(
                        "SUN",
                        "/images/sun.png",
                        List.of("SUN", "BOOK", "CAT"),
                        "SUN"
                ),

                new Word(
                        "CAT",
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

    }

    public Lesson getCurrentLesson() {

        return lessons.get(currentLessonIndex);

    }

    public boolean hasNextLesson() {

        return currentLessonIndex < lessons.size() - 1;

    }

    public void nextLesson() {

        currentLessonIndex++;

    }
}