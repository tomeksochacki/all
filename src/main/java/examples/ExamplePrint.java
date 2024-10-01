package examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Scanner;

public class ExamplePrint {
    public static void main(String[] args) throws FileNotFoundException {

        try {
            String name = "Tomek";
            int year = Calendar.getInstance().get(Calendar.YEAR);
            double result = 50/4;
            PrintWriter printWriter = new PrintWriter("text.txt");
            printWriter.print(name);
            printWriter.print(year);
            printWriter.print(result);
            printWriter.close();

        } catch (FileNotFoundException e){
            e.getMessage();
        }

        Scanner input = new Scanner(System.in);

        File file = new File(input.nextLine());

        input = new Scanner(file);


        while (input.hasNextLine()) {
            String line = input.nextLine();
            System.out.println("Text from file:" + line);
        }
        input.close();
    }
}
