import java.time.Year;
import java.util.Date;
import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Your birth year: ");
        int birthYear = scanner.nextInt();
        int age = java.time.Year.now().getValue() - birthYear;

        System.out.println("Your age is: " +  age);
    }
}
