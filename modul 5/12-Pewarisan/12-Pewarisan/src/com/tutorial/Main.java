package com.tutorial;

public class Main {
    public static void main(String[] args) {
      // membuat objek dari super classs  
      Hero hero1 = new Hero();
      hero1.nama = "goku";
      hero1.cetak();
      
      // membuat objek dari sub class (hero tank)
      System.out.println("ini objek turunan dari kelas HeroTank");
      HeroTank hero2 = new HeroTank();
      hero2.nama = "hylos";
      hero2.cetak();
      
      // membuat objek dari sub class (hero tank)
      System.out.println("ini objek turunan dari kelas HeroMage");
      HeroMage hero3 = new HeroMage();
      hero3.nama = "yve";
      hero3.cetak();
    }
}