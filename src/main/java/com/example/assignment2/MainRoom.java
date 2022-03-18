package com.example.assignment2;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import javafx.scene.control.Label;


public class MainRoom extends Application {
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

        Rectangle room5 = new Rectangle(400, 50, 120, 160);
        room5.setFill(Color.GREY);
        room5.setStroke(Color.BLACK);
        Label label5 = new Label("Room 5");
        label5.setLayoutX(420);
        label5.setLayoutY(130);

        Rectangle room6 = new Rectangle(200, 210, 160, 150);
        room6.setFill(Color.GREY);
        room6.setStroke(Color.BLACK);
        Label label6 = new Label("Room 6");
        label6.setLayoutX(300);
        label6.setLayoutY(250);

        Rectangle room7 = new Rectangle(360, 210, 160, 150);
        room7.setFill(Color.GREY);
        room7.setStroke(Color.BLACK);
        Label label7 = new Label("Room 7");
        label7.setLayoutX(470);
        label7.setLayoutY(250);
        Button room1btn = new Button("Room1 ON/OFF");

        room1btn.setOnAction(e -> {
            if(room1.getFill() == Color.GREY) {
                room1.setFill(Color.YELLOW);
            }
            else {
                room1.setFill(Color.GREY);
            }
        });

        Group pane = new Group();
        pane.getChildren().addAll(room1, label1, room2,label2, room3, label3, room4,label4, room5,label5, room6,label6, room7,label7);

        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setStyle("-fx-padding:15,15,15,15");
        gridPane.setVgap(5);
        gridPane.setHgap(5);


        Button button1 = new Button("AllRooms ON/OFF");
        button1.setOnAction(e -> {
            if(room1.getFill() == Color.GREY || room2.getFill() == Color.GREY || room3.getFill() == Color.GREY|| room4.getFill() == Color.GREY|| room5.getFill() == Color.GREY|| room6.getFill() == Color.GREY|| room7.getFill() == Color.GREY) {
                room1.setFill(Color.YELLOW);
                room2.setFill(Color.GREEN);
                room3.setFill(Color.ORANGE);
                room4.setFill(Color.ORANGE);
                room5.setFill(Color.YELLOW);

                room6.setFill(Color.RED);
                room7.setFill(Color.YELLOW);
            }
            else {
                room1.setFill(Color.GREY);
                room2.setFill(Color.GREY);
                room3.setFill(Color.GREY);
                room4.setFill(Color.GREY);
                room5.setFill(Color.GREY);

                room6.setFill(Color.GREY);
                room7.setFill(Color.GREY);
            }
        });

    }
}