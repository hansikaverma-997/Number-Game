import java.util.Random;
import java.util.Scanner;

public class NumberGame{
     public static void main(String[] args){
         //Define upper and lower bounds
         int lower = 1;
         int upper = 100;

         //generate the target number
         Random randomData = new Random();
         int target = randomData.nextInt(lower, upper+1);

         //Ask user for first input
         System.out.printf("Guess a number between %d and %d: ",lower, upper);
         Scanner userInput = new Scanner(System.in);

         int guess;
         int counter = 0;
         do{
             guess = userInput.nextInt();
             counter++;
             if(guess > target){
                 System.out.println("Guess lower");
             }else if (guess < target){
                 System.out.println("Guess higher");
             }//Implied else guess == target for leaving loop.
         }while (guess != target);

         System.out.println("Correct! It took you "+ counter + "tries");

     }
}