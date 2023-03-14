// 13020210242 Nirmala
// Rabu, 15 Maret 2023
// Ekspresi Kondisional Dengan Boolean
public class KasusBoolean {
    public static void main(String[] args) {
        // Kamus
        boolean bool;
        // Mendeklarasikan variabel bool dengan tipe data boolean
        // Algoritma
        bool = true;
        // Mendeklarasikan bahwa value dari variabel bool adalah true
        if(bool){
        // Jika value dari variabel bool yang terbaca, maka
            System.out.print("True\n");
            // Perintah Output Teks 
        }
        else{
        // Jika value dari variabel bool diluar dari value yang di deklarasikan, maka
            System.out.print("False\n");
            // Output Teks 
        }
        if(!bool){
        // Jika value dari variabel bool merupakan negasi dari value yang di deklarasikan, maka
            System.out.print("False\n");
            // Output Teks 
        }
        else{
        // Jika value dari variabel bool diluar dari pada negasi dari value yang di deklarasikan, maka
            System.out.print("Benar\n");
            // Output Teks
        }
    }
}
