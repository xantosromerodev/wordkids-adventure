package com.wordkids.model;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de pruebas unitarias
 * para el modelo Word.
 */
class WordTest {

    /**
     * Verifica que el objeto Word
     * se cree correctamente.
     */
    @Test
    void shouldCreateWordCorrectly() {

        Word word = new Word(
                "APPLE",
                "/images/apple.jpg",
                List.of("APPLE", "DOG", "CAR"),
                "APPLE"
        );

        assertEquals(
                "APPLE",
                word.getWord()
        );

        assertEquals(
                "/images/apple.jpg",
                word.getImagePath()
        );

        assertEquals(
                "APPLE",
                word.getCorrectAnswer()
        );

        assertEquals(
                3,
                word.getOptions().size()
        );
    }
}