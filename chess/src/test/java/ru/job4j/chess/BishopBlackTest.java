package ru.job4j.chess;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BishopBlackTest {
    @Test
    public void positionTest() {
        BishopBlack bishopBlack = new BishopBlack(Cell.D4);
        Cell result = bishopBlack.position();
        assertThat((result), is(Cell.D4));
    }

    @Test
    public void copyTest() {
        BishopBlack bishopBlack = new BishopBlack(Cell.D4);
//        bishopBlack.copy(Cell.C5);
        Cell result =  bishopBlack.copy(Cell.C5).position();
        assertThat(result, is(Cell.C5));
    }

    @Test
    public void wayTest() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] result = bishopBlack.way(Cell.C1, Cell.G5);
        Cell[] expected = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(result, is(expected));
    }

}
