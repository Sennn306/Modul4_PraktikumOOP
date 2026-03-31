public class Mahasiswa {
    String nama;
    int umur;
    String jurusan;

    //default
    //no argument
    //parameterized
    //copy constructor

    public Mahasiswa(String nama, int umur, String jurusan) {
        this.nama = nama;
        this.umur = umur;
        this.jurusan = jurusan;
    }

    public void Belajar() {
        System.out.println(nama + " sedang belajar di jurusan " + jurusan);
    }

    public void gantiProdi(String prodiBaru) {
    jurusan = prodiBaru;
    }
    
    public void tampilkan() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Jurusan: " + jurusan);
    }
}