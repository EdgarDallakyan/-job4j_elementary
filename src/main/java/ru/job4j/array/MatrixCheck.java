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

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board[column].length; i++) {
            if (board[i][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        char[][] board = {
                {' ', 'X', 'X'},
                {' ', 'X', 'X'},
                {'X', 'X', 'X'},
        };
        int row = 2;
        int column = 1;
        boolean result = MatrixCheck.monoHorizontal(board, row);
        result = MatrixCheck.monoVertical(board, column);
        System.out.println(result);

    }
}
