package com.tutorial;

public class HeroTank extends Hero {
    // atribut hanya di miliki oleh subclass
    double defensePower;

    // overriding terhadapa method cetak (superClass)
    void cetak (){
        System.out.println(" hero tank");
        System.out.println(" hero name : " + this.nama);
        System.out.println(" defense power : " + defensePower);
    }



}