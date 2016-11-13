package hu.daniels.hexagame.main;

import hu.daniels.hexagame.ui.Hexagon;
import hu.daniels.hexagame.ui.HexagonTransformer;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.Arrays;
import java.util.List;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, 800, 450);
        root.getChildren().addAll();
        scene.setFill(Color.BLACK);
        primaryStage.setTitle("Pulsing Hexagons");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
