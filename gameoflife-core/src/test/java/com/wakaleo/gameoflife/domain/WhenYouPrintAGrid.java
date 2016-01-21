package com.wakaleo.gameoflife.domain;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static com.wakaleo.gameoflife.domain.Cell.*;

import org.junit.Test;

import com.wakaleo.gameoflife.domain.Cell;
import com.wakaleo.gameoflife.domain.GridWriter;

public class WhenYouPrintAGrid {

<<<<<<< HEAD
	private final String NEW_LINE = System.getProperty("line.separator");
=======
    private final String NEW_LINE = System.getProperty("line.separator");
>>>>>>> 18051323061c9d96d348a71113bde562441a0ca8

    @Test
    public void shouldBeAbleToReadAGridOfCellsFromAString() {
        Cell[][] gridContents = {
                {DEAD_CELL, DEAD_CELL, DEAD_CELL},
<<<<<<< HEAD
                {DEAD_CELL, DEAD_CELL, DEAD_CELL}, 
                {DEAD_CELL, DEAD_CELL, DEAD_CELL} 
        };
        
        String expectedPrintedGrid = "..." + NEW_LINE + 
                                     "..." + NEW_LINE +
                                     "..." + NEW_LINE + "";
        
=======
                {DEAD_CELL, DEAD_CELL, DEAD_CELL},
                {DEAD_CELL, DEAD_CELL, DEAD_CELL}
        };

        String expectedPrintedGrid = "..." + NEW_LINE +
                "..." + NEW_LINE +
                "..." + NEW_LINE + "";

>>>>>>> 18051323061c9d96d348a71113bde562441a0ca8
        GridWriter gridWriter = new GridWriter();
        String printedGrid = gridWriter.convertToString(gridContents);
        assertThat(printedGrid, is(expectedPrintedGrid));
    }

    @Test
    public void shouldBeAbleToReadAStringGridContainingLiveAndDeadCells() {
        Cell[][] gridContents = {
                {LIVE_CELL, DEAD_CELL, DEAD_CELL},
<<<<<<< HEAD
                {DEAD_CELL, LIVE_CELL, DEAD_CELL}, 
                {DEAD_CELL, LIVE_CELL, DEAD_CELL} 
        };
        
        String expectedPrintedGrid = "*.." + NEW_LINE + 
                                     ".*." + NEW_LINE +
                                     ".*." + NEW_LINE + "";
        
=======
                {DEAD_CELL, LIVE_CELL, DEAD_CELL},
                {DEAD_CELL, LIVE_CELL, DEAD_CELL}
        };

        String expectedPrintedGrid = "*.." + NEW_LINE +
                ".*." + NEW_LINE +
                ".*." + NEW_LINE + "";

>>>>>>> 18051323061c9d96d348a71113bde562441a0ca8
        GridWriter gridWriter = new GridWriter();
        String printedGrid = gridWriter.convertToString(gridContents);
        assertThat(printedGrid, is(expectedPrintedGrid));
    }

    @Test
    public void shouldBeAbleToReadALargeStringGridContainingLiveAndDeadCells() {
        Cell[][] gridContents = {
<<<<<<< HEAD
                {LIVE_CELL, DEAD_CELL, DEAD_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL,LIVE_CELL, DEAD_CELL, DEAD_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL},
                {DEAD_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL, LIVE_CELL, DEAD_CELL,DEAD_CELL, LIVE_CELL, DEAD_CELL,DEAD_CELL, LIVE_CELL, DEAD_CELL}, 
                {DEAD_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL, LIVE_CELL, DEAD_CELL},
                {LIVE_CELL, DEAD_CELL, DEAD_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL,LIVE_CELL, DEAD_CELL, DEAD_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL},
                {DEAD_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL, LIVE_CELL, DEAD_CELL,DEAD_CELL, LIVE_CELL, DEAD_CELL,DEAD_CELL, LIVE_CELL, DEAD_CELL}, 
                {DEAD_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL, LIVE_CELL, DEAD_CELL},
                {LIVE_CELL, DEAD_CELL, DEAD_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL,LIVE_CELL, DEAD_CELL, DEAD_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL},
                {DEAD_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL, LIVE_CELL, DEAD_CELL,DEAD_CELL, LIVE_CELL, DEAD_CELL,DEAD_CELL, LIVE_CELL, DEAD_CELL}, 
                {DEAD_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL, LIVE_CELL, DEAD_CELL},
                {LIVE_CELL, DEAD_CELL, DEAD_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL,LIVE_CELL, DEAD_CELL, DEAD_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL},
                {DEAD_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL, LIVE_CELL, DEAD_CELL,DEAD_CELL, LIVE_CELL, DEAD_CELL,DEAD_CELL, LIVE_CELL, DEAD_CELL}, 
                {DEAD_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL, LIVE_CELL, DEAD_CELL},
        };
        
        String expectedPrintedGrid = "*..*..*..*.." + NEW_LINE + 
                                     ".*..*..*..*." + NEW_LINE +
                                     ".*..*..*..*." + NEW_LINE + 
                                     "*..*..*..*.." + NEW_LINE + 
                                     ".*..*..*..*." + NEW_LINE +
                                     ".*..*..*..*." + NEW_LINE +
                                     "*..*..*..*.." + NEW_LINE + 
                                     ".*..*..*..*." + NEW_LINE +
                                     ".*..*..*..*." + NEW_LINE +
                                     "*..*..*..*.." + NEW_LINE + 
                                     ".*..*..*..*." + NEW_LINE +
                                     ".*..*..*..*." + NEW_LINE + "";
        
=======
                {LIVE_CELL, DEAD_CELL, DEAD_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL},
                {DEAD_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL, LIVE_CELL, DEAD_CELL},
                {DEAD_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL, LIVE_CELL, DEAD_CELL},
                {LIVE_CELL, DEAD_CELL, DEAD_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL},
                {DEAD_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL, LIVE_CELL, DEAD_CELL},
                {DEAD_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL, LIVE_CELL, DEAD_CELL},
                {LIVE_CELL, DEAD_CELL, DEAD_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL},
                {DEAD_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL, LIVE_CELL, DEAD_CELL},
                {DEAD_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL, LIVE_CELL, DEAD_CELL},
                {LIVE_CELL, DEAD_CELL, DEAD_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL},
                {DEAD_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL, LIVE_CELL, DEAD_CELL},
                {DEAD_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL, LIVE_CELL, DEAD_CELL},
        };

        String expectedPrintedGrid = "*..*..*..*.." + NEW_LINE +
                ".*..*..*..*." + NEW_LINE +
                ".*..*..*..*." + NEW_LINE +
                "*..*..*..*.." + NEW_LINE +
                ".*..*..*..*." + NEW_LINE +
                ".*..*..*..*." + NEW_LINE +
                "*..*..*..*.." + NEW_LINE +
                ".*..*..*..*." + NEW_LINE +
                ".*..*..*..*." + NEW_LINE +
                "*..*..*..*.." + NEW_LINE +
                ".*..*..*..*." + NEW_LINE +
                ".*..*..*..*." + NEW_LINE + "";

>>>>>>> 18051323061c9d96d348a71113bde562441a0ca8
        GridWriter gridWriter = new GridWriter();
        String printedGrid = gridWriter.convertToString(gridContents);
        assertThat(printedGrid, is(expectedPrintedGrid));
    }
<<<<<<< HEAD
    
=======

>>>>>>> 18051323061c9d96d348a71113bde562441a0ca8
}