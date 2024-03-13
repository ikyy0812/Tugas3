import java.util.Scanner;

public class No17 {
    public static void main(String[] args) {
        // Kamus
        int sum = 0;
        int x;
        Scanner masukan = new Scanner(System.in);

        // Program
        sum = 0; // Inisialisasi
        System.out.print("Masukkan nilai x (int), akhiri dg 999 : ");
        x = masukan.nextInt(); // First Elmt
        while (x != 999) { // Kondisi berhenti
            sum = sum + x; // Proses
            System.out.print("Masukkan nilai x (int), akhiri dg 999 : ");
            x = masukan.nextInt(); // First Elmt
        }
        System.out.println("Hasil penjumlahan = " + sum); // Terminasi
    }
}
