/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Soal4 {
    public static class Balok {
        int panjang, lebar, tinggi;

        public Balok(int panjang, int lebar, int tinggi) {
            this.panjang = panjang;
            this.lebar = lebar;
            this.tinggi = tinggi;
        }

        public Balok() {
            this.panjang = 0;
            this.lebar = 0;
            this.tinggi = 0;
        }

        public int getLuas() {
            return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
        }

        public int getVolume() {
            return panjang * lebar * tinggi;
        }

        public int getKeliling() {
            return 4 * (panjang + lebar + tinggi);
        }

        public void setPanjang(int panjang) {
            this.panjang = panjang;
        }

        public void setLebar(int lebar) {
            this.lebar = lebar;
        }

        public void setTinggi(int tinggi) {
            this.tinggi = tinggi;
        }
    }

    public static void main(String[] args) {
        Balok balok1 = new Balok();
        Balok balok2 = new Balok(30, 40, 50);
        Balok balok3 = new Balok(25, 35, 45);
        balok1.setLebar(1);
        balok1.setPanjang(1);
        balok1.setTinggi(1);

        System.out.println("Balok dengan panjang: " + balok1.panjang + ", lebar: " + balok1.lebar + ", dan tinggi: "
                + balok1.tinggi + ". Luasnya : " + balok1.getLuas() + " Kelilingnya : " + balok1.getKeliling()
                + " dan Volume : " + balok1.getVolume());
        System.out.println("Balok dengan panjang: " + balok2.panjang + ", lebar: " + balok2.lebar + ", dan tinggi: "
                + balok2.tinggi + ". Luasnya : " + balok2.getLuas() + " Kelilingnya : " + balok2.getKeliling()
                + " dan Volume : " + balok2.getVolume());
        System.out.println("Balok dengan panjang: " + balok3.panjang + ", lebar: " + balok3.lebar + ", dan tinggi: "
                + balok3.tinggi + ". Luasnya : " + balok3.getLuas() + " Kelilingnya : " + balok3.getKeliling()
                + " dan Volume : " + balok3.getVolume());
    }
}

