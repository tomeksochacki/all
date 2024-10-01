package examples;

public class ExampleLoop {
    public static void main(String[] args) {
        int[][] myTab = new int[3][2];
        int counter = 0;
        for (int i = 0; i < myTab.length; i++) {
            for (int j = 0; j < myTab[i].length; j++) {
                    myTab[i][j] = counter++;
                System.out.println(myTab[i][j]);
            }
        }


    }
}
