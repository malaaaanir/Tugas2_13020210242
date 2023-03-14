// 13020210242 Nirmala
// Rabu, 15 Maret 2023
import java.util.Scanner;
// Maksimun Dua Bilangan Yang Dibaca
public class Max2 {
    public static void main(String[] args) {
        // Kamus
        int a, b;
        // Mendeklarasikan variabel a dan b dengan tipe data int
        Scanner masukan = new Scanner(System.in);
        // Membuat objek masukan untuk inputan class Scanner
        // Program
        System.out.print("Maksimum dua bilagnan : \n");
        // Perintah output teks
        System.out.print("Ketikkan dua bilangan, pisahkan dengan RETURN : \n");
        // Perintah output teks
        a = masukan.nextInt();
        // Mendeklarasikan bahwa nilai dari inputan masukan akan terbaca di variabel a
        b = masukan.nextInt();
        // Mendeklarasikan bahwa nilai dari inputan masukan akan terbaca di variabel b
        System.out.println("Ke Dua Bilangan : a = " + a + " b = " + b);
        // Perintah output teks, value dari variabel a, teks, dan value dari variabel b
        if(a>=b){
        // Jika value dari variabel a lebih besar dari value variabel b, maka
            System.out.println("Nilai a yang maksimum " + a);
            // Perintah output teks dan value dari variabel a
        }
        else{ // a < b
        // Jila value dari variabel a lebih kecil dari value variabel b, maka
            System.out.println("Nilai b yang maksimum " + b);
            // Perintah output teks dan value dari variabel b
        }
    }
}
