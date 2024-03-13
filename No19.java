import java.util.Scanner;

public class No19 {
    public static void main(String[] args) {
        // Kamus
        int T;
        Scanner masukan = new Scanner(System.in);

        // Program
        System.out.println("Contoh IF tiga kasus");
        System.out.print("Temperatur (der. C) = ");
        T = masukan.nextInt();
        if (T < 0) {
            System.out.println("Wujud air beku " + T);
        } else if (T >= 0 && T <= 100) {
            System.out.println("Wujud air cair " + T);
        } else if (T > 100) {
            System.out.println("Wujud air uap/gas " + T);
        }
    }
}
