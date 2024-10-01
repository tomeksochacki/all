package examples;

import java.util.Arrays;
public class ExampleStream {

        public static void main(String[] args) {
            Arrays.asList(55, 76, -4, 32, 1, -54)
                    .stream()
                    .filter(i -> i > 0)
                    .sorted()
                    .forEach(i -> System.out.print(i + " "));
        }
    }
