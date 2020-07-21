package ru.job4j.chess;

public class ImpossibleMoveException extends Exception {
    @Override
    public String getMessage() {
        return "The path to the destination cell is busy";
    }
}
