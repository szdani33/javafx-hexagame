package hu.daniels.hexagame.ui;

import hu.daniels.hexagame.model.Cell;
import hu.daniels.hexagame.util.Coordinate;
import javafx.geometry.Point2D;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Polygon;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Dani on 2016.11.12..
 */
public class Hexagon extends Polygon {

    public static final int INDENTATION = 75;
    private Cell cell;
    private Coordinate coordinate;

    public Hexagon(Cell cell, Coordinate coordinate) {
        this.cell = cell;
        this.coordinate = coordinate;
    }

    public void repaint(double size) {
        ArrayList<Double> corners = new ArrayList<>();
        Point2D center = calcCenter(size);
        for(int i = 0; i < 6; i++) {
            int degree = 60 * i + 30;
            double rad = Math.PI / 180 * degree;
            corners.add(center.getX() + size * Math.sin(rad));
            corners.add(center.getY() + size * Math.cos(rad));
        }
        getPoints().setAll(corners);
        setFill(getColor(cell.getCellType()));
        setStroke(Color.BLACK);
    }

    private Point2D calcCenter(double size) {
        double width = size * 2;
        double height = Math.sqrt(3) * size;
        double x = INDENTATION + coordinate.getX() * size * 3/2;
        double y = INDENTATION + coordinate.getY() * height - (coordinate.getX() % 2 == 1 ? height / 2 : 0);
        return new Point2D(x, y);
    }

    private Color getColor(int cellType) {
        if(cellType == 0) {
            return Color.DEEPSKYBLUE;
        } else {
            return Color.FORESTGREEN;
        }
    }
}
