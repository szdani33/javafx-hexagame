package hu.daniels.hexagame.model;

import hu.daniels.hexagame.util.Coordinate;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Dani on 2016.11.13..
 */
public class GameMap {

    private String map = " 0 0 0 0 0 0 0 0 0 \n" +
                         "0 0 0 0 0 0 0 0 0 0\n" +
                         " 1 1 0 0 0 0 0 0 0 \n" +
                         "0 1 0 0 1 1 0 0 0 0\n" +
                         " 0 0 0 1 1 0 0 0 0 \n" +
                         "0 0 0 0 1 0 1 1 0 0\n" +
                         " 0 0 0 0 0 1 1 1 0 \n" +
                         "0 0 1 0 0 0 1 1 0 0\n" +
                         " 0 0 0 0 0 1 0 1 0 \n" +
                         "0 0 1 0 0 0 1 1 0 0\n" +
                         " 0 0 0 0 0 1 1 1 0 \n" +
                         "0 0 0 0 0 0 1 0 0 0\n" +
                         " 0 0 0 0 0 0 0 0 0 \n" +
                         "0 0 0 0 0 0 0 0 0 0\n" +
                         " 0 0 0 0 0 0 0 0 0 \n" +
                         "0 0 0 0 0 0 0 0 0 0\n";

    private Map<Coordinate, Cell> cells;

    public GameMap() {

        cells = new HashMap<>();

        String[] rows = map.split("\n");
        int y = 0;
        for(int i = 0; i < rows.length; i+=2) {
            String[] row0 = rows[i].split(" ");
            String[] row1 = rows[i+1].split(" ");
            int x = 0;
            cells.put(new Coordinate(x, y), new Cell(Integer.valueOf(row1[0])));
            for(int j = 0; j < row0.length - 2; j+=2) {
                x++;
                cells.put(new Coordinate(x, y), new Cell(Integer.valueOf(row0[j+1])));
                x++;
                cells.put(new Coordinate(x, y), new Cell(Integer.valueOf(row1[j+1])));
                x++;
                cells.put(new Coordinate(x, y), new Cell(Integer.valueOf(row0[j+2])));
                x++;
                cells.put(new Coordinate(x, y), new Cell(Integer.valueOf(row1[j+2])));
            }
            y++;
        }

//        cells.put(new Coordinate(0, 0), new Cell(0));
//        cells.put(new Coordinate(1, 0), new Cell(0));
//        cells.put(new Coordinate(2, 0), new Cell(0));
//        cells.put(new Coordinate(3, 0), new Cell(1));
//        cells.put(new Coordinate(4, 0), new Cell(0));
//        cells.put(new Coordinate(0, 1), new Cell(0));
//        cells.put(new Coordinate(1, 1), new Cell(0));
//        cells.put(new Coordinate(2, 1), new Cell(0));
//        cells.put(new Coordinate(3, 1), new Cell(1));
//        cells.put(new Coordinate(4, 1), new Cell(0));
//        cells.put(new Coordinate(0, 2), new Cell(0));
//        cells.put(new Coordinate(1, 2), new Cell(0));
//        cells.put(new Coordinate(2, 2), new Cell(1));
//        cells.put(new Coordinate(3, 2), new Cell(0));
//        cells.put(new Coordinate(4, 2), new Cell(0));
//        cells.put(new Coordinate(0, 3), new Cell(0));
//        cells.put(new Coordinate(1, 3), new Cell(0));
//        cells.put(new Coordinate(2, 3), new Cell(0));
//        cells.put(new Coordinate(3, 3), new Cell(0));
//        cells.put(new Coordinate(4, 3), new Cell(0));
//        cells.put(new Coordinate(0, 4), new Cell(0));
//        cells.put(new Coordinate(1, 4), new Cell(0));
//        cells.put(new Coordinate(2, 4), new Cell(1));
//        cells.put(new Coordinate(3, 4), new Cell(0));
//        cells.put(new Coordinate(4, 4), new Cell(0));
    }

    public Map<Coordinate, Cell> getCells() {
        return cells;
    }
}
