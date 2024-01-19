import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chiều dài của hình chữ nhật: ");
        double dai = scanner.nextDouble();

        System.out.print("Nhập chiều rộng của hình chữ nhật: ");
        double rong = scanner.nextDouble();

        double chuVi = (dai + rong) * 2;
        double dienTich = dai * rong;
        double canhNhoNhat = Math.min(dai, rong);

        System.out.printf("Chu vi: %.2f%n", chuVi);
        System.out.printf("Diện tích: %.2f%n", dienTich);
        System.out.printf("Cạnh nhỏ nhất: %.2f%n", canhNhoNhat);

        scanner.close();
    }
}
