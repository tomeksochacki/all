package examples;

import java.util.Scanner;

public class ExampleScan {
    public static void main(String[] args) {
        int[] myTab;
        System.out.println("Enter then number: ");
        Scanner scanner = new Scanner(System.in);
        int range = scanner.nextInt();
        myTab = new int[range];
        for (int i = 0; i < myTab.length; i++) {
            myTab[i] = i+1;
        }
        int i = 0;
        while (i<myTab.length){
            System.out.print(myTab[i]);
            i++;
        }

       // System.out.println(Arrays.toString(myTab));
    }
}
