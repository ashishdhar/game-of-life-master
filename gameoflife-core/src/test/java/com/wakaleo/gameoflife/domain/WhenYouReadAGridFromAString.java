package com.wakaleo.gameoflife.domain;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static com.wakaleo.gameoflife.domain.Cell.*;

import org.junit.Test;

import com.wakaleo.gameoflife.domain.Cell;
import com.wakaleo.gameoflife.domain.GridReader;

public class WhenYouReadAGridFromAString {

<<<<<<< HEAD
	private final String NEW_LINE = System.getProperty("line.separator");

	@Test
=======
    private final String NEW_LINE = System.getProperty("line.separator");

    @Test
>>>>>>> 18051323061c9d96d348a71113bde562441a0ca8
    public void shouldBeAbleToReadAnEmptyGridOfCellsFromAnEmptyString() {
        String gridContents = "";

        Cell[][] expectedCells = {{}};
<<<<<<< HEAD
        
        GridReader gridReader = new GridReader();
        Cell[][] loadedCells = gridReader.loadFrom(gridContents);
        
        assertThat(loadedCells, is(expectedCells));
    }
    
=======

        GridReader gridReader = new GridReader();
        Cell[][] loadedCells = gridReader.loadFrom(gridContents);

        assertThat(loadedCells, is(expectedCells));
    }

