package com.cleancode.cleancode.chapter2.c01;

import java.util.ArrayList;
import java.util.List;

public class GoodNaming {

    int elapsedTimeInDays;
    int daysSinceCreation;
    int dayssinceModification;
    int fileAgeInDays;

    public List<Cell> getFlaggedCells(Cell[] gameBoard) {
        List<Cell> flaggedCells = new ArrayList<Cell>();
        for (Cell cell : gameBoard)
            if(cell.isFlagged())
                flaggedCells.add(cell);
        return flaggedCells;
    }
}
