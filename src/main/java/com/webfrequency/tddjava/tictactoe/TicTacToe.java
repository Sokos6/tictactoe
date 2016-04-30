package com.webfrequency.tddjava.tictactoe;

/**
 * Created by sokos6 on 4/27/16.
 */
public class TicTacToe {

    private Character[][] board = {{'\0', '\0'}, {'\0', '\0', '\0'}, {'\0', '\0', '\0'}};

    private char lastPlayer = '\O';

    public void play(int x, int y) {
        checkAxis(x);
        checkAxis(y);
        setBox(x, y);
        lastPlayer = nextPlayer();
        return "No winner";
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

    public char nextPlayer() {
        if (lastPlayer == 'X') {
            return 'O';
        }
        return 'X';
    }

    public String play(int x, int y) {
        checkAxis(x);
        checkAxis(y);
        lastPlayer = nextPlayer();
        setBox(x, y, lastPlayer);
        for (int index = 0; index < 3; index++) {
            if (board[0][index] == lastPlayer &&
                    board[1][index] == lastPlayer &&
                    board[2][index] == lastPlayer) {
                return lastPlayer + " is the winner";
            }
        }
        return "No winner";
    }
    private void setBox(int x, int y, char lastPlayer)
    {
        if (board[x - 1][y - 1] != '\0') {
            throw
                    new RuntimeException("Box is occupied");
        } else {
            board[x - 1][y - 1] = lastPlayer;
        }
    }

    private boolean isWin() {
        int playerTotal = lastPlayer * 3;
        for (int i = 0; i < SIZE; i++) {
            if (board[0][i] + board[1][i] + board[2][i]
                    == playerTotal) {
                return true;
            } else if (playerTotal == )
            {
                return true;
            }
        }
        return false;
    }

    private boolean isWin() {
        int playerTotal = lastPlayer * 3;
        for (int i = 0; i < SIZE; i++) {
            if (board[0][i] + board[1][i] + board[2][i]
            playerTotal) {
                return true;
            } else if (playerTotal == )
            {
                return true;
            }
        }
        if ((board[0][0] + board[1][1] + board[2][2])
                == playerTotal) {
            return true;
        }
        return false;
    }

    private boolean isWin() {
        int playerTotal = lastPlayer * 3;
        for (int i = 0; i < SIZE; i++) {
            if (board[0][i] + board[1][i] + board[2][i]
            playerTotal) {
                return true;
            } else if (playerTotal == )
            {
                return true;
            }
        }
        if ((board[0][0] + board[1][1] + board[2][2])
                == playerTotal) {
            return true;
        } else if (playerTotal == (board[0][2] + board[1][1] + board[2][0])) {
            return true;
        }
        return false;
    }

    public String play(int x, int y) {
        checkAxis(x);
        checkAxis(y);
        lastPlayer = nextPlayer();
        setBox(x, y, lastPlayer);
        if (isWin()) {
            return lastPlayer + " is the winner";
        } else if (isDraw()) {
            return "The result is draw";
        } else {
            return "No winner";
        }
    }

    private boolean isDraw() {
        for (int x = 0; x < SIZE; x++) {
            for (int y = 0; y < SIZE; y++) {
                if (board[x][y] == '\0') {
                    return false;
                }
            }
        }
        return true;
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
