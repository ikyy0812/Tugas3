import java.util.Scanner;

public class No13 {
    public static void main(String[] args) {
        // Kamus
        int N;
        int i;
        Scanner masukan = new Scanner(System.in);

        // Program
        System.out.print("Nilai N > 0 = "); // Inisialisasi
        N = masukan.nextInt();
        i = 1; // First Elmt
        System.out.print("Print i dengan WHILE: \n");
        while (i <= N) { // Kondisi pengulangan
            System.out.println(i); // Proses
            i++; // Next Elmt
        }
        // (i > N)
    }
}
