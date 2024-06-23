import java.util.Scanner;

public class HinhTron {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập bán kính của đường tròn: ");
        double banKinh = Double.parseDouble(scanner.nextLine());

        double chuVi = 2 * Math.PI * banKinh;

        double dienTich = Math.PI * banKinh * banKinh;

        System.out.printf("Chu vi của hình tròn là: %.2f\n", chuVi);
        System.out.printf("Diện tích của hình tròn là: %.2f\n", dienTich);
    }
}
