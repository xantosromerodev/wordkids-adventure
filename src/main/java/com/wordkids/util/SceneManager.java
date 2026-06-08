package com.wordkids.util;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneManager {

    private static Stage primaryStage;

    public static void setStage(Stage stage) {

        primaryStage = stage;

    }

    public static void switchScene(String fxmlFile) {

        try {

            FXMLLoader loader = new FXMLLoader(
                    SceneManager.class.getResource("/fxml/" + fxmlFile)
            );

            Scene scene = new Scene(loader.load(), 800, 600);

            primaryStage.setScene(scene);
            primaryStage.show();

        } catch (Exception e) {

            e.printStackTrace();

        }
    }
}