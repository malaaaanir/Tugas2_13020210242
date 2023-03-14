// 13020210242 Nirmala
// Rabu, 15 Maret 2023
import java.util.Scanner;
// Baca N, Print i = 1 s/d N dengan WHILE
public class PrintWhile {
    public static void main(String[] args) {
        // Kamus
        int N;
        // Mendeklarasikan variabel N dengan tipe data int
        int i;
        // Mendeklarasikan variabel i dengan tipe data int
        Scanner masukan = new Scanner(System.in);
        // Mendeklarasikan objek masukan sebagai inputan class Scanner
        // Program
        System.out.print("Nilai N > 0 = "); // Inisialisasi
        // Perintah output teks
        N = masukan.nextInt();
        // Mendeklarasikan nilai dari objek masukan akan menjadi nilai dari variabel N
        i = 1; // FIrst Elmt
        // Memberikan value pada variabel i
        System.out.print("Print 1 dengan WHILE : \n");
        // Perintah output teks
        while(i<=N){ // Kondisi Pengulangan
        // Jika i<N, maka
            System.out.println(i); // Proses
            // Output value dari variabel i
            i++; // Next Elmt
            // Increment variabel i
        } // (i>N)
    }
}
