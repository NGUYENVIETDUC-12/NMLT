package CHUONG3;

import java.util.Scanner;
public class bai3 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        int bmi, height, weight;
        System.out.println("Nhap chieu cao (inch):");
        height = nhap.nextInt();
        System.out.println("Nhap can nang (pound):");
        weight = nhap.nextInt();
        bmi = (weight * 703) / (height * height);
        System.out.println("Chi so BMI la: " + bmi);
        if (bmi < 18.5) {
            System.out.println("Ban thieu can");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Ban co can nang binh thuong");
        } else if (bmi >= 25) {
            System.out.println("Ban thua can");
        }
    }
}