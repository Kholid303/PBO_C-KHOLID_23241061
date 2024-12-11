package com.tutorial;

public class HeroTank extends Hero{
    // atribut 
    String nama = "Ini Class Hero Tank";

    // overriding method
    void cetak(){
        System.out.println("Ini adalah : " + super.nama);
    }
    
}