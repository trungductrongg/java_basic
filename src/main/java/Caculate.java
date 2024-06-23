import java.util.Scanner;

public class Caculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("input a: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.print("input b: ");
        int b = Integer.parseInt(scanner.nextLine());

        System.out.printf("%d + %d = %d\n", a, b, a+b);
        System.out.printf("%d - %d = %d\n", a, b,a-b);
        System.out.printf("%d * %d = %d\n", a, b, a*b);
        System.out.printf("%d / %d = %d\n", a, b, a/b);

    }
}
