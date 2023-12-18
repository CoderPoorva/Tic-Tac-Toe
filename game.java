import java.util.Scanner;

class game{
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        char c='Y';
        
        while(c=='Y'){
          char board[][]=new char[3][3];

        char player='X';
        int count=9;

        for(int row=0;row<3;row++){
            for(int col=0;col<3;col++){
                board[row][col]=' ';
            }
        }
       
        boolean gameover=false;

        while(!gameover){
         printboard(board);
         System.out.println("Player "+player+" enter:");
         int row=sc.nextInt();
         int col=sc.nextInt();
         if(board[row][col]==' '){
            board[row][col]=player;
            count-=1;
            gameover = hasWon(board,player);
           if(gameover){
            printboard(board);
            System.out.println("Player "+player+" Won\nCongratulations");
           }
            else{
            player=(player=='X')?'O':'X';
          }
        }
         else{
            System.out.println("Invalid Input.better luck next time");
         }

         if(count==0){
         System.out.println("It's a Draw!!");
         gameover=true;
         }
        }
          System.out.println("To play another round enter Y, else N");
          c=sc.next().charAt(0);
        }
        
    }
        
        public static boolean hasWon(char board[][],char player){
            for(int row=0;row<3;row++){
             if(board[row][0]==player &&board[row][1]==player&&board[row][2]==player){
                return true;
             }
             else if(board[0][row]==player &&board[1][row]==player&&board[2][row]==player){
                return true;
             }
            }
            if((board[0][0]==player &&board[1][1]==player&&board[2][2]==player)||board[2][0]==player &&board[1][1]==player&&board[0][2]==player)
             return true;

             return false;
        }

        public static void printboard(char board[][]){  

            for(int row=0;row<3;row++){
                for(int col=0;col<3;col++){
                    System.out.print("|"+ board[row][col]+"|");
                }
                System.out.println();
            }

        }
    }
