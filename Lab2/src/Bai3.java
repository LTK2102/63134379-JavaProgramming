import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số điện sử dụng của tháng: ");
        int soDien = scanner.nextInt();
        int giaDuoi50 = 1000;
        int giaTren50 = 1200;
        int gioiHan50 = 50;
        int tien;
        if (soDien <= gioiHan50) {
            tien = soDien * giaDuoi50;
        } else {
            tien = gioiHan50 * giaDuoi50 + (soDien - gioiHan50) * giaTren50;
        }
        System.out.println("Tiền điện phải trả: " + tien + " VND");
        scanner.close();
    }
}
