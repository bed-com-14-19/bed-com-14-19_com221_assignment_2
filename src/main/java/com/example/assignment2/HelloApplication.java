package com.example.assignment2;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.shape.Rectangle;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.Group;

import javafx.scene.control.Label;


public class HelloApplication extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        HBox hBox = new HBox();
        hBox.setStyle("-fx-padding: 2, 3, 6, 15 ");
        hBox.setSpacing(6);
        Button file = new Button("file");
        Button edit = new Button("Edit");
        Button formart = new Button("Format");
        Button view = new Button("View");
        Button help = new Button("Help");
        hBox.getChildren().addAll(file, edit, formart, view, help);


        Rectangle room1 = new Rectangle(50, 50, 150, 200);
        room1.setFill(Color.GREY);
        room1.setStroke(Color.BLACK);
        Label label1 = new Label("Room 1");
        label1.setLayoutX(80);
        label1.setLayoutY(100);


        Rectangle room2 = new Rectangle(200, 170, 200, 40);
        room2.setFill(Color.GREY);
        room2.setStroke(Color.BLACK);
        Label label2 = new Label("Room 2");
        label2.setLayoutX(230);
        label2.setLayoutY(180);


        Rectangle room3 = new Rectangle(200, 50, 100, 120);
        room3.setFill(Color.GREY);
        room3.setStroke(Color.BLACK);
        Label label3 = new Label("Room 3");
        label3.setLayoutX(230);
        label3.setLayoutY(130);


        Rectangle room4 = new Rectangle(300, 50, 100, 120);
        room4.setFill(Color.GREY);
        room4.setStroke(Color.BLACK);
        Label label4 = new Label("Room 4");
        label4.setLayoutX(320);
        label4.setLayoutY(120);


    }
}