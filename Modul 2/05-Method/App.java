class Mahasiswa{
    // atribut atau data number
    String Nama;
    String nim;

    //constructor
    Mahasiswa(String nama, String NIM){
        this.Nama = nama; 
        this.nim = NIM;
        //this sebagai penanda bahwa variabel yang menggunakan this merupakan milik class
    }
    // method 1 tanpa return dan parameter
    void cetak(){
        System.out.println("Nama Mahasiswa : " + this.Nama);
        System.out.println("Nim : " + this.nim);
    }
    // method 2 tanpa return dengan parameter
    // method mengubah nilai dari variabel nama
    void setNama(String Nama){
        this.Nama = Nama;

    }
    // method 3 dengan return tanpa parameter
    // mengambil nilai variabel nama 
    String getnNama(){
        return this.Nama;
    }
    // mengambil nilai variabel nim
    String getnim(){
        return this.nim;
    }
    //method 4 dengan return dan parameter
    //membuat salam selamat datang
    String sayHi(String Nama){
        this.Nama = Nama;
        return "Selamat Datang " + this.Nama + " Di Aplikasi SIAKAD";
    }
}


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
         //instansiasi objek
         Mahasiswa mhs_1 = new Mahasiswa("Udin", "23244412");

         //memanggil method 1
         mhs_1.cetak();

         //memanggil  method 2 mengubah nama
         mhs_1.setNama("Messi");
         mhs_1.cetak();

         //memanggil method 3
         System.out.println(mhs_1.getnNama());
         System.out.println(mhs_1.getnim());
         //menyimpan nilai dari variabel nama dan nim
         String temp_Nama = mhs_1.getnNama();
         String temp_nim = mhs_1.getnim();

         //memanggil method 4
         String pesan = mhs_1.sayHi(mhs_1.Nama);
         System.out.println(pesan);


    }
}
