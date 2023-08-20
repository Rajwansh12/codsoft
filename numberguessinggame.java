import java.util.Scanner.*;
import java.util.*;


public class numberguessinggame {
    public static void main(String[] args) {
       try( Scanner sc = new Scanner(System.in)){
        Random random = new Random();
        int minRange =1;
        int maxRange=100;
        int maxAttempt=5;
        int score=0;
      

        System.out.println("Welcome to number Guessing Game");
        System.out.println("Your total Attempt is " +maxAttempt);

        do{
           int targetnumber = random.nextInt(maxRange - minRange +1)+minRange;
           System.out.println("Guess number between 1 to 100 " ); 

           for(int attempt =1; attempt<=maxAttempt ; attempt++ ){
            System.out.println("Attempt " + attempt + "  Enter your guess number :");
           int guess= sc.nextInt();

          
            if(guess == targetnumber){
                System.out.println("congratulations ! you guessed the correct number");
                score++;
                break;
            }else if(guess<targetnumber){
                System.out.println("Too low, try again");

            }else{
                System.out.println("Too high, try again");
            }

            if(attempt == maxAttempt){
                System.out.println("sorry you run out of attempt");
            }
        }
        System.out.println("Do you want to play again yes no");
    }while(sc.next().equalsIgnoreCase("yes"));
    System.out.println("your final score is :" +score);
      sc.close();



           }
        }


    }
    

