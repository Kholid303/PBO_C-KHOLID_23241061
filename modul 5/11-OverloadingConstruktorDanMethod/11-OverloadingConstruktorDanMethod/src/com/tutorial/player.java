package com.tutorial;

public class player {
    // atribut
    private static int jumlahplayer;
    private String nama;

    // opsi 1
    // construktor
    player(String nama){
        player.jumlahplayer++;
        this.nama = nama;
    }

    // overloading construktor
    player(){
        player.jumlahplayer++;
        this.nama = "player" + player.jumlahplayer;
    }
    // method 
    void cetak(){
        System.out.println("nama : " + this.nama);
    }
}
