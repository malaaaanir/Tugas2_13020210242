// 13020210242 Nirmala
// Rabu, 15 Maret 2023
import java.util.Scanner;
public class PrintRepeat {
    public static void main(String[] args) {
        // Kamus
        int N;
        // Mendeklarasikan variabel N dengan tipe data int
        int i;
        // Mendeklarasikan variabel i dengan tipe data int
        Scanner masukan = new Scanner(System.in);
        // Mendeklarasikan objek masukan sebagai inputan class Scanner
        //Program
        System.out.print("Nilai N > 0 = ");
        // Perintah output teks
        // Inisialisasi
        N = masukan.nextInt();
        // Mendeklarasikan bahwa nilai dari inputan masukan akan menjadi value dari variabel N
        i = 1;
        // Memberikan value pada variabel i
        // FIrst Elmt
        System.out.print("Print i dengan REPEAT : \n");
        // Perintah Output teks
        do{
        // Perintah perulangan sesuai dengan nilai dari variabel i
            System.out.print(i+"\n"); // Proses
            // Perintah output value dan jumlah perulangan dari variabel i
            i++;
            // Increment dari variabel i
        }
        while(i <= N); // Kondisi Pengulang
        // Kondisi dimana jika i <= N maka output yang akan di hasilkan adalah 1
    }
}
