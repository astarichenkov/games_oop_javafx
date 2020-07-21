package ru.job4j.chess;

public class FigureNotFoundException extends Exception {
    @Override
    public String getMessage() {
        return "The figure was not found";
    }
}

