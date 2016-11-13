package hu.daniels.hexagame.model;

import hu.daniels.hexagame.util.Coordinate;

import java.util.Map;

/**
 * Created by Dani on 2016.11.13..
 */
public class GameMap {
    private Map<Coordinate, Cell> cells;

    public Map<Coordinate, Cell> getCells() {
        return cells;
    }
}
