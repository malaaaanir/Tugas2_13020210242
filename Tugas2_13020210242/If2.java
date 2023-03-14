// 13020210242 Nirmala
// Rabu, 15 Maret 2023
import java.util.Scanner;
// Contoh Pemakaian IF Dua Kasus Komplementer
// Membaca Sebuah Nilai
// Menuliskan 'Nilai a Positif, Nilai a', Jika a >= 0
// 'Nilai a Negatif, Nilai a,' Jika a < 0
public class If2 {
    public static void main(String[] args) {
        // Kamus
        int a;
        // Mendeklarasikan variabel a dengan tipe data integer
        Scanner masukan = new Scanner(System.in);
        // Perintah membuat objek masukan untuk inputan class Scanner
        // Program 
        System.out.print("Contoh IF Dua Kasus \n");
        // Petintah output teks
        System.out.print("Ketikkan Suatu Nilai Integer : ");
        // Perintah output teks
        a = masukan.nextInt();
        // Mendeklarasikan bahwa perintah inputan masukan, valuenya akan masuk ke varibel a
        if(a>=0){
        // Perintah jika nilai dari a lebih besar atau sama dengan 0, maka
            System.out.println("Nilai a Positif " + a);
            // Output teks dan value variabel a
        }
        else{// a < 0
        // Perintah jika nilai dari a lebih kecil dari 0, maka
            System.out.println("Nilai a Negatif " + a);
            // Output teks dan value variabel
        }
    }
}
