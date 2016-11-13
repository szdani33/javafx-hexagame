package hu.daniels.hexagame.main;

import hu.daniels.hexagame.model.Cell;
import hu.daniels.hexagame.model.GameMap;
import hu.daniels.hexagame.ui.Hexagon;
import hu.daniels.hexagame.util.Coordinate;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class Main extends Application {
    private static final int HEXAGON_SIZE = 30;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, 880, 490);
        scene.setFill(Color.BLACK);

        GameMap gameMap = new GameMap();
        Collection<Hexagon> hexagons = createHexagons(gameMap);
        root.getChildren().addAll(hexagons);

        primaryStage.setTitle("Pulsing Hexagons");
        primaryStage.setScene(scene);
        primaryStage.show();

        new AnimationTimer() {
            @Override
            public void handle(long now) {
                repaint();
            }

            private void repaint() {
                for(Hexagon hex : hexagons) {
                    hex.repaint(HEXAGON_SIZE);
                }
            }
        }.start();
    }

    private Collection<Hexagon> createHexagons(GameMap gameMap) {
        Collection<Hexagon> hexagons = new ArrayList<>();
        for(Map.Entry<Coordinate, Cell> entry : gameMap.getCells().entrySet()) {
            hexagons.add(new Hexagon(entry.getValue(), entry.getKey()));
        }
        return hexagons;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
