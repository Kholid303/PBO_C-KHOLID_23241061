package com.tutorial;

public class Persegi extends BangunDatar {
    public float sisi;

    public Persegi(float sisi) {
        this.sisi = sisi;
    }

    //Override
    public float luas() {
        return sisi * sisi;
    }

    //Override
    public float keliling() {
        return 4 * sisi;
    }
}
