import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập số giây: ");
        int seconds = scanner.nextInt();
        // Kiểm tra từ mốc lớn nhất xuống nhỏ nhất
        if (seconds >= 86400) {
            double days = seconds / 86400;
            System.out.printf("%.2f days\n", days);
        } else if (seconds >= 3600) {
            double hours = seconds / 3600;
            System.out.printf("%.2f hours\n", hours);
        } else if (seconds >= 60) {
            double minutes = seconds / 60;
            System.out.printf("%.2f minutes\n", minutes);
        } else {
            System.out.println("Số giây nhỏ hơn 60.");
        }
        
        scanner.close();
    }
}