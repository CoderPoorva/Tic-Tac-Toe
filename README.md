TIC TAC TOE GAME IN JAVA

Introduction :
This is a simple implementation of the classic Tic Tac Toe game in Java. The game allows two players to take turns marking spaces on a 3x3 grid. The player who succeeds in placing three of their marks in a horizontal, vertical, or diagonal row wins the game.

How to Play :
Compile the Code:

Make sure you have Java installed on your machine.
Open a terminal or command prompt.
Navigate to the directory containing the TicTacToe.java file.
Compile the code using the command: javac TicTacToe.java

Run the Game:

After successful compilation, run the game with the command: java TicTacToe
The game will start, and you will be prompted to enter your moves.

Enter Moves:

Players take turns entering their moves.
Enter the row and column numbers (0, 1, or 2) to place your mark on the board.

Winning the Game:

The game continues until one player wins or the board is full, resulting in a draw.
The program will display the winner or declare a draw accordingly.
Code Structure
The code is organized into the following classes:

TicTacToe:

Contains the main method to start the game.
Manages the game loop and player turns.

Board:

Represents the game board.
Includes methods for displaying the board, making moves, and checking for a winner.
Player:

Represents a player in the game.
Stores the player's mark (X or O).
