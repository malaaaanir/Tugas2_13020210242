// 13020210242 Nirmala
// Rabu, 15 Maret 2023
import java.util.Scanner;
// Contoh pemakaian IF tiga kasus : wujud air 
public class Tempair {
    public static void main(String[] args) {
        // Kamus 
        int T;
        // Mendeklarasikan variabel T dengan tipe data int
        Scanner masukan = new Scanner(System.in);
        // Mendeklarasikan objek masukan sebagai inputan class Scanner
        // Program
        System.out.print("Contoh IF tiga kasus \n");
        // Peintah output teks
        System.out.print("Temperatur (der. C) = ");
        // Peintah output teks
        T = masukan.nextInt();
        // Mendeklarasikan nilai dari objek masukan akan menjadi value dari variabel T
        if(T<0){
        // Jika value dari variabel T <0, maka
            System.out.print("Wujud alir baku \n" + T);
            // Output teks dan value dari variabel T
        }
        else if((0<=T) && (T <= 100)){
        // Jika value dari variabel T>=0 dan T<=100, maka
            System.out.print("Wujud air cair \n" + T);
            // Output teks dan value dari variabel T
        }
        else if(T > 100){
        // Jika value dari variabel T > 100, maka
            System.out.print("Wujud air uap/gas \n" + T);
            // Output teks dan value dari variabel T
        }
    }
}
