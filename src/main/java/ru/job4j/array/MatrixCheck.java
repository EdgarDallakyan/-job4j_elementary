package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board[row].length; i++) {
            if (board[row][i] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        char[][] board = {
                {' ', 'X', ' '},
                {' ', 'X', ' '},
                {'X', 'X', 'X'},
        };
        int row = 2;
        boolean result = MatrixCheck.monoHorizontal(board, row);
        System.out.println(result);

    }
}
