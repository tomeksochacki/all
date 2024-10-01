package examples;

import java.math.BigInteger;
import java.util.Scanner;

public class ExampleCalculator {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("10022222222222222222");
        BigInteger b = new BigInteger("332444444444444444444");
        System.out.println(a.add(b));
        System.out.println(a.subtract(b));
        System.out.println(a.multiply(b));
        System.out.println(a.divide(b));
        System.out.println(a.pow(12));
        System.out.println(a.abs());

        String[] myTab = new String[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i<myTab.length; i++){
            System.out.println("Enter then name: ");
            myTab[i] = scanner.nextLine();
        }

        for (String name: myTab) {
            System.out.println(name.toString());
        };


    }
}
