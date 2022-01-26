import java.util.Scanner;

public class UcgenAlaniHesapla {
    public static void main(String[] args) {
        double a, b, c, u,alan;
        Scanner input = new Scanner(System.in);

        System.out.print("1. kenar uzunlugunu girin cm?:");
        a = input.nextDouble();

        System.out.print("2. kenar uzunlugunu girin cm?:");
        b = input.nextDouble();

        System.out.print("3. kenar uzunlugunu girin cm?:");
        c = input.nextDouble();

        u = (a+b+c)/2;

        alan = u * (u-a) * (u-b) * (u-c);
        alan = Math.sqrt(alan);

        System.out.println("u: ("+ u + ") Ucgenin alani: " + alan + " cm2.");
    }
}
