import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int correct_number = random.nextInt(100);
        for (int i = 0; i < 10; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the number you want to  guess between 1-100");
            int user_input = sc.nextInt();
            if (user_input > correct_number) {
                System.out.println("The number is too big");
            } else if (user_input < correct_number) {
                System.out.println("The number is too small");
            } else if (user_input == correct_number) {
                System.out.println("YOU guessed the correct number,BRAVO!");
                break;
            }
            if (i >= 9) {
                System.out.format("The number we were gussesing was %d", correct_number);
            }
        } 

    }
}
