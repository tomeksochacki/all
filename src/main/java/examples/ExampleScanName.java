package examples;

import java.util.Scanner;

public class ExampleScanName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = scanner.nextLine();

        if (name.equals("Jula")){
            System.out.println("This is not my name.");
        } else if(name.equals("Maniek")){
            System.out.println("This is not my name.");
        } else if (name.equals("Tomek")){
            System.out.println("Hallo Tomek. I know You.");
        } else {
            System.out.println("I don now, what is this name.");
        }
    }
}
