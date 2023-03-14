// 13020210242 Nirmala
// Rabu, 15 Maret 2023
import java.util.Scanner;
public class PrintXRepeat {
    public static void main(String[] args) {
        // Kamus
        int Sum;
        // Mendeklarasikan variabel Sum dengan tipe data int
        int x;
        // Mendeklarasikan variabel x dengan tipe data int
        Scanner masukan = new Scanner(System.in);
        // Mendeklarasikan objek masukan sebagai inputan class Scanner
        //Program
        System.out.print("Masukan nilai x (int), akhiri dengan 999 : ");
        // Perintah output teks
        x = masukan.nextInt(); //First Elmt
        // Mendeklarasikan nilai dari objek masukan akan menjadi value dari variabel x
        if(x==999){
        // Jika value dari variabel x sama dengan 999, maka
            System.out.print("Kasus Kosong \n");
            // Output teks
        }
        else{ // Minimal ada satu data yang dijumlahkan
        // Jika value dari variabel x tidak sama dengan 999, maka
            Sum = 0; // Inisialisasi; invariant !!
            // Memberi value pada variabel Sum
            do{
                Sum = Sum + x; // Proses
                // Memberi value pada variabel Sum dari hasil penjulahan value variabel Sum dan x
                System.out.print("Masukkan nilai x (int), akhiri dengan 999 : ");
                // Perintah output teks
                x = masukan.nextInt(); // Next Elmt
                // Mendeklarasikan nilai dari objek masukan akan menjadi value dari variabel x
            }
            while(x != 999); // Kondisi pengulangan
            // Jika value dari variabel x merupakan negasi dari 999, maka
            System.out.println("Hasil penjumlahan = " + Sum); // Terminasi
            // Output teks dan value dari variabel Sum
        }
    }
}
