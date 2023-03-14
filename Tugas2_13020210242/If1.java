// 13020210242 Nirmala
// Rabu, 15 Maret 2023
// Contoh Pemakaian IF Kasus
// Membaca Nilai Integer, Menuliskan Nilainya Jika Positif
import java.util.Scanner;
public class If1 {
    public static void main(String[] args) {
        // Kamus
        Scanner masukan = new Scanner(System.in);
        // Perintah membuat objek masukan untuk perintah inputan class Scanner
        int a;
        // Pendeklarasian variabel a dengan tipe data integer
        // Program
        System.out.print("Contoh IF Satu Kasus \n");
        // Perintah output teks
        System.out.print("Ketikan Suatu Nilai Integer : ");
        // Perintah output teks
        a = masukan.nextInt();
        // Untuk mendeklarasikan bahwa inputan masukan mempunyai value sebagai
        if(a>=0){
        // Untuk mendeskripsikan bahwa jika nilai dari a lebih besar dari 0, maka
            System.out.print("\nNilai a Positif " + a);
            // Output teks dan nilai dari a
        }
        else{ // a < 0
        // Untuk mendeskripsikan bahwa jika nilai dari a lebih kecil dari 0, maka
            System.out.println("Nilai a negatif " + a);
            // Output teks dan nilai dari a
        }
    }
}
