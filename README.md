---

# TicTacToe Game

This is a simple console-based TicTacToe game implemented in Java. The game allows a human player to play against the computer.

## How to Play

1. The game starts with an empty 3x3 board.
2. Players take turns choosing a position on the board to place their symbol (`X` for the player and `O` for the computer).
3. The positions are numbered from 1 to 9 as follows:
   ```
   1 | 2 | 3
   -+-+-+- 
   4 | 5 | 6
   -+-+-+- 
   7 | 8 | 9
   ```
4. The player is prompted to choose a position by entering a number between 1 and 9.
5. The computer then makes its move by randomly choosing an available position.
6. The game continues until:
   - A player wins by getting three of their symbols in a row (vertically, horizontally, or diagonally).
   - The board is full, resulting in a tie.

## Code Overview

- `main`: The main method initializes the game and handles the game loop.
- `isGameOver`: Checks if the game has ended, either by a player winning or by the board being full (a tie).
- `hasContestentWon`: Determines if a player (either human or computer) has won by checking all possible winning combinations.
- `computerMove`: Handles the computer's move by randomly selecting an available position.
- `isValidMove`: Checks if a move is valid (i.e., the chosen position is not already occupied).
- `playerMove`: Prompts the player to make a move and validates the input.
- `placeMove`: Places the player's or computer's symbol on the board.
- `printBoard`: Displays the current state of the board.

## Running the Game

To run the game, compile the `TicTacToe.java` file and run the resulting class file.

```bash
javac TicTacToe.java
java TicTacToe
```

## Future Improvements

- Improve the computer's strategy to make it more challenging.
- Add a GUI for a more interactive experience.
- Implement a two-player mode.

---
