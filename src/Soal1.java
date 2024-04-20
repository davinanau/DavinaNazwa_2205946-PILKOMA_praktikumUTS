/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan tiga digit integer: ");
        int number = input.nextInt();

        if (isThreeDigit(number)) {
            if (adalahPalindrome(number)) {
                System.out.println(number + " adalah palindrom.");
            } else {
                System.out.println(number + " bukan palindrom.");
            }
        } else {
            System.out.println("Bilangan yang dimasukkan bukan tiga digit integer.");
        }
    }

    public static boolean adalahPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }

    public static boolean isThreeDigit(int number) {
        return number >= 100 && number <= 999;
    }
}
