// 13020210242 Nirmala
// Rabu, 15 Maret 2023
import java.util.Scanner;
// Contoh program yang mengandung prosedur dan fungsi
// Prosedur/Fungsi
public class SubProgram {
    public static int maxab(int a, int b) {
    // method/function maxab dengan parameters a dan b bertipe data int
        // Mencari maksimum dua bilangan bulat
        return ((a >= b) ? a : b);
        // Perintah mengembalikan nilai dari ((a >= b) ? a : b)
    }
    public static void tukar(int a, int b){
    // method/function tukar dengan parameters a dan b bertipe data int
        // Menukar dua bilangan bulat
        int temp;
        // Mendeklarasikan variabel temp dengan tipe data int
        temp = a;
        // Mendeklarasikan hasil dari variabel temp adalah value dari variabel a
        a = b;
        // Mendeklarasikan hasil dari variabel a adalah value dari variabel b
        b = temp;
        // Mendeklarasikan hasil dari variabel b adalah value dari variabel temp
        System.out.println("Ke dua bilangan setelah tukar : a = " + a + " b = " + b);
        // Perintah output teks, value dari variabel a, teks, dan value dari variabel b
    }
    // Program Utama
    public static void main(String[] args){
        // Membaca dua bilangan integer
        // Menuliskan maksimum dua bilangan yang di baca dengan memanggil fungsi
        // Menukar kedua bilangan dengan 'prosedur'
        int a, b;
        // Mendeklarasikan variabel a dan b dengan tipe data int
        Scanner masukan = new Scanner(System.in);
        // Mendeklarasikan objek masukan sebagai inputan class Scanner
        System.out.print("Masukkan dua bilangan\n");
        // Perintah output teks
        System.out.print("Ketikkan dua bilangan, pisahkan dengan RETURN : \n");
        // Perintah output teks
        a = masukan.nextInt();
        // Mendeklarasikan nilai dari objek masukan akan menjadi value dari variabel a
        b = masukan.nextInt();
        // Mendeklarasikan nilai dari objek masukan akan menjadi value dari variabel b
        System.out.println("Ke dua bilangan : a = " + a + " b " + b);
        // Perintah output teks, value dari variabel a, teks, dan value dari variabel b
        System.out.println("Maksimum = " + (maxab(a, b)));
        // Perintah output teks dan hasil dari pemanggilan method/function maxab berparameters a dan b
        System.out.print("Tukar kedua bilangan ... \n");
        // Perintah output teks
        tukar(a, b);
        // Perintah pemanggilan method/function maxab berparameters a dan b
    }
}
