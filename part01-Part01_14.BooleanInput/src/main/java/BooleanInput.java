
import java.util.Scanner;

public class BooleanInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        Boolean number;

        System.out.println("Write something:");
        number = Boolean.valueOf(scanner.nextLine());
        System.out.println("True or false? "+number);

    }
}
