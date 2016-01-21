package com.wakaleo.gameoflife.domain;

<<<<<<< HEAD
import static com.wakaleo.gameoflife.domain.Cell.*;
=======
import static com.wakaleo.gameoflife.domain.Cell.DEAD_CELL;
import static com.wakaleo.gameoflife.domain.Cell.LIVE_CELL;
>>>>>>> 18051323061c9d96d348a71113bde562441a0ca8

public class Grid {

    private static final int DEFAULT_ROW_COUNT = 3;
    private static final int DEFAULT_COLUMN_COUNT = 3;

    private Cell[][] cells;
<<<<<<< HEAD
    
    
    private GridReader gridReader = new GridReader();;
    private GridWriter gridWriter = new GridWriter();

    public Grid(String gridContents) {
        this.cells = makeCellArrayFrom(gridContents);
    }
    
    public Grid() { 
        this.cells = anArrayOfDeadCells(DEFAULT_ROW_COUNT, DEFAULT_COLUMN_COUNT);
    }

    public Grid(int rows, int columns) { 
        this.cells = anArrayOfDeadCells(rows, columns);
    }
   
    private Cell[][] anArrayOfDeadCells(int rows, int columns) {
        Cell[][] deadCells = new Cell[rows][columns];
        for(int i = 0; i < rows; i++) {
            for (int j = 0;  j < columns; j++) {
                deadCells[i][j] = DEAD_CELL;
            }
        } 
        return deadCells;
    }

    private Cell[][] makeCellArrayFrom(String gridContents) {
=======


    private GridReader gridReader = new GridReader();
    private GridWriter gridWriter = new GridWriter();

    public Grid(final String gridContents) {
        this.cells = makeCellArrayFrom(gridContents);
    }

    public Grid() {
        this.cells = anArrayOfDeadCells(DEFAULT_ROW_COUNT,
                                        DEFAULT_COLUMN_COUNT);
    }

    public Grid(final int rows, final int columns) {
        this.cells = anArrayOfDeadCells(rows, columns);
    }

    private Cell[][] anArrayOfDeadCells(final int rows, final int columns) {
        Cell[][] deadCells = new Cell[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                deadCells[i][j] = DEAD_CELL;
            }
        }
        return deadCells;
    }

    private Cell[][] makeCellArrayFrom(final String gridContents) {
>>>>>>> 18051323061c9d96d348a71113bde562441a0ca8
        return gridReader.loadFrom(gridContents);
    }

    @Override
    public String toString() {
        return gridWriter.convertToString(cells);
    }

<<<<<<< HEAD
    public int getLiveNeighboursAt(int x, int y) {
        int liveNeighbourCount = 0;
        for (int xPosition = x-1; xPosition <=x+1; xPosition++) {
            for(int yPosition = y-1; yPosition <= y+1; yPosition++) {
=======
    public int getLiveNeighboursAt(final int x, final int y) {
        int liveNeighbourCount = 0;
        for (int xPosition = x - 1; xPosition <= x + 1; xPosition++) {
            for (int yPosition = y - 1; yPosition <= y + 1; yPosition++) {
>>>>>>> 18051323061c9d96d348a71113bde562441a0ca8
                if (!cellIsCentralCell(xPosition, yPosition, x, y)) {
                    liveNeighbourCount += countLiveNeighboursInCell(xPosition, yPosition);
                }
            }
        }
        return liveNeighbourCount;
    }

<<<<<<< HEAD
    private int countLiveNeighboursInCell(int x, int y) {
        if (cellIsOutsideBorders(x, y)) {
            return 0;
        }
        return (cells[y][x] == LIVE_CELL) ? 1 : 0;
    }

    private boolean cellIsOutsideBorders(int x, int y) {
        if ((y < 0 || y > getMaxRow()) || (x < 0 || x > getMaxColumn())) {
            return true;
        }
        return false;
=======
    private int countLiveNeighboursInCell(final int x, final int y) {
        if (cellIsOutsideBorders(x, y)) {
            return 0;
        }
        if (cells[y][x] == LIVE_CELL) {
            return 1;
        } else {
            return 0;
        }
    }

    private boolean cellIsOutsideBorders(final int x, final int y) {
        return (y < 0 || y > getMaxRow()) || (x < 0 || x > getMaxColumn());
>>>>>>> 18051323061c9d96d348a71113bde562441a0ca8
    }

    private int getMaxRow() {
        return cells.length - 1;
    }
<<<<<<< HEAD
    
    private int getMaxColumn() {
        return cells[0].length - 1;
    }
    
    private boolean cellIsCentralCell(int x, int y, int centerX, int centerY) {
        return (x == centerX) && (y == centerY);
    }

    public Cell getCellAt(int x, int y) {
=======

    private int getMaxColumn() {
        return cells[0].length - 1;
    }

    private boolean cellIsCentralCell(final int x, final int y,
                                      final int centerX, final int centerY) {
        return (x == centerX) && (y == centerY);
    }

    public Cell getCellAt(final int x, final int y) {
>>>>>>> 18051323061c9d96d348a71113bde562441a0ca8
        return cells[y][x];
    }

    public int getWidth() {
        return cells[0].length;
    }

    public int getHeight() {
        return cells.length;
    }

<<<<<<< HEAD
    public void setCellAt(int x, int y, Cell cell) {
        cells[y][x] = cell;
    }
    
=======
    public void setCellAt(final int x, final int y, final Cell cell) {
        cells[y][x] = cell;
    }

>>>>>>> 18051323061c9d96d348a71113bde562441a0ca8
    public Cell[][] getContents() {
        Cell[][] contentCopy = new Cell[getHeight()][getWidth()];
        for (int row = 0; row < getHeight(); row++) {
            for (int column = 0; column < getWidth(); column++) {
                contentCopy[row][column] = cells[row][column];
            }
        }
        return contentCopy;
<<<<<<< HEAD
    }    
=======
    }
>>>>>>> 18051323061c9d96d348a71113bde562441a0ca8
}
