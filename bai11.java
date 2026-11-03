import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

// Lớp đại diện cho một vận động viên
class Runner {
    private String name;
    private double time;

    public Runner(String name, double time) {
        this.name = name;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public double getTime() {
        return time;
    }
}

public class bai11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Runner> runners = new ArrayList<>();

        System.out.println("=== CHƯƠNG TRÌNH XẾP HẠNG CHẠY ĐÃ ==");

        // Nhập thông tin của 3 vận động viên
        for (int i = 1; i <= 3; i++) {
            System.out.print("\nNhập tên vận động viên thứ " + i + ": ");
            String name = scanner.nextLine();

            double time = 0;
            boolean validTime = false;
            // Kiểm tra tính hợp lệ của thời gian (thời gian phải > 0)
            while (!validTime) {
                System.out.print("Nhập thời gian chạy của " + name + " (phút): ");
                if (scanner.hasNextDouble()) {
                    time = scanner.nextDouble();
                    if (time > 0) {
                        validTime = true;
                    } else {
                        System.out.println("⚠️ Thời gian phải là một số dương! Vui lòng nhập lại.");
                    }
                } else {
                    System.out.println("⚠️ Định dạng không hợp lệ! Vui lòng nhập số.");
                    scanner.next(); // Xóa bộ nhớ đệm
                }
            }
            scanner.nextLine(); // Đọc bỏ ký tự dòng mới (newline)

            runners.add(new Runner(name, time));
        }

        // Sắp xếp các vận động viên theo thời gian tăng dần (người ít thời gian nhất thắng)
        Collections.sort(runners, Comparator.comparingDouble(Runner::getTime));

        // Hiển thị kết quả
        System.out.println("\n----------------------------------");
        System.out.println("🏆 KẾT QUẢ CUỘC ĐUA (Theo thứ tự về đích):");
        System.out.println("----------------------------------");
        
        String[] ranks = {"Hạng 1 (Nhất)", "Hạng 2 (Nhì)", "Hạng 3 (Ba)"};
        for (int i = 0; i < runners.size(); i++) {
            Runner r = runners.get(i);
            System.out.printf("%s: %s - %.2f phút\n", ranks[i], r.getName(), r.getTime());
        }

        scanner.close();
    }
}