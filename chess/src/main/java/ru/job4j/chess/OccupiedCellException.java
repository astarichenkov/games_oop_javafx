package ru.job4j.chess;

public class OccupiedCellException extends Exception {
    @Override
    public String getMessage() {
        return "Cell is occupied by another figure";
    }
}
