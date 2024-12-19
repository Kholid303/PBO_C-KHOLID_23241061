package com.tutorial;

public class Segitiga extends BangunDatar {
    public float alas, tinggi;

    public Segitiga(float alas, float tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    //Override
    public float luas() {
        return (alas * tinggi) / 2;
    }

    //Override
    public float keliling() {
        // Keliling untuk segitiga tidak bisa dihitung hanya dari alas dan tinggi,
        // jadi ini sekedar contoh saja (mengasumsikan segitiga siku-siku)
        float sisiMiring = (float) Math.sqrt((alas * alas) + (tinggi * tinggi));
        return alas + tinggi + sisiMiring;
    }
}
