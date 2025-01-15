package com.tutorial;

class Member extends Pelanggan{
    public double getDiskon(double totalBelanja) {
        if (totalBelanja > 500000) {
            return 10.0;
        } else if (totalBelanja >= 100000) {
            return 5.0;
        } else {
            return 3.0;
        }
    }
}