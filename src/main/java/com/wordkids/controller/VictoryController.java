package com.wordkids.controller;

import com.wordkids.service.LessonManager;
import com.wordkids.util.SceneManager;
import javafx.fxml.FXML;

public class VictoryController {

    @FXML
    private void handleNextLesson() {

        LessonManager.getInstance().nextLesson();

        SceneManager.switchScene("game.fxml");
    }

    @FXML
    private void handleMainMenu() {

        SceneManager.switchScene("menu.fxml");
    }
}