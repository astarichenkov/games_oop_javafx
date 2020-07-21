package ru.job4j.chess.firuges.black;

import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import java.util.Comparator;

public class BishopBlack implements Figure {
    private final Cell position;

    public BishopBlack(final Cell ps) {
        position = ps;
    }

    @Override
    public Cell position() {
        return position;
    }

    //    @Override
//    public Cell[] way(Cell source, Cell dest) {
//        throw new IllegalStateException(
//                String.format("Could not way by diagonal from %s to %s", source, dest)
//        );
//    }
    @Override
    public Cell[] way(Cell source, Cell dest) {
        if (!isDiagonal(source, dest)) {
            throw new IllegalStateException(
                    String.format("Could not move by diagonal from %s to %s", source, dest)
            );
        }
        int size = Math.abs(dest.getX() - source.getX());
        Cell[] steps = new Cell[size];
        int deltaX = dest.getX() - source.getX() > 0 ? 1 : -1;
        int deltaY = dest.getY() - source.getY() > 0 ? 1 : -1;
        int x = source.getX();
        int y = source.getY();
        for (int index = 0; index < size; index++) {
            x += deltaX;
            y += deltaY;
            steps[index] = Cell.findBy(x, y);
        }
        return steps;
    }

    public boolean isDiagonal(Cell source, Cell dest) {
        int deltaX = Math.abs(dest.getX() - source.getX());
        int deltaY = Math.abs(dest.getY() - source.getY());
        if (deltaX == deltaY) {
            return true;
        }
        return false;
    }

    @Override
    public Figure copy(Cell dest) {
        return new BishopBlack(dest);
    }
}
