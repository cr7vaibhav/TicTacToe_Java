import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) throws Exception {
        char[][] board = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };

        printBoard(board);

        Scanner sc = new Scanner(System.in);
        playerTurn(board, sc);

        printBoard(board);

    }

    private static void playerTurn(char[][] board, Scanner sc) {
        System.out.println("Where would you like to play (1-9)");
        String userInput = sc.nextLine();

        // System.out.println(userInput);

        // switch case to take userInput and put in the board array
        switch (userInput) {
            case "1":
                board[0][0] = 'X';
                break;

            case "2":
                board[0][1] = 'X';
                break;

            case "3":
                board[0][2] = 'X';
                break;

            case "4":
                board[1][0] = 'X';
                break;

            case "5":
                board[1][1] = 'X';
                break;

            case "6":
                board[1][2] = 'X';
                break;

            case "7":
                board[2][0] = 'X';
                break;

            case "8":
                board[2][1] = 'X';
                break;

            case "9":
                board[2][2] = 'X';
                break;

            default:
                System.out.println("D:");
                break;
        }
    }

    // method to print the board
    private static void printBoard(char[][] board) {
        System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("-+-+-");
        System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("-+-+-");
        System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
    }
}
