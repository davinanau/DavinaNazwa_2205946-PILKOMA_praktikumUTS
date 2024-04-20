/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Soal2c {
    public static void main(String[] args) {
        int x, y;
        for(x = 0; x < 6; x++) {
            for(y = 0; y < 6 - (x + 1); y++) {
                System.out.print("  ");
            }
            for(y = x; y >= 0; y--) {
                System.out.print(y + 1);
                if (y > 0) {
                    System.out.print(" "); 
                }
            }
            System.out.println();
        }
    }
}

