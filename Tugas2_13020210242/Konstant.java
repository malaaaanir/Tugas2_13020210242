// 13020210242 Nirmala
// Rabu, 15 Maret 2023
import java.util.Scanner;
// Membaca jari-jari, menghitung luas lingkaran
// Latihan pemakaian konstanta
public class Konstant {
    public static void main(String[] args) {
        // Kamus
        final float PHI = 3.1415f;
        // Mendeklarasikan variabel PHI bertipe data float dengan value 3.1415 yang merupakan nilai const
        float r;
        // Mendeklarasikan variabel r dengan tipe data float
        Scanner masukan = new Scanner(System.in);
        // Membuat objek masukan sebagai inputan class Scanner
        //Program / Baca Data
        System.out.print("Jari-jari lingkaran = ");
        // Peritah output teks
        r = masukan.nextFloat();
        // Mendeklarasikan bahwah nilai dari inputan masukan akan menjadi value dari variabel r
        // Hitung dan Tulis Hasil 
        System.out.print("Luas Lingkaran = " + (PHI * r * r) + "\n");
        // Perintah output teks, hasil dari PHI * r * r, dan output perintah membuat baris baru
        System.out.print("Akhir Program\n");
        // Perintah output teks
    }
}
