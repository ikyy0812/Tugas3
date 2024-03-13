import java.util.Scanner;

public class No18 {
    public static int maxab(int a, int b) {
        /* mencari maksimum dua bilangan bulat */
        return ((a >= b) ? a : b);
    }

    public static void tukar(int a, int b) {
        /* menukar dua bilangan bulat */
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("Kedua bilangan setelah tukar: a = " + a + " b = " + b);
    }

    public static void main(String[] args) {
        // Kamus
        int a, b;
        Scanner masukan = new Scanner(System.in);

        // Program Utama
        System.out.println("Maksimum dua bilangan");
        System.out.println("Ketikkan dua bilangan, pisahkan dengan RETURN:");
        a = masukan.nextInt();
        b = masukan.nextInt();
        System.out.println("Dua bilangan: a = " + a + " b = " + b);
        System.out.println("Maksimum = " + maxab(a, b));
        System.out.println("Tukar kedua bilangan...");
        tukar(a, b);
    }
}
