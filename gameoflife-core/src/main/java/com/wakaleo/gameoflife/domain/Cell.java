package com.wakaleo.gameoflife.domain;

public enum Cell {
<<<<<<< HEAD
    LIVE_CELL("+"), DEAD_CELL(".");

    private String symbol;

    private Cell(String symbol) {
        this.symbol = symbol;
=======
    LIVE_CELL("*"), DEAD_CELL(".");

    private String symbol;

    private Cell(final String initialSymbol) {
        this.symbol = initialSymbol;
>>>>>>> 18051323061c9d96d348a71113bde562441a0ca8
    }

    @Override
    public String toString() {
        return symbol;
    }

<<<<<<< HEAD
    static Cell fromSymbol(String symbol) {
=======
    static Cell fromSymbol(final String symbol) {
>>>>>>> 18051323061c9d96d348a71113bde562441a0ca8
        Cell cellRepresentedBySymbol = null;
        for (Cell cell : Cell.values()) {
            if (cell.symbol.equals(symbol)) {
                cellRepresentedBySymbol = cell;
                break;
            }
        }
        return cellRepresentedBySymbol;
    }

    public String getSymbol() {
        return symbol;
    }
}
