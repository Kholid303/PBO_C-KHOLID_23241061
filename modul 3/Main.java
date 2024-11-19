package com.tutorial;

import java.text.NumberFormat;
import java.util.Locale;

class HitungGajiBersih {
    private int gaji_pokok;
    private int tunjangan;
    private double pajak; // dalam persen

    // Setter methods
    public void setGajiPokok(int gaji_pokok) {
        this.gaji_pokok = gaji_pokok;
    }

    public void setTunjangan(int tunjangan) {
        this.tunjangan = tunjangan;
    }

    public void setPajak(double pajak) {
        this.pajak = pajak;
    }

    // Getter methods
    public int getGajiPokok() {
        return gaji_pokok;
    }

    public int getTunjangan() {
        return tunjangan;
    }

    public double getPajak() {
        return pajak;
    }

    // Method untuk menghitung gaji bersih
    public void cetakGajiBersih() {
        // Pajak dalam rupiah
        double pajakRupiah = (gaji_pokok + tunjangan) * (pajak / 100);
        // Gaji bersih
        double gajiBersih = (gaji_pokok + tunjangan) - pajakRupiah;

        // Format angka ke format Indonesia (menggunakan titik sebagai pemisah ribuan)
        NumberFormat formatIndonesia = NumberFormat.getInstance(new Locale("id", "ID"));

        // Output
        System.out.println("Gaji Bersih Anda adalah sebesar Rp. " + formatIndonesia.format(gajiBersih));
    }
}

public class Main {
    public static void main(String[] args) {
        // Membuat objek HitungGajiBersih
        HitungGajiBersih hitung = new HitungGajiBersih();

        // Input data
        hitung.setGajiPokok(2000000); // Gaji pokok
        hitung.setTunjangan(500000); // Tunjangan
        hitung.setPajak(10); // Pajak dalam persen

        // Menampilkan hasil gaji bersih
        hitung.cetakGajiBersih();
    }
}
