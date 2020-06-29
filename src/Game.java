
import java.util.Scanner;

public class Game {
    private Board board;
    private Player player1;
    private Player player2;
    private int turn;
    //private Player winner; //For later use


    public Game(){
        this.board = new Board();
        this.player1 = new Player(board,'x',1);
        this.player2 = new Player(board,'o',2);
        this.turn = 1;
    }


    public void newGame(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Player 1, will be represented by the "+player1.getCharacter()+" character.");
        System.out.println("Player 2, will be represented by the "+player2.getCharacter()+" character.");

        System.out.println("Are you ready to start the game? Please type 'Yes' or 'No'.");

        if (scanner.nextLine().toLowerCase().equals("yes")){
            playGame();

        }
        else {
            System.out.println("See you next time, poopy...");
        }


        scanner.close();
    }

    private void playGame(){
        Scanner scanner = new Scanner(System.in);
        board.setUpRealBoard();
        int numEntered;
        boolean game = true;
        boolean passMoveTest = true;
        Player first = firstMove();
        Player current = first;
        System.out.println("Player "+current.getRealValue()+" is going first!");

        while (game){



            board.printBoard();
            System.out.println("You are currently on turn #"+turn+".");
            System.out.println("Player "+current.getRealValue()+"'s turn. Please enter the number square you would like to change.");
            numEntered = scanner.nextInt();
            current.move(numEntered);

            passMoveTest = board.getMoveCheck();



            if (passMoveTest) {
                turn++;
                if ((turn % 2) == 0) {
                    current = this.player2;
                } else {
                    current = this.player1;
                }
            }

        }
        scanner.close();
    }

    private Player firstMove(){ //Maybe get this to work randomized later
        /*
        double rand = Math.random(); //basically just does a coinflip to decide which player is going first
        if (rand <= 0.5){
            return player1;

        }
        else {
            return player2;
        }
        */
        return player1;
    }
/*
    private Player checkWinner(){




    }
*/
}
