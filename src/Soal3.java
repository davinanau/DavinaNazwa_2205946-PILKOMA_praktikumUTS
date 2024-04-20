/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah bilangan bulat: ");
        int number = input.nextInt();

        if (Palindrome(number)) {
            System.out.println(number + " adalah palindrom.");
        } else {
            System.out.println(number + " bukan palindrom.");
        }
    }

    public static int terbalik(int number) {
        int nomerTerbalik = 0;

        while (number != 0) {
            int digit = number % 10;
            nomerTerbalik = nomerTerbalik * 10 + digit;
            number /= 10;
        }

        return nomerTerbalik;
    }

    public static boolean Palindrome(int number) {
        return number == terbalik(number);
    }
}
