package com.example.assignment2;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import javafx.scene.control.Label;


public class MainRoom extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        HBox hBox = new HBox();
        hBox.setStyle("-fx-padding: 3, 5, 9, 13 ");
        hBox.setSpacing(6);
        Button file = new Button("FILE");
        Button format = new Button("FORMAT");
        Button view = new Button("VIEW");
        Button edit1 = new Button("EDITS");
        Button help = new Button("HELP?");
        hBox.getChildren().addAll(file, edit1, format, view, help);


        Rectangle room1 = new Rectangle(50, 55, 150, 201);
        room1.setFill(Color.GREY);
        room1.setStroke(Color.BLUE);
        Label label1 = new Label("Room A");
        label1.setFont(Font.font(10));
        label1.setLayoutX(80);
        label1.setLayoutY(100);


        Rectangle room2 = new Rectangle(200, 171, 200, 40);
        room2.setFill(Color.GREY);
        room2.setStroke(Color.BLUE);
        Label label2 = new Label("Room B");
        label2.setFont(Font.font(10));
        label2.setLayoutX(230);
        label2.setLayoutY(180);


        Rectangle room3 = new Rectangle(200, 50, 100, 120);
        room3.setFill(Color.GREY);
        room3.setStroke(Color.BLUE);
        Label label3 = new Label("Room C");
        label3.setFont(Font.font(10));
        label3.setLayoutX(230);
        label3.setLayoutY(130);


        Rectangle room4 = new Rectangle(300, 50, 100, 120);
        room4.setFill(Color.GREY);
        room4.setStroke(Color.BLUE);
        Label label4 = new Label("Room D");
        label4.setFont(Font.font(10));
        label4.setLayoutX(320);
        label4.setLayoutY(120);

        Rectangle room5 = new Rectangle(400, 50, 120, 160);
        room5.setFill(Color.GREY);
        room5.setStroke(Color.BLUE);
        Label label5 = new Label("Room E");
        label5.setFont(Font.font(10));
        label5.setLayoutX(420);
        label5.setLayoutY(130);

        Rectangle room6 = new Rectangle(200, 210, 160, 150);
        room6.setFill(Color.GREY);
        room6.setStroke(Color.BLUE);
        Label label6 = new Label("Room F");
        label6.setFont(Font.font(10));
        label6.setLayoutX(300);
        label6.setLayoutY(250);

        Rectangle room7 = new Rectangle(360, 210, 160, 150);
        room7.setFill(Color.GREY);
        room7.setStroke(Color.BLUE);
        Label label7 = new Label("Room G");
        label7.setLayoutX(470);
        label7.setLayoutY(250);
        label7.setFont(Font.font(10));
        Button room1btn = new Button("RoomA ON/OFF");

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
        }); Button button2 = new Button("RoomA&B ON/OFF");
        button2.setOnAction(e -> {
            if(room2.getFill() == Color.GREY || room1.getFill() == Color.GREY) {
                room2.setFill(Color.GREEN);
                room1.setFill(Color.YELLOW);
            }
            else {
                room2.setFill(Color.GREY);
                room1.setFill(Color.GREY);
            }

        });
        Button button3 = new Button("RoomA ON/OFF");
        button3.setOnAction(e -> {
            if(room1.getFill() == Color.GREY) {
                room1.setFill(Color.YELLOW);
            }
            else {
                room1.setFill(Color.GREY);
            }
        });
        Button button4 = new Button("RoomB ON/OFF");
        button4.setOnAction(e -> {
            if(room2.getFill() == Color.GREY) {
                room2.setFill(Color.GREEN);
            }
            else {
                room2.setFill(Color.GREY);
            }
        });
        Button button5 = new Button("RoomC ON/OFF");
        button5.setOnAction(e -> {
            if(room3.getFill() == Color.GREY) {
                room3.setFill(Color.ORANGE);
            }
            else {
                room3.setFill(Color.GREY);
            }
        });
        Button button6 = new Button("RoomD ON/OFF");
        button6.setOnAction(e -> {
            if(room4.getFill() == Color.GREY) {
                room4.setFill(Color.ORANGE);
            }
            else {
                room4.setFill(Color.GREY);
            }
        });
        Button button7 = new Button("RoomE ON/OFF");
        button7.setOnAction(e -> {
            if(room5.getFill() == Color.GREY) {
                room5.setFill(Color.YELLOW);
            }
            else {
                room5.setFill(Color.GREY);
            }
        });
        Button button8 = new Button("RoomF ON/OFF");
        button8.setOnAction(e -> {
            if(room6.getFill() == Color.GREY) {
                room6.setFill(Color.RED);
            }
            else {
                room6.setFill(Color.GREY);
            }
        });
        Button button9 = new Button("RoomG ON/OFF");
        button9.setOnAction(e -> {
            if(room7.getFill() == Color.GREY) {
                room7.setFill(Color.YELLOW);
            }
            else {
                room7.setFill(Color.GREY);
            }
        });

        GridPane.setConstraints(button1,2,4);
        GridPane.setConstraints(button2,2,6);
        GridPane.setConstraints(button3,2,8);
        GridPane.setConstraints(button4,8,4);
        GridPane.setConstraints(button5,8,6);
        GridPane.setConstraints(button6,8,8);
        GridPane.setConstraints(button7,14,4);
        GridPane.setConstraints(button8,14,6);
        GridPane.setConstraints(button9,14,8);



        gridPane.getChildren().addAll(button1,button2,button3,button4,button5,button6,button7,button8,button9);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(hBox);
        borderPane.setCenter(pane);
        borderPane.setBottom(gridPane);
        Scene scene = new Scene( borderPane,510, 300);
        primaryStage.setTitle("MAIN ROOM");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}