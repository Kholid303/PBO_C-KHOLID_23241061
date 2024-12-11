package com.tutorial;

public class Main {
    public static void main(String[] args) {
        // membuat objek opsi 1
        player player1 = new player("goku");
        // membuat objek opsi 2
        player player2 = new player();
        player player3 = new player();
        player player4 = new player("gundala");

        player1.cetak();
        player2.cetak();
        player3.cetak();
        player4.cetak();
    }
}


