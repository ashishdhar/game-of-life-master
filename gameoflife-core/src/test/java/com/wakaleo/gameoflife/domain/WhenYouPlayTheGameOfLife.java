package com.wakaleo.gameoflife.domain;

import org.junit.Test;

import com.wakaleo.gameoflife.domain.Universe;

import static com.wakaleo.gameoflife.domain.Universe.seededWith;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class WhenYouPlayTheGameOfLife {

<<<<<<< HEAD
	private final String NEW_LINE = System.getProperty("line.separator");

    @Test
    public void aDeadCellWithNoNeighboursShouldRemainDeadInTheNextGeneration() {
        String initialGrid = "..." + NEW_LINE + 
                             "..." + NEW_LINE +
                             "...";

        String expectedNextGrid = "..." + NEW_LINE + 
                                  "..." + NEW_LINE + 
                                  "..." + NEW_LINE + "";
=======
    private final String NEW_LINE = System.getProperty("line.separator");

    @Test
    public void aDeadCellWithNoNeighboursShouldRemainDeadInTheNextGeneration() {
        String initialGrid = "..." + NEW_LINE +
                "..." + NEW_LINE +
                "...";

        String expectedNextGrid = "..." + NEW_LINE +
                "..." + NEW_LINE +
                "..." + NEW_LINE + "";
>>>>>>> 18051323061c9d96d348a71113bde562441a0ca8

        Universe theUniverse = new Universe(seededWith(initialGrid));
        theUniverse.createNextGeneration();

        String nextGrid = theUniverse.getGrid();
        assertThat(nextGrid, is(expectedNextGrid));
    }
<<<<<<< HEAD
    
    @Test 
    public void aDeadCellWithOneLiveNeighbourShouldRemainDeadInTheNextGeneration() {
        String initialGrid = "..." + NEW_LINE + 
                             ".*." + NEW_LINE +
                             "...";

        String expectedNextGrid = "..." + NEW_LINE + 
                                  "..." + NEW_LINE + 
                                  "..." + NEW_LINE + "";
=======

    @Test
    public void aDeadCellWithOneLiveNeighbourShouldRemainDeadInTheNextGeneration() {
        String initialGrid = "..." + NEW_LINE +
                ".*." + NEW_LINE +
                "...";

        String expectedNextGrid = "..." + NEW_LINE +
                "..." + NEW_LINE +
                "..." + NEW_LINE + "";
>>>>>>> 18051323061c9d96d348a71113bde562441a0ca8

        Universe theUniverse = new Universe(seededWith(initialGrid));
        theUniverse.createNextGeneration();

        String nextGrid = theUniverse.getGrid();
        assertThat(nextGrid, is(expectedNextGrid));
    }

    @Test
    public void liveCellaWith2or3iveNeighbourShouldRemainAliveInTheNextGeneration() {
<<<<<<< HEAD
        String initialGrid = "**." + NEW_LINE + 
                             "**." + NEW_LINE +
                             "...";

        String expectedNextGrid = "**." + NEW_LINE + 
                                  "**." + NEW_LINE + 
                                  "..." + NEW_LINE + "";
=======
        String initialGrid = "**." + NEW_LINE +
                "**." + NEW_LINE +
                "...";

        String expectedNextGrid = "**." + NEW_LINE +
                "**." + NEW_LINE +
                "..." + NEW_LINE + "";
>>>>>>> 18051323061c9d96d348a71113bde562441a0ca8

        Universe theUniverse = new Universe(seededWith(initialGrid));
        theUniverse.createNextGeneration();

        String nextGrid = theUniverse.getGrid();
        assertThat(nextGrid, is(expectedNextGrid));
    }
<<<<<<< HEAD
    
    
    @Test
    public void aLiveCellWithExactlyTwoLiveNeighbourShouldRemainAliveInTheNextGeneration() {
        String initialGrid = "..." + NEW_LINE + 
                             "***" + NEW_LINE +
                             "..." + NEW_LINE + "";

        String expectedNextGrid = ".*." + NEW_LINE + 
                                  ".*." + NEW_LINE + 
                                  ".*." + NEW_LINE + "";
=======

    @Test
    public void aLiveCellWithExactlyTwoLiveNeighbourShouldRemainAliveInTheNextGeneration() {
        String initialGrid = "..." + NEW_LINE +
                "***" + NEW_LINE +
                "..." + NEW_LINE + "";

        String expectedNextGrid = ".*." + NEW_LINE +
                ".*." + NEW_LINE +
                ".*." + NEW_LINE + "";
>>>>>>> 18051323061c9d96d348a71113bde562441a0ca8

        Universe theUniverse = new Universe(seededWith(initialGrid));
        theUniverse.createNextGeneration();

        String nextGrid = theUniverse.getGrid();
        assertThat(nextGrid, is(expectedNextGrid));
    }
<<<<<<< HEAD
    
    

    @Test
    public void aCellWithNoNeighboursShouldDieInTheNextGeneration() {
        String initialGrid = "..." + NEW_LINE + 
                             "..." + NEW_LINE +
                             "..." + NEW_LINE + "";

        String expectedNextGrid = "..." + NEW_LINE + 
                                  "..." + NEW_LINE + 
                                  "..." + NEW_LINE + "";
=======

    @Test
    public void aCellWithNoNeighboursShouldDieInTheNextGeneration() {
        String initialGrid = "..." + NEW_LINE +
                "..." + NEW_LINE +
                "..." + NEW_LINE + "";

        String expectedNextGrid = "..." + NEW_LINE +
                "..." + NEW_LINE +
                "..." + NEW_LINE + "";
>>>>>>> 18051323061c9d96d348a71113bde562441a0ca8

        Universe theUniverse = new Universe(seededWith(initialGrid));
        theUniverse.createNextGeneration();

        String nextGrid = theUniverse.getGrid();
        assertThat(nextGrid, is(expectedNextGrid));
    }
}
