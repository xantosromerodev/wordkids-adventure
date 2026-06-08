package com.wordkids.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import com.wordkids.util.SceneManager;

public class MenuController {

    @FXML
    private Button playButton;

    @FXML
    private Button exitButton;

    @FXML
    private void handlePlay() {

        SceneManager.switchScene("game.fxml");

    }

    @FXML
    private void handleExit() {

        System.exit(0);

    }
}