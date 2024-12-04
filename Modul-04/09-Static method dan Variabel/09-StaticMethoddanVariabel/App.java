import java.util.ArrayList;


class player{
    // variabel untuk objek
    private String nama;
    // static variabel
    private static int numberofplayer;
    // static variabel untuk menampung nama
    private static ArrayList<String> namaList = new ArrayList<String>();


    // konstrutor
    player(String nama){
        this.nama = nama;
        player.numberofplayer++; // add objek
        player.namaList.add(this.nama);
    }

    // method untuk membaca private
    void cetak(){
        System.out.println("nama  : " + this.nama);
    }

    // static method
    static void shownumberofplayer(){
        System.out.println("# of player : " + player.numberofplayer);
    }

    static ArrayList<String> getnama(){
        return player.namaList;
    }
}



public class App {
    public static void main(String[] args) throws Exception {
        // membuat objek 
        player player1 = new player("shoyo hinata");
        player player2 = new player("ishigami senku");
        player player3 = new player("himura kenshin");
        player player4 = new player("luffy");
      
        // menerapkan static variabel dan method
        player.shownumberofplayer();

        // tampilkan array
        System.out.println(player.getnama());

    }
}