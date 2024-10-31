public class BangunDatar {
    // Attributes
    private double panjang;
    private double lebar;

    // Constructor
    public BangunDatar(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Getter and Setter methods
    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    // Methods
    public void hitungLuas() {
        double luas = panjang * lebar;
        System.out.println("Luas: " + luas);
    }

    public void hitungKeliling() {
        double keliling = 2 * (panjang + lebar);
        System.out.println("Keliling: " + keliling);
    }

    public double cetakHasil() {
        // You can define what result to return here
        // For now, we'll return the area as an example
        return panjang * lebar;
    }

    public static void main(String[] args) {
        // Example usage
        BangunDatar persegiPanjang = new BangunDatar(5, 3);
        persegiPanjang.hitungLuas();
        persegiPanjang.hitungKeliling();
        System.out.println("Hasil: " + persegiPanjang.cetakHasil());
    }
}