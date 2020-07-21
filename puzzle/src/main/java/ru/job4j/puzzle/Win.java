package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            if (monoHorizontal(board, i)) {
                return true;
            }
        }
        for (int j = 0; j < board.length; j++) {
            if (monoVertical(board, j)) {
                return true;
            }
        }
        return false;
    }

    private static boolean monoHorizontal(int[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board[row].length; i++) {
            if (board[row][i] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }

    private static boolean monoVertical(int[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board[column].length; i++) {
            if (board[i][column] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }
}