package TicTacToeMethods;

public class Main
{
    public static void main(String[] args)
    {

        TicTacToe game = new TicTacToe();
        System.out.println("Initial Game Board:");
        game.printBoard();

        //Prints the first row of turns taken
        for(int row = 0; row < 3; row++)
        {
            if(game.pickLocation(0, row))
            {
                game.takeTurn(0, row);
            }
        }
        System.out.println("\nAfter three turns:");
        game.printBoard();



    }

}
