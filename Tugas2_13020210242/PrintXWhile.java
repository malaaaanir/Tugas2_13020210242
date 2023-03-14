// 13020210242 Nirmala
// Rabu, 15 Maret 2023
import java.util.Scanner;
// Contoh baca nilai x, jumlahkan nilai yang dibaca dengan WHILE
public class PrintXWhile {
    public static void main(String[] args) {
        // Kamus
        int Sum;
        // Mendeklarasikan variabel Sum dengan tipe data int
        int x;
        // Mendeklarasikan variabel x dengan tipe data int
        Scanner masukan = new Scanner(System.in);
        // Mendeklarasikan objek masukan sebagai inputan class Scanner
        // Program
        Sum = 0; // Inisialisasi
        // Memberikan value pada variabel Sum
        System.out.print("Masukkan nilai x (int), akhiri dengan 999 : ");
        // Perintah output teks
        x = masukan.nextInt(); // First Elmt
        // Mendeklarasikan nilai dari objek masukan akan menjadi value dari variabel x
        while(x != 999){ // Kondisi berhenti
        // Jika value dari variabel x merupakan negasi dari 999, maka
            Sum = Sum + x; // Proses
            // Memberi value pada variabel Sum dari hasil penjulahan value variabel Sum dan x
            System.out.print("Masukkan nilai x (int), akhiri dengan 999 : ");
            // Perintah output teks
            x = masukan.nextInt(); // First Elmt
            // Mendeklarasikan nilai dari objek masukan akan menjadi value dari variabel x
        }
        System.out.println("Hasil penjumlahan = " + Sum); // Terminasi
        // Peirntah output teks dan value dari variabel Sum
    }
}
