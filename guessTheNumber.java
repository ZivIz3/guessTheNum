import java.util.Random;
import java.util.Scanner;

public class guessTheNumber {

    public static void main(String[] args) {
        //AI Set Random Number
        Random random = new Random();
        int num = random.nextInt(1000);
        System.out.println(num);

        Scanner sc1 = new Scanner(System.in);
        System.out.println("System has selected a random number between 1 - 1000 guess:");
        int guess = sc1.nextInt();
        while (guess != num) {
            if (guess > num)
                System.out.println("Down");
            else
                System.out.println("UP");
            guess = sc1.nextInt();
        }
        System.out.println("You found it! great job!!");
    }
}
