import java.util.Scanner;

public class No14 {
    public static void main(String[] args) {
        // Kamus
        int N;
        int i = 1;
        Scanner masukan = new Scanner(System.in);

        // Program
        System.out.print("Nilai N > 0 = ");
        N = masukan.nextInt();
        System.out.print("Print i dengan WHILE (ringkas): \n");
        while (i <= N) {
            System.out.println(i++);
        }
        // (i > N)
    }
}
