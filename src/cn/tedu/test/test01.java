package cn.tedu.test;

import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 250;
        int guess = scanner.nextInt();
        while (guess != num){
            if (guess > num){
                System.out.println("da");
            }else {
                System.out.println("xiao");
            }
            System.out.println("caiba");
            guess = scanner.nextInt();
        }
        System.out.println("dui");
    }
}
