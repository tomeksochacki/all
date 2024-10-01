package examples;

import java.io.*;
import java.util.Scanner;

public class ExampleBufferedRead {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = scanner.nextLine();

        try (PrintWriter out = new PrintWriter("filename.txt")) {
            out.println(name);
        } catch (FileNotFoundException e){
            e.getMessage();
        }

        BufferedReader br = new BufferedReader(new FileReader("filename.txt"));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            String everything = sb.toString();
            System.out.println(everything);
        } finally {
            br.close();
        }
    }
}
