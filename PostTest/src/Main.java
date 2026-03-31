import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Perbaikan typo 'Scanner'

        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan no telp: ");
        String noTelp = input.next(); // Lebih aman pakai String

        Pelanggan pelanggan1 = new Pelanggan(nama, noTelp);

        int pilihan = 0; // Inisialisasi variabel pilihan
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Isi Saldo");
            System.out.println("2. Bayar Tagihan");
            System.out.println("3. Keluar");
            System.out.print("Pilihan: ");
            
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Nominal setor: ");
                    double nomSetor = input.nextDouble();
                    pelanggan1.dompet.isiSaldo(nomSetor);
                    break;
                case 2:
                    System.out.print("Nominal tagihan: ");
                    double nomTagihan = input.nextDouble();
                    pelanggan1.dompet.lunasiTagihan(nomTagihan);
                    break;
                case 3:
                    System.out.println("Terima kasih");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        } while (pilihan != 3); 

        input.close(); 
    }
}