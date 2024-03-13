import java.util.Scanner;

public class No16 {
    public static void main(String[] args) {
        // Kamus
        int sum = 0;
        int x;
        Scanner masukan = new Scanner(System.in);

        // Program
        System.out.print("Masukkan nilai x (int), akhiri dg 999 : ");
        x = masukan.nextInt(); // First Elmt
        if (x == 999) {
            System.out.println("Kasus kosong");
        } else {
            // Minimal ada satu data yang dijumlahkan
            sum = 0; // Inisialisasi; invariant !!
            do {
                sum = sum + x; // Proses
                System.out.print("Masukkan nilai x (int), akhiri dg 999 : ");
                x = masukan.nextInt(); // Next Elmt
            } while (x != 999); // Kondisi pengulangan
            System.out.println("Hasil penjumlahan = " + sum);
        }
        // Terminasi
    }
}
