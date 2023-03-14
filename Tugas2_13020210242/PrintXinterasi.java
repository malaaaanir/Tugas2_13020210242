// 13020210242 Nirmala
// Rabu, 15 Maret 2023
import java.util.Scanner;
// Contoh baca nilai x, Jumlahkan nilai yang dibaca dengan ITERATE
public class PrintXinterasi {
    public static void main(String[] args) {
        // Kamus
        int Sum = 0;
        // Mendeklarasikan variabel Sum bertipe int dengan value 0
        int x;
        // Mendeklarasikan variabel x dengan tipe data int
        Scanner masukan = new Scanner(System.in);
        // Mendeklarasikan objek masukan sebagai inputan class Scanner
        // Program
        System.out.print("Masukan nilai x (int), akhiri dengan 999 : ");
        // Perintah output teks
        x = masukan.nextInt(); // First Elmt
        // Mendeklarasikan nilai dari objek masukan akan menjadi value dari variabel x
        if(x == 999){
        // Kondisi jika value x sama dengan 999
            System.out.print("Kasus kosong \n");
            // Output teks 
        }
        else{ // Minimal ada satu data yang dijumlahkan
        // Kondisi jika value x tidak sama dengan 999
            Sum = x; // Inisialisasi; Invariant !!
            // Mnedeklarasikan bahwa value dari varibel Sum sama dengan value dari variabel x
            for(;;){
                System.out.print("Masukkan nilai x (int), akhiri dengan 999 : ");
                // Perintah output teks
                x = masukan.nextInt(); // Next Elmt
                // Mendeklarasikan bahwa nilai objek masukan akan menjadi value dari variabel x
                if(x==999){
                // Jika value dari x sama dengan 999, maka
                    break;
                    // Program berhenti
                }
                else{
                    // Jika kondisi dari x tidak sama dengan 999, maka
                    Sum = Sum + x; // Proses
                    // Perintah untuk mengulang perintah dari Sum
                }
            }
            System.out.println("Hasil penjumlahan = " + Sum);
            // Perintah output teks dan value dari variabel Sum
            //Terminasi
        }
    }
}
