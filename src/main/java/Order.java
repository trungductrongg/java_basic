import java.util.Scanner;

public class Order {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name product: ");
        String nameProduct = scanner.nextLine();

        System.out.print("Quantity: ");
        int quantity = Integer.parseInt(scanner.nextLine());

        System.out.print("Price: ");
        float price = scanner.nextFloat();

        float total = quantity * price;
        float VAT = total  * 10/100;

        System.out.printf("Name product: %s\n Total: %f\n VAT: %f\n", nameProduct, total, VAT);
    }
}
