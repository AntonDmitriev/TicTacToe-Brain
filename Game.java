import java.util.Scanner;

public class Game {
    private Board board;
    private String player1;
    private String player2;



    public Game(Board board, String player1, String player2){
        this.board = board;
        this.player1 = player1;
        this.player2 = player2;
    }

    public void newGame(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Player 1, will be represented by the X character.");
        System.out.println("Player 2, will be represented by the Y character.");

        System.out.println("Are you ready to start the game? Please type 'Yes' or 'No'.");

        if (scanner.nextLine().toLowerCase().equals("yes")){
            playGame();

        }
        else {
            System.out.println("See you next time, poopy...");
        }



    }

    private void playGame(){
        board.setUpRealBoard();
        board.printBoard();
        boolean game = true;
        while (game){





        }
    }


}
