
import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        System.out.println("Give a number:");
        number = Integer.parseInt(scanner.nextLine());
        System.out.println("You gave the number "+number);

        // write your program here

    }
}
