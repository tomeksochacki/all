package examples;

import java.util.Scanner;

public class ExampleCalculat {
    public static void main(String[] args) {
        double a;
        double b;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        a = scanner.nextInt();
        System.out.println("Enter the number: ");
        b = scanner.nextInt();

        System.out.println(a + b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a - b);


    }
}
