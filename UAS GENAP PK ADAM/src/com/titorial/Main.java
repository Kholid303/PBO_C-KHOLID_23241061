package com.tutorial;

public class Main {
        public static void main(String[] args) {
            String namaPelanggan = "SkayZone";
            boolean memilikiMember = true; // kalo salah non member
            double totalBelanjaSebelumPotongan = 550000;
    
            Pelanggan pelanggan;
            double diskon;
            if (memilikiMember) {
                Member member = new Member();
                pelanggan = member;
                diskon = member.getDiskon(totalBelanjaSebelumPotongan);
            } else {
                NonMember nonMember = new NonMember();
                pelanggan = nonMember;
                diskon = nonMember.getDiskon(totalBelanjaSebelumPotongan);
            }
    
            double potonganRupiah = pelanggan.hitungDiskon(totalBelanjaSebelumPotongan, diskon);
            double totalBelanjaSetelahPotongan = pelanggan.hitungTotal(totalBelanjaSebelumPotongan, diskon);
    
            // Tampilkan hasil
            System.out.println("Nama Pelanggan: " + namaPelanggan);
            System.out.println("Status Member: " + (memilikiMember ? "Member" : "Non-Member"));
            System.out.println("Total Belanja Sebelum Potongan: Rp" + totalBelanjaSebelumPotongan);
            System.out.println("Diskon (dalam persen): " + diskon + "%");
            System.out.println("Diskon (dalam rupiah): Rp" + potonganRupiah);
            System.out.println("Total Belanja Setelah Potongan: Rp" + totalBelanjaSetelahPotongan);
        }
}