package sample;

public class Game {

    private static String[][] board = new String[3][3];
    private static String won = "0";
    private static String currentplayer = "X";

    public static void game() {
        for (int e = 0; e < 3; e++) {
            board[0][e] = "0";
        }
        for (int e = 0; e < 3; e++) {
            board[1][e] = "0";
        }
        for (int e = 0; e < 3; e++) {
            board[2][e] = "0";
        }
        won="0";
        currentplayer="X";

    }

    public static void setBoard(int row, int column, String insert) {

        board[row][column] = insert;


    }

    public static String getBoard(int row, int column) {
        return board[row][column];


    }

    public static String getCurrentplayer() {
        return currentplayer;
    }

    public static void setCurrentplayer() {
        if (currentplayer.equals("X")) {
            currentplayer = "O";
        } else if (currentplayer.equals("O")) {
            currentplayer = "X";
        }

    }

    public static void getWon() {

        if ((board[0][0].equals("X")&&board[0][1].equals("X")&&board[0][2].equals("X"))||(board[1][0].equals("X")&&board[1][1].equals("X")&&board[1][2].equals("X"))||(board[2][0].equals("X")&&board[2][1].equals("X")&&board[2][2].equals("X"))||(board[0][0].equals("X")&&board[1][0].equals("X")&&board[2][0].equals("X"))||(board[0][1].equals("X")&&board[1][1].equals("X")&&board[2][1].equals("X"))||(board[0][2].equals("X")&&board[1][2].equals("X")&&board[2][2].equals("X"))||(board[0][0].equals("X")&&board[1][1].equals("X")&&board[2][2].equals("X"))||(board[0][2].equals("X")&&board[1][2].equals("X")&&board[2][2].equals("X"))||(board[2][0].equals("X")&&board[1][1].equals("X")&&board[0][2].equals("X"))) {
           Main.setChangeScene("X");


        }
        if ((board[0][0].equals("O")&&board[0][1].equals("O")&&board[0][2].equals("O"))||(board[1][0].equals("O")&&board[1][1].equals("O")&&board[1][2].equals("O"))||(board[2][0].equals("O")&&board[2][1].equals("O")&&board[2][2].equals("O"))||(board[0][0].equals("O")&&board[1][0].equals("O")&&board[2][0].equals("O"))||(board[0][1].equals("O")&&board[1][1].equals("O")&&board[2][1].equals("O"))||(board[0][2].equals("O")&&board[1][2].equals("O")&&board[2][2].equals("O"))||(board[0][0].equals("O")&&board[1][1].equals("O")&&board[2][2].equals("O"))||(board[0][2].equals("O")&&board[1][2].equals("O")&&board[2][2].equals("O"))||(board[2][0].equals("O")&&board[1][1].equals("O")&&board[0][2].equals("O"))) {
            Main.setChangeScene("O");

        }
        }
    }
