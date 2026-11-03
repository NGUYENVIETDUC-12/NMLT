package CHUONG3;

import java.util.Scanner;
public class bai2 {
    public static void main(String[] args) {
        Scanner nhap=new Scanner(System.in);
        int thang1,ngay1,nam1,md1;
        System.out.println("Nhap Thang Sinh");
        thang1 =nhap.nextInt();

        System.out.println("Nhap Ngay Sinh");
        ngay1 = nhap.nextInt();

        System.out.println("Nhap Nam Sinh");
        nam1 = nhap.nextInt();

        md1 = (thang1 * ngay1);

        if (md1 == nam1)
            System.out.println("MagicDates");
        else
            System.out.println("NotMagicDate");

        
    }
}
