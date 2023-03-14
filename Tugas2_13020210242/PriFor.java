// 13020210242 Nirmala
// Rabu, 15 Maret 2023
import java.util.Scanner;
// Baca N, Print 1 s/d N Dengan FOR
public class PriFor {
    public static void main(String args[]) {
        // Kamus
        int i, N;
        // Mendeklarasikan variabel i dan N dengan tipe data int
        Scanner masukan = new Scanner(System.in);
        // Perintah membuat objek masukan untuk inputan class Scanner
        // Program
        System.out.print("Baca N, Print 1 s/d N ");
        // Perintah output teks
        System.out.print("N = ");
        // Perintah output teks
        N = masukan.nextInt();
        // Mendeklarasikan nilai dari objek masukan merupakan value dari variabel N 
        for(i=1; i<=N; i++){
        // Mendeklarasikan bahwa i=1, i lebih kecil sama dengan value dari variabel N, dan penambahan increment i
            System.out.println(i);
            // Perintah output value dari variabel i
        }
        System.out.println("Akhir Program \n");
        // Perintah output teks
    }
}
