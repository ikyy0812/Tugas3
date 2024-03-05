import java.util.Scanner;

/* Maksimum dua bilangan yang dibaca */
public class No9 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* Kamus */
        int a, b;
        Scanner masukan = new Scanner(System.in);
        /* Program */
        System.out.println("Maksimum dua bilangan: ");
        System.out.println("Ketikkan dua bilangan, pisahkan dg RETURN: ");
        a = masukan.nextInt();
        b = masukan.nextInt();
        System.out.println("Kedua bilangan: a = " + a + ", b = " + b);
        if (a >= b) {
            System.out.println("Nilai a yang maksimum: " + a);
        } else { /* a < b */
            System.out.println("Nilai b yang maksimum: " + b);
        }
    }
}
