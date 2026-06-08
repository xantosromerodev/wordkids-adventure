package com.wordkids.model;

import java.util.List;

/**
 * Representa una lección dentro de la aplicación WordKids.
 *
 * Propósito:
 * Agrupar un conjunto de palabras relacionadas bajo un mismo tema
 * o categoría para facilitar el aprendizaje del usuario.
 *
 * Ejemplos de lecciones:
 * - Animals
 * - Fruits
 * - Colors
 */
public class Lesson {

    /**
     * Nombre de la lección.
     *
     * Ejemplos:
     * - "Animals"
     * - "Fruits"
     * - "Colors"
     */
    private final String lessonName;

    /**
     * Lista de palabras que pertenecen a la lección.
     */
    private final List<Word> words;

    /**
     * Constructor de la clase Lesson.
     *
     * Inicializa una nueva lección asignando su nombre y la lista
     * de palabras que la componen.
     *
     * @param lessonName Nombre de la lección.
     * @param words Lista de palabras asociadas a la lección.
     */
    public Lesson(
            String lessonName,
            List<Word> words
    ) {

        this.lessonName = lessonName;
        this.words = words;

    }

    /**
     * Obtiene el nombre de la lección.
     *
     * @return Nombre de la lección.
     */
    public String getLessonName() {

        return lessonName;

    }

    /**
     * Obtiene la lista de palabras de la lección.
     *
     * @return Lista de objetos Word asociados a la lección.
     */
    public List<Word> getWords() {

        return words;

    }
}