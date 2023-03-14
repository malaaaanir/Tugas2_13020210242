// 13020210242 Nirmala
// Rabu, 15 Maret 2023
import java.util.Scanner;
public class KasusSwitch {
    public static void main(String[] args) {
        // Kasus
        char cc;
        // Mendeklarasikan variabel cc dengan tipe data char
        Scanner masukan = new Scanner(System.in);
        // Membuat objek masukan untuk perintah inputan class Scanner
        // Program 
        System.out.print("Masukkan Sebuah Huruf, Akhiri dengan RETURN \n");
        // Perintah output teks
        cc = masukan.next().charAt(0);
        // Mendeklarasikan bahwa nilai dari objek masukan merupakan value dari variabel cc
        switch(cc){
        // Membuat kondisi dengan hasil inputan variabel cc, jika
            case 'a' : {
            // Value dari variabel cc merupakan a, maka
                System.out.print("Yang Anda Ketik Adalah a \n");
                break;
                // Perintah untuk menghentikan tindakan pemeriksaan kondisi value variabel cc
            }
            case 'u' : {
            // Value dari variabel cc merupakan u, maka
                System.out.print("Yang Anda Ketik Adalah u \n");
                // Output teks
                break;
                // Perintah untuk menghentikan tindakan pemeriksaan kondisi value variabel cc
            }
            case 'e' : {
            // Value dari variabel cc merupakan e, maka    
                System.out.print("Yang Anda Ketik Adalah e \n");
                // Output teks
                break;
                // Perintah untuk menghentikan tindakan pemeriksaan kondisi value variabel cc
            }
            case 'i' : {
            // Value dari variabel cc merupakan i, maka    
                System.out.print("Yang Anda Ketik Adalah i \n");
                // Output teks
                break;
                // Perintah untuk menghentikan tindakan pemeriksaan kondisi value variabel cc
            }
            case 'o' : {
            // Value dari variabel cc merupakan o, maka    
                System.out.print("Yang Anda Ketik Adalah o \n");
                // Output teks
                break;
                // Perintah untuk menghentikan tindakan pemeriksaan kondisi value variabel cc
            }
            default:
            // Perintah ketika tidak ada kasus yang cocok pada ekspresi Switch
                System.out.print("Yang Anda Ketik Adalah Huruf Mati \n");
                // Output teks
        }
    }
}
