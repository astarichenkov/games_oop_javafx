package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        StringBuilder row = new StringBuilder();
        StringBuilder column = new StringBuilder();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                row.append(board[j][i]);
                column.append(board[i][j]);
            }
            row.append("-");
            column.append("-");
        }
        if (row.toString().contains("11111") || column.toString().contains("11111")) {
            rsl = true;
        }
        return rsl;
    }
}
