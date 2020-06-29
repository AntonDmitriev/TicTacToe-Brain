public class Board {
    private int[][] realBoard;

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
        for (int i = 0; i<realBoard[0].length; i++){

            for (int z = 0; z<realBoard[1].length; z++){

                if (realBoard[i][z] == 1){
                    System.out.print("X");


                }
                else if (realBoard[i][z] == 2){
                    System.out.print("O");

                }
                else {
                    System.out.print("#");

                }

            }
            System.out.println(" ");
            //System.out.println("-----------------");

        }

    }



}
