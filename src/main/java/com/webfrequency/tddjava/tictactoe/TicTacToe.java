package com.webfrequency.tddjava.tictactoe;

/**
 * Created by sokos6 on 4/27/16.
 */
public class TicTacToe {

    private Character[][] board = {{'\0', '\0'}, {'\0', '\0', '\0'}, {'\0', '\0', '\0'}};

    public void play(int x, int y) {
        checkAxis(x);
        checkAxis(y);
        setBox(x, y);
    }

    private void checkAxis(int axis) {
        if (axis < 1 || axis > 3) {
            throw
            new RuntimeException("X is outside board");
        }
    }

    private void setBox(int x, int y) {
        if (board[x - 1][y - 1] != '\0') {
            throw
            new RuntimeException("Box occupied");
        } else {
            board[x - 1][y - 1] = 'X';
        }
    }





// REFACTORED
//        if (x < 1 || x > 3) {
//            throw
//            new RuntimeException("X is outside board");
//        } else if (y < 1 || y > 3) {
//            throw
//            new RuntimeException("Y is outside board");
//        }
//        if (board[x - 1][y - 1] != '\0') {
//            throw
//            new RuntimeException("Box is occupied");
//        } else {
//            board[x - 1][y - 1] = 'X';
//        }


}
