// 13020210242 Nirmala
// Rabu, 15 Maret 2023
import java.util.Scanner;
// Baca N, Print i = 1 s/d N dengan ITERASE
public class PrintIterasi {
    public static void main(String[] args) {
        // Kamus
        int N;
        // Mendeklarasikan variabel N dengan tipe data int
        int i;
        // Mendeklarasikan variabel i dengan tipe data i
        Scanner masukan = new Scanner(System.in);
        // Mendeklarasikan objek masukan sebagai inputan class Scanner
        // Program 
        System.out.print("Nilai N > 0 = "); // Inisialisasi
        // Perintah output teks
        N = masukan.nextInt();
        // Mendeklarasikan bahwa nilai dari objek masukan akan terisi pada value dari variabel N
        i = 1; // First Elmt
        // Memberikan value 1 pada variabel i
        System.out.print("Print i dengan ITERATE : \n");
        // Perintah output teks
        for(;;){
        // Blok kode yang akan diulang tanpa henti
            System.out.println(i); // Proses
            // Printah output value dari variabel i
            if(i == N){
            // Jika value dari varibel i sama dengan value dari variabel N, maka
                // Kondisi Berhenti
                break;
                // Perintah untuk menghentikan program
            }
            else{
            // Jika value dari i tidak sama dengan N atau lebih kecil dari value variabel i, maka
                i++; // Next Elmt
                // Perintah output berulang tanpa henti
            }
        } // (i == N)
    }
}
