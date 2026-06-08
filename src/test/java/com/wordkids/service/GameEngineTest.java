package com.wordkids.service;

import com.wordkids.model.Word;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de pruebas unitarias
 * para GameEngine.
 */
class GameEngineTest {

    /**
     * Verifica que el puntaje aumente
     * cuando la respuesta es correcta.
     */
    @Test
    void shouldIncreaseScoreWhenAnswerIsCorrect() {

        Word word = new Word(
                "APPLE",
                "/images/apple.png",
                List.of("APPLE", "DOG", "CAR"),
                "APPLE"
        );

        GameEngine engine =
                new GameEngine(List.of(word));

        boolean result =
                engine.checkAnswer("APPLE");

        assertTrue(result);

        assertEquals(
                10,
                engine.getScore()
        );
    }

    /**
     * Verifica que las vidas disminuyan
     * cuando la respuesta es incorrecta.
     */
    @Test
    void shouldDecreaseLivesWhenAnswerIsIncorrect() {

        Word word = new Word(
                "APPLE",
                "/images/apple.png",
                List.of("APPLE", "DOG", "CAR"),
                "APPLE"
        );

        GameEngine engine =
                new GameEngine(List.of(word));

        boolean result =
                engine.checkAnswer("DOG");

        assertFalse(result);

        assertEquals(
                2,
                engine.getLives()
        );
    }
}
