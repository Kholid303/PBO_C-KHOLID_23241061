package com.tutorial;

public class Main {
    public static void main(String[] args) {
        // Contoh penggunaan

        // Persegi
        Persegi persegi = new Persegi(5);
        System.out.println("Luas Persegi: " + persegi.luas());
        System.out.println("Keliling Persegi: " + persegi.keliling());

        // Lingkaran
        Lingkaran lingkaran = new Lingkaran(7);
        System.out.println("\nLuas Lingkaran: " + lingkaran.luas());
        System.out.println("Keliling Lingkaran: " + lingkaran.keliling());

        // Persegi Panjang
        PersegiPanjang pp = new PersegiPanjang(4, 6);
        System.out.println("\nLuas Persegi Panjang: " + pp.luas());
        System.out.println("Keliling Persegi Panjang: " + pp.keliling());

        // Segitiga
        Segitiga segitiga = new Segitiga(3, 4);
        System.out.println("\nLuas Segitiga: " + segitiga.luas());
        System.out.println("Keliling Segitiga (siku-siku): " + segitiga.keliling());
    }
}
