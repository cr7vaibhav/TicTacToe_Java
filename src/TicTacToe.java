import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) throws Exception {
        char[][] board = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };
        Scanner sc = new Scanner(System.in);
        printBoard(board);

        while (true) {
            playerMove(board, sc);
            if (isGameOver(board)) {
                break;
            }
            printBoard(board);

            computerMove(board);
            if (isGameOver(board)) {
                break;
            }
            printBoard(board);
        }

        // printBoard(board);
        // sc.close();

    }

    private static boolean isGameOver(char[][] board) {
        if(hasContestentWon(board, 'X')){
            printBoard(board);
            System.out.println("Player wins !");
            return true;
        }

        if(hasContestentWon(board, 'O')){
            printBoard(board);
            System.out.println("Computer wins !");
            return true;
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }

        printBoard(board);
        System.out.println("The game ended in a tie");
        return true;
    }

    private static boolean hasContestentWon(char[][] board, char symbol) {
        if (( // rows
        board[0][0] == symbol && board[0][1] == symbol && board[0][2] == symbol)
                || (board[1][0] == symbol && board[1][1] == symbol && board[1][2] == symbol)
                || (board[2][0] == symbol && board[2][1] == symbol && board[2][2] == symbol)
                // cols
                || (board[0][0] == symbol && board[1][0] == symbol && board[2][0] == symbol)
                || (board[0][1] == symbol && board[1][1] == symbol && board[2][1] == symbol)
                || (board[0][2] == symbol && board[1][2] == symbol && board[2][2] == symbol)
                // diag
                || (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol)
                || (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol)) {

            return true;
        }
        return false;
    }

    private static void computerMove(char[][] board) {
        Random rad = new Random();
        int computerMove;
        while (true) {
            computerMove = rad.nextInt(9) + 1; // gives no between 0-9 +1
            if (isValidMove(board, computerMove)) {
                break;
            }
        }
        System.out.println("Computer choose: " + computerMove);
        placeMove(board, Integer.toString(computerMove), 'O');
    }

    // checks if its a valid move
    private static boolean isValidMove(char[][] board, int position) {
        switch (position) {
            case 1:
                return (board[0][0] == ' ');

            case 2:
                return (board[0][1] == ' ');

            case 3:
                return (board[0][2] == ' ');

            case 4:
                return (board[1][0] == ' ');

            case 5:
                return (board[1][1] == ' ');

            case 6:
                return (board[1][2] == ' ');

            case 7:
                return (board[2][0] == ' ');

            case 8:
                return (board[2][1] == ' ');

            case 9:
                return (board[2][2] == ' ');

            default:
                return false;
        }
    }

    // method for player turn
    private static void playerMove(char[][] board, Scanner sc) {
        String userInput;
        while (true) {
            System.out.println("Where would you like to play (1-9)");
            userInput = sc.nextLine();
            if (isValidMove(board, Integer.parseInt(userInput))) {
                break;
            } else {
                System.out.println(userInput + " is not a valid move");
            }
        }
        placeMove(board, userInput, 'X');
    }

    private static void placeMove(char[][] board, String position, char symbol) {
        // switch case to take Input and put in the board array
        switch (position) {
            case "1":
                board[0][0] = symbol;
                break;

            case "2":
                board[0][1] = symbol;
                break;

            case "3":
                board[0][2] = symbol;
                break;

            case "4":
                board[1][0] = symbol;
                break;

            case "5":
                board[1][1] = symbol;
                break;

            case "6":
                board[1][2] = symbol;
                break;

            case "7":
                board[2][0] = symbol;
                break;

            case "8":
                board[2][1] = symbol;
                break;

            case "9":
                board[2][2] = symbol;
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
