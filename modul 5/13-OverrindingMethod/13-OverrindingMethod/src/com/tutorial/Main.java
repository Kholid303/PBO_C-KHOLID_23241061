package com.tutorial;

public class Main {
    public static void main(String[] args) {
        // buat objek dari super class
        Hero hero1 = new Hero();
        System.out.println("hero dari superclass");
        hero1.nama = "hylos";
        hero1.cetak();

        // buat objek dari subclass (hero tank)
        HeroTank hero2 = new HeroTank();
        hero2.nama = "gatot";
        hero2.defensePower = 100; 
        hero2.cetak();
    }
     
}