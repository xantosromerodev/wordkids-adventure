package com.wordkids.model;

import java.util.List;

/**
 * Clase que representa una palabra educativa
 * dentro del videojuego.
 *
 * Cada palabra contiene:
 * - el texto correcto,
 * - una imagen asociada,
 * - múltiples opciones,
 * - y la respuesta correcta.
 *
 * Esta clase pertenece al modelo
 * principal del sistema.
 *
 * @author Equipo WordKids
 * @version 1.0
 */
public class Word {

    /**
     * Palabra que será mostrada al jugador.
     */
    private final String word;

    /**
     * Ruta de la imagen asociada a la palabra.
     */
    private final String imagePath;

    /**
     * Lista de opciones mostradas al jugador.
     */
    private final List<String> options;

    /**
     * Respuesta correcta de la pregunta.
     */
    private final String correctAnswer;

    /**
     * Constructor de la clase Word.
     *
     * @param word palabra educativa
     * @param imagePath ruta de la imagen
     * @param options lista de opciones
     * @param correctAnswer respuesta correcta
     */
    public Word(
            String word,
            String imagePath,
            List<String> options,
            String correctAnswer
    ) {

        this.word = word;
        this.imagePath = imagePath;
        this.options = options;
        this.correctAnswer = correctAnswer;

    }

    /**
     * Obtiene la palabra educativa.
     *
     * @return palabra
     */
    public String getWord() {

        return word;

    }

    /**
     * Obtiene la ruta de la imagen.
     *
     * @return ruta de imagen
     */
    public String getImagePath() {

        return imagePath;

    }

    /**
     * Obtiene las opciones disponibles.
     *
     * @return lista de opciones
     */
    public List<String> getOptions() {

        return options;

    }

    /**
     * Obtiene la respuesta correcta.
     *
     * @return respuesta correcta
     */
    public String getCorrectAnswer() {

        return correctAnswer;

    }
}
