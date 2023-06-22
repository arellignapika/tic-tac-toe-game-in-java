# tic-tac-toe-game-in-java

The code implements a simple Tic-Tac-Toe game using a two-dimensional array in Java. 
The program allows two players to take turns entering their moves until a winner is determined or the game ends in a draw.

### methods :

#### check method:
The check method is responsible for validating the player's move and checking if it leads to a win. It prompts the current player to input the indices (i, j) where they want to place their mark ( player 1 marks 0 and player 2 marks  1) on the game board. It then checks for winning conditions by calling other helper methods.
#### checkRow method:
The checkRow method checks if the current move creates a winning row by iterating over the elements in the same column as the move and counting the number of matches with the player's mark.
#### checkColumn method:
The checkColumn method checks for a winning column by iterating over the elements in the same row as the move and counting the number of matches with the player's mark.
#### checkDiagonal method:
The checkDiagonal1 and checkDiagonal2 methods handle the two diagonal win conditions. </br>
checkDiagonal1 checks the diagonal from the top-left corner to the bottom-right corner . </br>
checkDiagonal2 checks the diagonal from the top-right corner to the bottom-left corner.

If any of the checks result in a complete row, column, or diagonal filled with the current player's mark, the corresponding method returns true, indicating a win. Otherwise, the game continues until a winner is determined or all cells are filled, resulting in a draw.
