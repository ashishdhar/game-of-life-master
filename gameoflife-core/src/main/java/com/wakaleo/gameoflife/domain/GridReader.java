package com.wakaleo.gameoflife.domain;

import java.util.ArrayList;
import java.util.List;

public class GridReader {

<<<<<<< HEAD
	public final String NEW_LINE = System.getProperty("line.separator");

	public Cell[][] loadFrom(String gridContents) {
=======
    private static final String NEW_LINE = System.getProperty("line.separator");

    public Cell[][] loadFrom(final String gridContents) {
>>>>>>> 18051323061c9d96d348a71113bde562441a0ca8
        List<Cell[]> rows = new ArrayList<Cell[]>();
        String[] rowValues = splitIntoRows(gridContents);
        for (String row : rowValues) {
            Cell[] cellsInRow = splitIntoCells(row);
            rows.add(cellsInRow);
        }
        return (Cell[][]) rows.toArray(new Cell[0][0]);
    }

<<<<<<< HEAD
    private Cell[] splitIntoCells(String row) {
    	// TODO: ugly code
        char[] cellSymbols = row.trim().toCharArray();
        List<Cell> cellsInRow = new ArrayList<Cell>();
        for(char cellSymbol : cellSymbols) {
        	Cell cell = Cell.fromSymbol(Character.toString(cellSymbol));
        	if (cell == null) {
        		throw new IllegalArgumentException();
        	}
=======
    private Cell[] splitIntoCells(final String row) {
        // TODO: ugly code
        char[] cellSymbols = row.trim().toCharArray();
        List<Cell> cellsInRow = new ArrayList<Cell>();
        for (char cellSymbol : cellSymbols) {
            Cell cell = Cell.fromSymbol(Character.toString(cellSymbol));
            if (cell == null) {
                throw new IllegalArgumentException();
            }
>>>>>>> 18051323061c9d96d348a71113bde562441a0ca8
            cellsInRow.add(cell);
        }
        return cellsInRow.toArray(new Cell[0]);
    }

<<<<<<< HEAD
    private String[] splitIntoRows(String gridContents) {
=======
    private String[] splitIntoRows(final String gridContents) {
>>>>>>> 18051323061c9d96d348a71113bde562441a0ca8
        return gridContents.split(NEW_LINE);
    }

}
