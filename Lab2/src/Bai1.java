import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập hệ số a
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();

        // Nhập hệ số b
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();

        // Giải phương trình bậc nhất
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            double x = -b / a;
            System.out.printf("Nghiệm của phương trình là: %.2f%n", x);
        }

        // Đóng Scanner để tránh rò rỉ tài nguyên
        scanner.close();
    }
}
