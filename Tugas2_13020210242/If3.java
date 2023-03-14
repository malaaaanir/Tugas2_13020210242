// 13020210242 Nirmala
// Rabu, 15 Maret 2023
import java.util.Scanner;
// Conoth Pemakaian IF Tiga Kasus
// Membaca Sebuah Nilai
// Menuliskan 'Nilai a Poritif, Nilai a', Jika a > 0
// 'Nilai Nol, Nilai a', Jika a = 0
// 'Nilai a Negatif', Nilai a', Jika a < 0
public class If3 {
    public static void main(String[] args) {
        // Kamus
        int a;
        // Mendeklarasikan variabel a dengan tipe data integer
        Scanner masukan = new Scanner(System.in);
        // Perintah membuat objek masukan untuk perintah inputan class Scanner
        // Program
        System.out.print("Contoh IF Tiga Kasus \n");
        // Perintah Output Teks
        System.out.print("Ketikkan Suatu Nilai Integer : ");
        // Perintah Output Teks
        a = masukan.nextInt();
        // Mendeklarasikan bahwa perintah input dari objek masukan, valuenya akan masuk ke variabel a
        if(a > 0){
        // Jika value dari variabel a lebih besar dari 0, maka
            System.out.println("Nilai a Positif " + a);
            // Output Teks dan Value Dari Variabel a
        }
        else if(a == 0){
        // Jika Value Dari Variabel a Bernilai 0, maka
            System.out.println("Nilai Nol " + a);
            // Output Teks dan Value Dari Variabel a
        }
        else{ // a < 0
        // Jika Value Dari Variabel a Bernilai Lebih Kecil Dari 0, maka
            System.out.println("Nilai a Negatif " + a);
            // Output Teks dan Value Dari Variabel a
        }
    }
}
