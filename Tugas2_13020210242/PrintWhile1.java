// 13020210242 Nirmala
// Rabu, 15 Maret 2023
import java.util.Scanner;
// Bava N, Print i = 1 s/d N dengan while (ringkas)
public class PrintWhile1 {
    public static void main(String[] args) {
        // Kamus
        int N;
        // Mendeklarasikan variabel N dengan tipe data int
        int i = 1;
        // Mendeklarasikan variabel i bertipe data int dengan value 1
        Scanner masukan = new Scanner(System.in);
        // Mendeklarasikan objek masukan sebagai inputan class Scanner
        // Program
        System.out.print("Nilai N > 0 = ");
        // Perintah output teks
        N = masukan.nextInt();
        // Mendeklarasikan nilai dari objek masukan akan menjadi value dari variabel N
        System.out.print("Print i dengan WHILE (ringkas) : \n");
        // Perintah output teks
        while(i<=N){
        // Kondisi jika i<=N, maka
            System.out.println(i++);
            // Perintah output variabel i increment
        } // (i>N)
    }
}
