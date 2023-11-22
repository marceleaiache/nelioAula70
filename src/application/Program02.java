package application;

import util.Calculator;
import java.util.Locale;
import java.util.Scanner;

public class Program02 {
    public static final double PI = 3.14159;

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.println("Enter radius: ");
        double radius =sc.nextDouble();
        double c = calc.circumference(radius);
        double v = calc.volum(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volum: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", calc.PI);
    }


}
