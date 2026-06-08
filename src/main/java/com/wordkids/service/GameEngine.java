package com.wordkids.service;

import com.wordkids.model.Word;

import java.util.List;

/**
 * Clase encargada de manejar
 * toda la lógica principal del videojuego.
 *
 * Sus responsabilidades incluyen:
 * - validar respuestas,
 * - administrar puntaje,
 * - controlar vidas,
 * - cambiar preguntas,
 * - determinar victoria o derrota.
 *
 * Esta clase representa
 * el núcleo del gameplay.
 *
 * @author Equipo WordKids
 * @version 1.0
 */

public class GameEngine {

    private final List<Word> words;

    private int currentIndex;

    private int score;

    private int lives;

    public GameEngine(List<Word> words) {

        this.words = words;

        this.currentIndex = 0;

        this.score = 0;

        this.lives = 3;
    }

    public Word getCurrentWord() {

        return words.get(currentIndex);

    }


/**
 * Valida si la respuesta ingresada
 * por el jugador es correcta.
 *
 * Si la respuesta es correcta:
 * - aumenta el puntaje.
 *
 * Si la respuesta es incorrecta:
 * - disminuye una vida.
 *
 * @param answer respuesta seleccionada
 * @return true si es correcta
 */

    public boolean checkAnswer(String answer) {

        Word currentWord = getCurrentWord();

        boolean isCorrect =
                currentWord.getCorrectAnswer().equals(answer);

        if (isCorrect) {

            score += 10;

        } else {

            lives--;

        }

        currentIndex++;

        return isCorrect;
    }

    public boolean hasNextWord() {

        return currentIndex < words.size();

    }

    public int getScore() {

        return score;

    }

    public int getLives() {

        return lives;

    }

    public boolean isGameOver() {

        return lives <= 0;

    }
}