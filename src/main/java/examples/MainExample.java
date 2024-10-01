package examples;

import java.util.Arrays;
import java.util.Random;

public class MainExample {

    public static void main(String[] args) {

        int[] myTab = new int[100];
        Random random = new Random();
        for (int i = 0; i<100; i++){
            myTab[i] = random.nextInt(50);
        }

        Arrays.sort(myTab);

    }
}