>>>>>>> 18051323061c9d96d348a71113bde562441a0ca8
    @Test
    public void shouldBeAbleToReadAGridContainingASingleCellFromAString() {
        String gridContents = "*";

        Cell[][] expectedCells = {{LIVE_CELL}};
<<<<<<< HEAD
        
        GridReader gridReader = new GridReader();
        Cell[][] loadedCells = gridReader.loadFrom(gridContents);
        
=======

        GridReader gridReader = new GridReader();
        Cell[][] loadedCells = gridReader.loadFrom(gridContents);

>>>>>>> 18051323061c9d96d348a71113bde562441a0ca8
        assertThat(loadedCells, is(expectedCells));
    }

    @Test
    public void shouldBeAbleToReadAGridOfCellsFromAString() {
        String gridContents = "..." + NEW_LINE +
<<<<<<< HEAD
                              "..." + NEW_LINE +
                              "...";

        Cell[][] expectedCells = {
                {DEAD_CELL, DEAD_CELL, DEAD_CELL},
                {DEAD_CELL, DEAD_CELL, DEAD_CELL}, 
                {DEAD_CELL, DEAD_CELL, DEAD_CELL} 
        };
        
        GridReader gridReader = new GridReader();
        Cell[][] loadedCells = gridReader.loadFrom(gridContents);
        
        assertThat(loadedCells, is(expectedCells));
    }

    @Test(expected=IllegalArgumentException.class)
    public void shouldRefuseIllegalCellCharacters() {
        String gridContents = "..." + NEW_LINE + 
                              ".Z." + NEW_LINE +
                              "...";

        Cell[][] expectedCells = {
                {DEAD_CELL, DEAD_CELL, DEAD_CELL},
                {DEAD_CELL, DEAD_CELL, DEAD_CELL}, 
                {DEAD_CELL, DEAD_CELL, DEAD_CELL} 
        };
        
        GridReader gridReader = new GridReader();
        Cell[][] loadedCells = gridReader.loadFrom(gridContents);
        
=======
                "..." + NEW_LINE +
                "...";

        Cell[][] expectedCells = {
                {DEAD_CELL, DEAD_CELL, DEAD_CELL},
                {DEAD_CELL, DEAD_CELL, DEAD_CELL},
                {DEAD_CELL, DEAD_CELL, DEAD_CELL}
        };

        GridReader gridReader = new GridReader();
        Cell[][] loadedCells = gridReader.loadFrom(gridContents);

        assertThat(loadedCells, is(expectedCells));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldRefuseIllegalCellCharacters() {
        String gridContents = "..." + NEW_LINE +
                ".Z." + NEW_LINE +
                "...";

        Cell[][] expectedCells = {
                {DEAD_CELL, DEAD_CELL, DEAD_CELL},
                {DEAD_CELL, DEAD_CELL, DEAD_CELL},
                {DEAD_CELL, DEAD_CELL, DEAD_CELL}
        };

        GridReader gridReader = new GridReader();
        Cell[][] loadedCells = gridReader.loadFrom(gridContents);

>>>>>>> 18051323061c9d96d348a71113bde562441a0ca8
        assertThat(loadedCells, is(expectedCells));
    }

    @Test
    public void shouldBeAbleToReadAGridContainingLiveAndDeadCells() {
<<<<<<< HEAD
        String gridContents = "*.." + NEW_LINE + 
                              ".*." + NEW_LINE +
                              "..*";

        Cell[][] expectedCells = {
                {LIVE_CELL, DEAD_CELL, DEAD_CELL},
                {DEAD_CELL, LIVE_CELL, DEAD_CELL}, 
                {DEAD_CELL, DEAD_CELL, LIVE_CELL} 
        };
        
        GridReader gridReader = new GridReader();
        Cell[][] loadedCells = gridReader.loadFrom(gridContents);
        
=======
        String gridContents = "*.." + NEW_LINE +
                ".*." + NEW_LINE +
                "..*";

        Cell[][] expectedCells = {
                {LIVE_CELL, DEAD_CELL, DEAD_CELL},
                {DEAD_CELL, LIVE_CELL, DEAD_CELL},
                {DEAD_CELL, DEAD_CELL, LIVE_CELL}
        };

        GridReader gridReader = new GridReader();
        Cell[][] loadedCells = gridReader.loadFrom(gridContents);

>>>>>>> 18051323061c9d96d348a71113bde562441a0ca8
        assertThat(loadedCells, is(expectedCells));
    }

    @Test
    public void shouldBeAbleToReadAnAsymetricalGridContainingLiveAndDeadCells() {
<<<<<<< HEAD
        String gridContents = "...." + NEW_LINE + 
                              "**.." + NEW_LINE +
                              "..*.";

        Cell[][] expectedCells = {
                {DEAD_CELL, DEAD_CELL, DEAD_CELL, DEAD_CELL},
                {LIVE_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL}, 
                {DEAD_CELL, DEAD_CELL, LIVE_CELL, DEAD_CELL} 
        };
        
        GridReader gridReader = new GridReader();
        Cell[][] loadedCells = gridReader.loadFrom(gridContents);
        
        assertThat(loadedCells, is(expectedCells));
    }    
    
    @Test
    public void shouldBeAbleToReadALargerGrid() {
        String gridContents = "......" + NEW_LINE + 
                              "**...." + NEW_LINE +
                              "..*..." + NEW_LINE +
                              "..*..." + NEW_LINE +
                              "..*..." + NEW_LINE +
                              "..*...";

        Cell[][] expectedCells = {
                {DEAD_CELL, DEAD_CELL, DEAD_CELL,DEAD_CELL, DEAD_CELL, DEAD_CELL},
                {LIVE_CELL, LIVE_CELL, DEAD_CELL,DEAD_CELL, DEAD_CELL, DEAD_CELL}, 
                {DEAD_CELL, DEAD_CELL, LIVE_CELL,DEAD_CELL, DEAD_CELL, DEAD_CELL},
                {DEAD_CELL, DEAD_CELL, LIVE_CELL,DEAD_CELL, DEAD_CELL, DEAD_CELL},
                {DEAD_CELL, DEAD_CELL, LIVE_CELL,DEAD_CELL, DEAD_CELL, DEAD_CELL}, 
                {DEAD_CELL, DEAD_CELL, LIVE_CELL,DEAD_CELL, DEAD_CELL, DEAD_CELL}, 
        };
        
        GridReader gridReader = new GridReader();
        Cell[][] loadedCells = gridReader.loadFrom(gridContents);
        
=======
        String gridContents = "...." + NEW_LINE +
                "**.." + NEW_LINE +
                "..*.";

        Cell[][] expectedCells = {
                {DEAD_CELL, DEAD_CELL, DEAD_CELL, DEAD_CELL},
                {LIVE_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL},
                {DEAD_CELL, DEAD_CELL, LIVE_CELL, DEAD_CELL}
        };

        GridReader gridReader = new GridReader();
        Cell[][] loadedCells = gridReader.loadFrom(gridContents);

        assertThat(loadedCells, is(expectedCells));
    }

    @Test
    public void shouldBeAbleToReadALargerGrid() {
        String gridContents = "......" + NEW_LINE +
                "**...." + NEW_LINE +
                "..*..." + NEW_LINE +
                "..*..." + NEW_LINE +
                "..*..." + NEW_LINE +
                "..*...";

        Cell[][] expectedCells = {
                {DEAD_CELL, DEAD_CELL, DEAD_CELL, DEAD_CELL, DEAD_CELL, DEAD_CELL},
                {LIVE_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL, DEAD_CELL, DEAD_CELL},
                {DEAD_CELL, DEAD_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL, DEAD_CELL},
                {DEAD_CELL, DEAD_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL, DEAD_CELL},
                {DEAD_CELL, DEAD_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL, DEAD_CELL},
                {DEAD_CELL, DEAD_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL, DEAD_CELL},
        };

        GridReader gridReader = new GridReader();
        Cell[][] loadedCells = gridReader.loadFrom(gridContents);

>>>>>>> 18051323061c9d96d348a71113bde562441a0ca8
        assertThat(loadedCells, is(expectedCells));
    }

    @Test
    public void shouldBeAbleToReadAVeryLargerGrid() {
        String gridContents = "......" + NEW_LINE +
<<<<<<< HEAD
                              "**...." + NEW_LINE +
                              "..*..." + NEW_LINE +
                              "..*..." + NEW_LINE +
                            "..*..." + NEW_LINE +
                            "..*..." + NEW_LINE +
                            "..*..." + NEW_LINE +
                            "..*..." + NEW_LINE +
                              "..*...";

        Cell[][] expectedCells = {
                {DEAD_CELL, DEAD_CELL, DEAD_CELL,DEAD_CELL, DEAD_CELL, DEAD_CELL},
                {LIVE_CELL, LIVE_CELL, DEAD_CELL,DEAD_CELL, DEAD_CELL, DEAD_CELL},
                {DEAD_CELL, DEAD_CELL, LIVE_CELL,DEAD_CELL, DEAD_CELL, DEAD_CELL},
                {DEAD_CELL, DEAD_CELL, LIVE_CELL,DEAD_CELL, DEAD_CELL, DEAD_CELL},
                {DEAD_CELL, DEAD_CELL, LIVE_CELL,DEAD_CELL, DEAD_CELL, DEAD_CELL},
                {DEAD_CELL, DEAD_CELL, LIVE_CELL,DEAD_CELL, DEAD_CELL, DEAD_CELL},
                {DEAD_CELL, DEAD_CELL, LIVE_CELL,DEAD_CELL, DEAD_CELL, DEAD_CELL},
                {DEAD_CELL, DEAD_CELL, LIVE_CELL,DEAD_CELL, DEAD_CELL, DEAD_CELL},
                {DEAD_CELL, DEAD_CELL, LIVE_CELL,DEAD_CELL, DEAD_CELL, DEAD_CELL},
=======
                "**...." + NEW_LINE +
                "..*..." + NEW_LINE +
                "..*..." + NEW_LINE +
                "..*..." + NEW_LINE +
                "..*..." + NEW_LINE +
                "..*..." + NEW_LINE +
                "..*..." + NEW_LINE +
                "..*...";

        Cell[][] expectedCells = {
                {DEAD_CELL, DEAD_CELL, DEAD_CELL, DEAD_CELL, DEAD_CELL, DEAD_CELL},
                {LIVE_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL, DEAD_CELL, DEAD_CELL},
                {DEAD_CELL, DEAD_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL, DEAD_CELL},
                {DEAD_CELL, DEAD_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL, DEAD_CELL},
                {DEAD_CELL, DEAD_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL, DEAD_CELL},
                {DEAD_CELL, DEAD_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL, DEAD_CELL},
                {DEAD_CELL, DEAD_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL, DEAD_CELL},
                {DEAD_CELL, DEAD_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL, DEAD_CELL},
                {DEAD_CELL, DEAD_CELL, LIVE_CELL, DEAD_CELL, DEAD_CELL, DEAD_CELL},
>>>>>>> 18051323061c9d96d348a71113bde562441a0ca8
        };

        GridReader gridReader = new GridReader();
        Cell[][] loadedCells = gridReader.loadFrom(gridContents);

        assertThat(loadedCells, is(expectedCells));
    }
}