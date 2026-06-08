package com.wordkids.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import com.wordkids.model.Word;
import com.wordkids.service.GameEngine;
import com.wordkids.service.GameService;
import com.wordkids.util.SceneManager;
import javafx.scene.control.Alert;
import com.wordkids.service.LessonManager;

public class GameController {

    @FXML
    private Label scoreLabel;

    @FXML
    private Label livesLabel;

    @FXML
    private Label wordLabel;

    @FXML
    private ImageView wordImage;

    @FXML
    private Button option1Button;

    @FXML
    private Button option2Button;

    @FXML
    private Button option3Button;

    private GameEngine gameEngine;
    private LessonManager lessonManager;

    @FXML
    private void handleOption1() {

        processAnswer(option1Button.getText());

    }

    @FXML
    private void handleOption2() {

        processAnswer(option2Button.getText());

    }

    @FXML
    private void handleOption3() {

        processAnswer(option3Button.getText());

    }


    @FXML
    public void initialize() {

        lessonManager = new LessonManager();

        gameEngine = new GameEngine(
                lessonManager
                        .getCurrentLesson()
                        .getWords()
        );

        loadCurrentWord();

    }

    private void loadCurrentWord() {

        if (!gameEngine.hasNextWord()) {

            SceneManager.switchScene("victory.fxml");

            return;
        }

        Word currentWord = gameEngine.getCurrentWord();

        Image image = new Image(
                getClass().getResourceAsStream(
                        currentWord.getImagePath()
                )
        );

        wordImage.setImage(image);

        wordLabel.setText(currentWord.getWord());

        option1Button.setText(
                currentWord.getOptions().get(0)
        );

        option2Button.setText(
                currentWord.getOptions().get(1)
        );

        option3Button.setText(
                currentWord.getOptions().get(2)
        );

        scoreLabel.setText(
                "Score: " + gameEngine.getScore()
        );

        livesLabel.setText(
                "Lives: " + gameEngine.getLives()
        );
    }

    private void processAnswer(String answer) {

        boolean isCorrect =
                gameEngine.checkAnswer(answer);

        if (!isCorrect) {

            Alert alert = new Alert(Alert.AlertType.ERROR);

            alert.setTitle("Incorrect Answer");

            alert.setHeaderText(null);

            alert.setContentText(
                    "Oops! Try the next word."
            );

            alert.showAndWait();

        }

        if (gameEngine.isGameOver()) {

            wordLabel.setText("GAME OVER");

            disableButtons();

            return;
        }

        if (!gameEngine.hasNextWord()) {

            SceneManager.switchScene("victory.fxml");

            return;
        }

        loadCurrentWord();
    }


    private void disableButtons() {

        option1Button.setDisable(true);

        option2Button.setDisable(true);

        option3Button.setDisable(true);

    }

}