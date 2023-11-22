package application;

import java.util.Locale;
import java.util.Scanner;

public class Program01 {
    public static final double PI = 3.14159;

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius =sc.nextDouble();

        double c = circumference(radius);

        double v = volum(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volum: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", PI);
    }

    public static double circumference(double radius) {
        return 2 * PI * radius;
    }

    public static double volum(double radius) {
        return 4 * PI * (Math.pow(3, radius)) / 3 ;
    }
}
