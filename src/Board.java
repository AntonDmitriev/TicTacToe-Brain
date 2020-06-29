public class Board {
    private int[][] realBoard;
    private boolean moveCheck;

    public Board (){
        this.realBoard = new int[3][3];

    }

    public void setUpRealBoard(){
        for (int i = 0; i<realBoard[0].length; i ++){
            for (int z = 0; z<realBoard[1].length; z++){
                realBoard[i][z] = 0;
                //Indicates the starter board, where no value has been placed
                //realBoard will only have a value of 0,1,2
            }
        }
    }



    public void printBoard(){
        int squareNumber = 0;
        for (int i = 0; i<realBoard[0].length; i++){
            //squareNumber++;
            for (int z = 0; z<realBoard[1].length; z++){
                squareNumber++;

                if (realBoard[i][z] == 1){
                    System.out.print("X");
                }
                else if (realBoard[i][z] == 2){
                    System.out.print("O");
                }
                else {
                    System.out.print(squareNumber);
                }

            }
            System.out.println(" ");
            //System.out.println("-----------------");
        }
        System.out.println(" ");
    }

    public void changeBoard(int sqNum, int realValue){
        //System.out.println(sqNum);
        boolean moveOk = true;
        int squareNumber = 0;
        for (int i = 0; i<realBoard[0].length; i++){
            //squareNumber++;
            for (int z = 0; z<realBoard[1].length; z++){
                moveOk = moveCheck(i,z,sqNum);
                //System.out.println(moveOk);
                squareNumber++;
                if ((squareNumber == sqNum)&&(moveOk)){
                    realBoard[i][z] = realValue;
                    this.moveCheck = true;
                }
                else if (((squareNumber == sqNum)&&(moveOk == false))){
                    //moveCheck(sqNum);
                    this.moveCheck = false;

                }
            }

            //System.out.println("-----------------");

        }

    }

    private boolean moveCheck(int i, int z,int sqNum){ //Makes sure the move is within the rules before the realBoard gets changed and printed
        Boolean bool = true;
        Boolean validRange = true;
        Boolean notAlreadyUsed = true;

        if (realBoard[i][z] == 0){
            notAlreadyUsed = true;
        }
        else {
            //System.out.println("Sorry this space has already been used... Try again, loser boy!"); //Couldnt get this to print properly. maybe later
            notAlreadyUsed = false;
        }


        if ((sqNum<=9)&&(sqNum>=1)){
            validRange = true;
        }
        else{
            validRange = false;
            //System.out.println("Sorry this number is too large, and doesn't fit on the board... Try again, stinky head!"); //Couldnt get this to print properly. maybe later
        }
        //System.out.println(bool);

        //System.out.println("ValidRange: "+validRange);

        if (validRange && notAlreadyUsed){
            bool = true;
        }
        else{
            bool = false;
        }

        return bool;
    }

    public boolean getMoveCheck(){
        //System.out.println("MoveCheck: "+this.moveCheck);
        return this.moveCheck;
    }

    /*
    public boolean moveCheck(int sqNum){ //Kind of redundant but oh well. The first moveCheck is private and only works within the changeBoard function
                                            //This one is public and is meant to manipulate the while loop in Game, in case the move is illegal.
        if ((sqNum>9)||(sqNum<1)){
            System.out.println("Sorry this number is too large, and doesn't fit on the board... Try again, stinky head!");
            bool = false;

        }
        else{
            for (int i = 0; i < realBoard[0].length; i++) {
                //squareNumber++;
                for (int z = 0; z < realBoard[1].length; z++) {
                    if (realBoard[i][z] == 0) {
                        bool = true;
                    } else {
                        bool = false;
                    }
                }

                //System.out.println("-----------------");
            }
        }
        //System.out.println(bool);





        return bool;
    }
*/


    public int[][] getRealBoard() {
        return realBoard;
    }

    public void setRealBoard(int[][] realBoard) {
        this.realBoard = realBoard;
    }
}
