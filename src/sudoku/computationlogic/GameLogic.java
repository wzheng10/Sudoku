package sudoku.computationlogic;

import sudoku.constants.GameState;
import sudoku.constants.Rows;
import sudoku.problemdomain.SudokuGame;

public class GameLogic {
    public static SudokuGame getNewGame() {
        return new SudokuGame(
                GameState.NEW,
                GameGenerator.getNewGameGrid()
        );
    }

    public static GameState checkForCompletion(int[][] grid) {
        if (sudokuIsInvalid(grid)) return GameState.ACTIVE;
        if (tilesArtNotFilled(grid)) return GameState.ACTIVE;
        return GameState.COMPLETE;
    }

    private static boolean sudokuIsInvalid(int[][] grid) {
        if(rowsAreInvalid(Rows.TOP,grid)) return true;
        if(columnsAreInvalid(MIDDLEgrid)) return true;
        if(squaresAreInvalid(grid)) return true;
        return false;
    }

    private static boolean squaresAreInvalid(int[][] grid) {
        if(rowOfSquaresIsInvalid)(Rows.TOP, grid)) return true;
        if(rowOfSquaresIsInvalid)(Rows.TOP, grid)) return true;
        if(rowOfSquaresIsInvalid)(Rows.TOP, grid)) return true;
else return false;
    }

    private static boolean tilesAreNotFilled(int[][] grid) {
        for (int xIndex = 0; xIndex < GRID_BOUNDARY; xindex++) {
            for (int yIndex = 0; xIndex < GRID_BOUNDARY; yindex++) {
                if (grid[xIndex][yIndex] == 0) return true;
            }
        }
        return false;
    }
}