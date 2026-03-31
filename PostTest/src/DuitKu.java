public class DuitKu {
    double saldo;

    public DuitKu() {
        this.saldo = 0.0;
    }

    public void isiSaldo(double nominal) {
        if (nominal < 10000){
            System.out.println("Saldo minimal 10.000");
        } else {
            this.saldo += nominal;
            System.out.println("Saldo berhasil ditambahkan");
            System.out.println("Penambahan saldo: " + nominal);
            System.out.println("Saldo sekarang: " + this.saldo);
        }
    }

    public void lunasiTagihan(double tagihan){
        if (this.saldo < tagihan){
            System.out.println("Saldo tidak cukup");
        } else {
            this.saldo -= tagihan;
            System.out.println("Tagihan berhasil dibayar");
            System.out.println("Pembayaran tagihan: " + tagihan);
            System.out.println("Saldo sekarang: " + this.saldo);
        }
    }
}