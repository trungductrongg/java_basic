import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập điểm môn Toán: ");
        double diemToan = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập hệ số môn Toán: ");
        double heSoToan = Double.parseDouble(scanner.nextLine());

        System.out.print("Nhập điểm môn Lý: ");
        double diemLy = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập hệ số môn Lý: ");
        double heSoLy = Double.parseDouble(scanner.nextLine());

        System.out.print("Nhập điểm môn Hóa: ");
        double diemHoa = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập hệ số môn Hóa: ");
        double heSoHoa = Double.parseDouble(scanner.nextLine());

        double tongDiem = (diemToan * heSoToan) + (diemLy * heSoLy) + (diemHoa * heSoHoa);

        double tongHeSo = heSoToan + heSoLy + heSoHoa;
        double diemTrungBinh = tongDiem / tongHeSo;
        System.out.printf("Điểm trung bình của học sinh là: %.2f\n", diemTrungBinh);
    }
}
