package com.tutorial;

class Pelanggan {
    private double potongan; // ini diskon dalam persen

    public double hitungDiskon(double totalBelanja, double diskon) {
        potongan = diskon;
        return totalBelanja * (potongan / 100);
    }

    public double hitungTotal(double totalBelanja, double diskon) {
        double potonganRupiah = hitungDiskon(totalBelanja, diskon);
        return totalBelanja - potonganRupiah;
    }
}