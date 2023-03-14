// 13020210242 Nirmala
// Rabu, 15 Maret 2023
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.*;
public class BacaString {
    public static void main(String[] args) throws IOException {
        // Digunakan untuk melempar fungsi input menggunakan IOException
        // Kamus
        String str;
        // Pendeklarasian variabel str dengan tipe data string
        BufferedReader datAIn = new BufferedReader(new InputStreamReader(System.in));
        // Pembuatan objek datAIn sebagai perintah untuk input
        // Program
        System.out.println("\nBaca String dan Integer : \n");
        // Perintah output teks
        // Program 
        System.out.print("Masukkan Sebuah String : ");
        // Perintah output teks
        str = datAIn.readLine();
        System.out.print("String Yang Dibaca : " + str);
        // Perintah output teks dan nilai dari inputan str
    }
}
