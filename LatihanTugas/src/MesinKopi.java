public class MesinKopi { // nomor 1
    double kopi;
    double air;
    double susu;

    public MesinKopi(double kopi, double air, double susu) {// nomor 4
        this.kopi = 0;
        this.air = 0;
        this.susu = 0;
    }
    public void MesinKopi(double kopi, double air, double susu) { // nomor 2
        this.kopi += kopi;
        this.air += air;
        this.susu += susu;

        System.out.println("Bahan baku berhasil diisi ulang");
        System.out.println("Kopi: " + this.kopi);
        System.out.println("Air: " + this.air);
        System.out.println("Susu: " + this.susu);
    }

    public boolean cekKetersediaanCappucino(double kopi, double air, double susu) { // nomor 3
        if (this.kopi >= 15 && this.air >= 50 && this.susu >= 100) {
            System.out.println("Bahan baku cappucino tersedia");
            return true;
        } else {
            System.out.println("Bahan baku cappucino tidak tersedia");
            return false;
        }
    }

}