package hu.daniels.hexagame.model;

/**
 * Created by Dani on 2016.11.13..
 */
public class Cell {
    private int cellType;

    public Cell(int cellType) {
        this.cellType = cellType;
    }

    public int getCellType() {
        return cellType;
    }

    public void setCellType(int cellType) {
        this.cellType = cellType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cell)) return false;

        Cell cell = (Cell) o;

        return cellType == cell.cellType;

    }

    @Override
    public int hashCode() {
        return cellType;
    }

    @Override
    public String toString() {
        return "Cell{" +
                "cellType=" + cellType +
                '}';
    }
}
