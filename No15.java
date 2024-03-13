import java.util.Scanner;

public class No15 {
    public static void main(String[] args) {
        // Kamus
        int sum = 0;
        int x;
        Scanner masukan = new Scanner(System.in);

        // Program
        System.out.print("Masukkan nilai x (int), akhiri dg 999: ");
        x = masukan.nextInt(); // First Elmt
        if (x == 999) {
            System.out.println("Kasus kosong");
        } else {
            // Minimal ada satu data yang dijumlahkan
            sum = x; // Inisialisasi; invariant !!
            while (true) {
                System.out.print("Masukkan nilai x (int), akhiri dg 999: ");
                x = masukan.nextInt(); // Next Elmt
                if (x == 999)
                    break;
                else {
                    sum += x; // Proses
                }
            }
        }
        System.out.println("Hasil penjumlahan = " + sum);
        // Terminasi
    }
}
