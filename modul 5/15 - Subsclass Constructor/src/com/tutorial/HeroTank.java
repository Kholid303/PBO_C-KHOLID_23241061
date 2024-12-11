package com.tutorial;

public class HeroTank extends Hero {
    // atribut
    String atribut = "Tank";

    //subclass constructor
    HeroTank(String nama, Double defense, double attack){
        super(nama, attack, attack);
    }

    void cetak(){
        System.out.println("\nHero : " + this.atribut);
        super.cetak();
    }
    
}
