package com.tutorial;

class NonMember extends Pelanggan {
        public double getDiskon(double totalBelanja) {
            if (totalBelanja > 100000) {
                return 3.0;
            } else {
                return 0.0; // Tidak ada potongan untuk belanja di bawah 100.000
            }
        }
    
}