package com.example.javafx_project;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.Button;
import java.awt.Color;
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class App extends Application{
    public static void main(String[] args) throws IOException {
        HelloApplication.main(args);
        launch(args);

        try {
            Runtime.getRuntime().exec("C:/Users/assem/IdeaProjects/Intro" +
                    "toSoftwareEngineering/JavaFX_Project/MavenProject10SNAPSHOT (1).exe", null, new File("C:\\Users\\assem\\IdeaProjects\\IntrotoSoftwareEngineering\\JavaFX_Project"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        
            
            
        

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent parent = FXMLLoader.load(HelloApplication.class.getResource("/hello.fxml"));
        Scene scene = new Scene(parent, 2000, 400);
        primaryStage.setTitle("my app");
        primaryStage.setScene(scene);
        primaryStage.centerOnScreen();
        primaryStage.show();  

        Button button = new Button("Click me");
        throw new UnsupportedOperationException("Unimplemented method 'start'");
    }
    }

