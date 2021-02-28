package guess.the.number;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int ran = (int)(Math.random() * 100), guess;
        boolean stillPlaying = true;
        
        System.out.println("Guess a number between 0 and 100\n");
        
        while (stillPlaying)
        {
            System.out.print("Enter a number : ");
            guess = input.nextInt();
            if (guess > ran)
                System.out.println("This number is too large");
            else if (guess < ran)
                System.out.println("This number is too small");
            else
            {
                System.out.println("You won!!");
                stillPlaying = false;
            }
        }
    }
}
