package com.tutorian;
 

abstract class BangunDatar {
    // Method abstrak untuk luas dan keliling
    public abstract float luas();
    public abstract float keliling();
}

// Kelas Persegi (subclass dari BangunDatar)
class Persegi extends BangunDatar {
    public float sisi;

    public Persegi(float sisi) {
        this.sisi = sisi;
    }

    @Override
    public float luas() {
        return sisi * sisi;
    }

    @Override
    public float keliling() {
        return 4 * sisi;
    }
}

// Kelas Lingkaran (subclass dari BangunDatar)
class Lingkaran extends BangunDatar {
    public float r;

    public Lingkaran(float r) {
        this.r = r;
    }

    @Override
    public float luas() {
        return (float) (Math.PI * r * r);
    }

    @Override
    public float keliling() {
        return (float) (2 * Math.PI * r);
    }
}

// Kelas PersegiPanjang (subclass dari BangunDatar)
class PersegiPanjang extends BangunDatar {
    public float panjang, lebar;

    public PersegiPanjang(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public float luas() {
        return panjang * lebar;
    }

    @Override
    public float keliling() {
        return 2 * (panjang + lebar);
    }
}

// Kelas Segitiga (subclass dari BangunDatar)
class Segitiga extends BangunDatar {
    public float alas, tinggi;

    public Segitiga(float alas, float tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public float luas() {
        return (alas * tinggi) / 2;
    }

    @Override
    public float keliling() {
        // Keliling untuk segitiga tidak bisa dihitung hanya dari alas dan tinggi,
        // jadi ini sekedar contoh saja (mengasumsikan segitiga siku-siku)
        float sisiMiring = (float) Math.sqrt((alas * alas) + (tinggi * tinggi));
        return alas + tinggi + sisiMiring;
    }
}

// Kelas Main
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
