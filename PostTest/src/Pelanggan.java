public class Pelanggan {
    String nama;
    String noTelp;
    DuitKu dompet;

    public Pelanggan(String nama, String noTelp) {
        this.nama = nama;
        this.noTelp = noTelp;
        this.dompet = new DuitKu();
    }
}

