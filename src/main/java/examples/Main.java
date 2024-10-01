package examples;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        /*int one = 1033333333;
        byte two = 10;
        int three = (int)two;
        byte four = (byte)one;
        System.out.println(four);
        double numberM = 190.7;
        four = (byte) numberM;
        System.out.println(four);

        char letter = 'h';
        int my = letter;
        System.out.println(my);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int numberOne = scanner.nextInt();
        System.out.println("Enter the number:");
        int numberTwo = scanner.nextInt();

        if (numberOne > numberTwo){
            System.out.println("NumberOne is bigger than numberTwo");
        } else {
            System.out.println("NubmerTwo is bigger than numberOne");
        }


        final String NAME = "Tomek";
        final String SURNAME = "Sochacki";
        final String CAR = "Nissan";
        final String DESCRIBE = NAME + " " + SURNAME + " " + CAR;
        System.out.println(DESCRIBE);
        final String DESCRIBE2 = "Tomek Sochacki Nissan";
        System.out.println(DESCRIBE2.substring(0, 14));

        String userOne = "Tomek";
        String userTwo = "Magda";
        String userThree = "ToMag";

        System.out.println(userOne + "\n" + userTwo + "\n" + userThree);

        double a = 2.0;
        double b = 2.0;
        double c = 2.0;

        double result = (a + b) * c;
        double result2 = a - b / c;
        System.out.println(result);
        System.out.println(result2);

        a++;
        b++;
        c++;
        System.out.println(a + " " + b + " " + c);

        System.out.println((a + b) > c);
        System.out.println(a==b);
*/

        //Scanner scanner = new Scanner(System.in);

//        int myInt;
//        myInt = scanner.nextInt();

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("John Doe", 35, 70000, "IT"));
        employeeList.add(new Employee("Jane Smith", 28, 80000, "Finance"));
        employeeList.add(new Employee("Alex Johnson", 32, 60000, "IT"));
        employeeList.add(new Employee("Emily Davis", 40, 90000, "HR"));
        employeeList.add(new Employee("Michael Brown", 45, 75000, "IT"));
        employeeList.add(new Employee("Lisa White", 29, 85000, "Finance"));
        employeeList.add(new Employee("Tom Clark", 50, 95000, "HR"));

        //Map<Object, Long> collect = employeeList.stream()
        //        .collect(Collectors.groupingBy(employee -> employee.getDepartment(), Collectors.counting()));

        Map<String, Integer> totalByDept = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.summingInt(Employee::getPrice)));
                //.collect(Collectors.groupingBy(employee -> employee.getDepartment(), Collectors.counting()));


        System.out.println(totalByDept);

        Employee employee = new Employee("ffff", 34, 566, "ggg");
        System.out.println(employee.conutAvg(employeeList));


        int numberRestOfModulo = 0;
        int number = 40;

        double mod = 40 % 3;
        System.out.println(mod);

        List<BoardGame> games = Arrays.asList(
                new BoardGame("Terraforming Mars", 8.38, new BigDecimal("123.49"), 1, 5),
                new BoardGame("Codenames", 7.82, new BigDecimal("64.95"), 2, 8),
                new BoardGame("Puerto Rico", 8.07, new BigDecimal("149.99"), 2, 5),
                new BoardGame("Terra Mystica", 8.26, new BigDecimal("252.99"), 2, 5),
                new BoardGame("Scythe", 8.3, new BigDecimal("314.95"), 1, 5),
                new BoardGame("Power Grid", 7.92, new BigDecimal("145"), 2, 6),
                new BoardGame("7 Wonders Duel", 8.15, new BigDecimal("109.95"), 2, 2),
                new BoardGame("Dominion: Intrigue", 7.77, new BigDecimal("159.95"), 2, 4),
                new BoardGame("Patchwork", 7.77, new BigDecimal("75"), 2, 2),
                new BoardGame("The Castles of Burgundy", 8.12, new BigDecimal("129.95"), 2, 4)
        );

        games.stream()
                .filter(g -> g.getMaxPlayers()>4).filter(g -> g.getRating()>8).filter(g -> new BigDecimal(150).compareTo(g.price) <150 ).map(g->g.getName()).forEach(System.out::println);



        //IntStream ints = IntStream.range(0, 123);
        //ints.forEach(System.out::println);

        IntStream numbersStream = IntStream.range(0, 8);
        System.out.println("Przed");
        numbersStream = numbersStream.filter(n -> n % 2 == 0);
        System.out.println("W trakcie 1");
        numbersStream = numbersStream.map(n -> {
            System.out.println("> " + n);
            return n;
        });
        System.out.println("W trakcie 2");
        numbersStream = numbersStream.limit(2);
        System.out.println("W trakcie 3");
        numbersStream.forEach(System.out::println);
        System.out.println("Po");

        double highestRanking = 0;
        BoardGame bestGame = null;
        for (BoardGame game : games) {
            if (game.name.contains("a")) {
                if (game.rating > highestRanking) {
                    highestRanking = game.rating;
                    bestGame = game;
                }
            }
        }
        System.out.println(bestGame.name);



        //int combinedString = games.stream();
                //.reduce(0, (element1, game) -> element1 + game.getRating(), Integer::sum);
       /* int choice;
        boolean correctAnswer1 = false, correctAnswer2 = false, correctAnswer3 = false;
        do {
            if (!correctAnswer1) {
                System.out.println("Pytanie 1: W którym roku powstał język Java?");
                choice = scanner.nextInt();
                if (choice == 1995) {
                    System.out.println("Brawo! Poprawna odpowiedź!");
                    correctAnswer1 = true;
                } else {
                    System.out.println("Odpowiedź błędna!");
                }
            }
            if (!correctAnswer2) {
                System.out.println("Pytanie 2: Ile wersji Javy wydano do końca 2023 roku?");
                choice = scanner.nextInt();
                if (choice == 21) {
                    System.out.println("Brawo! Poprawna odpowiedź!");
                    correctAnswer2 = true;
                } else {
                    System.out.println("Odpowiedź błędna!");
                }
            }
            if (!correctAnswer3) {
                System.out.println("Pytanie 3: Z ilu bajtów składa się typ long?");
                choice = scanner.nextInt();
                if (choice == 64) {
                    System.out.println("Brawo! Poprawna odpowiedź!");
                    correctAnswer3 = true;
                } else {
                    System.out.println("Odpowiedź błędna!");
                }
            }


        } while (!correctAnswer1 || !correctAnswer2 || !correctAnswer3);
        System.out.println("KONIEC QUIZU!");
*/
        /*int i = 1;
        while (i <= 5){
            System.out.println(i + " ");
            i++;
        }

        for (int j = 1; j<= 5; j++){
            System.out.println(j + " ");

        }*/


        /*Scanner in = new Scanner(System.in);
        System.out.println("Dla jakiej liczby całkowitej chcesz obliczyć silnię?");
        int input = in.nextInt();
        long result = 1;
        if (input > 1) {
            for (int i = 1; i <= input; i++) {
                result *= i;
            }
        }
        System.out.println("Silnia liczby " + input + " wynosi: " + result);

        int[] array = {1, 2, 3, 4, 5};
        for (int i:array) {
            System.out.println(i);

        }*/

        /*for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("liczba: " + i + "jest parzysta");
            }
        }

        int[] myTab = new int[5];
        myTab[0] = 20;
        myTab[1] = -2;
        myTab[2] = 3;
        myTab[3] = 4;
        myTab[4] = -1;
        int sumaPlus = 0;
        int sumaMinus = 0;

        for (int i = 0; i < myTab.length; i++) {
            if (myTab[i] < 0) {
                sumaMinus++;
            } else {
                sumaPlus++;
            }
        }
        System.out.println(sumaMinus + " " + sumaPlus);

        double avg = 0.0;
        double sum = 0.0;
        int k = 0;
        int[] myTab2 = {2, 4, 5, 6};
        for (int i = 0; i < myTab2.length; i++) {
            sum = myTab2[i] + sum;
            k++;
        }
        avg = sum/k;

        System.out.println(avg);*/

        /*char[] array = {'k', 'a', 'j', 'a', 'k'};
        boolean isPalindrome = true;
        int arrayLength = array.length;
        for (int i = 0; i < arrayLength / 2; i++) {
            if (array[i] != array[arrayLength - i - 1]) {
                isPalindrome = false;
            }
        }
        System.out.println("Czy znaki w tablicy tworzą palindrom? " + (isPalindrome ? "TAK" : "NIE"));
*/
        /*int[][] tab = new int[5][10];
        int counter = 0;
        for (int i = 0; i<tab.length; i++){
            for (int j = 0; j<tab[i].length; j++){
                tab[i][j] = counter++;
                System.out.print(tab[i][j] + ", ");
            }
            System.out.println();
        }*/

     /*   int[][] myTab2D = new int[3][];
        myTab2D[0] = new int[3];
        myTab2D[1] = new int[2];
        myTab2D[2] = new int[4];

        for (int i = 0; i<myTab2D.length; i++){
            for (int j = 0; j<myTab2D[i].length; j++){
                System.out.print(myTab2D[i][j]);
            }
            System.out.println();
        }*/

        /*double avg = 0.0;
        double sum = 0.0;
        Random random = new Random();
        int[] myTabNumberRandom = new int[10];
        for (int i = 0; i < myTabNumberRandom.length; i++) {
            myTabNumberRandom[i] = random.nextInt(10);
            System.out.print(myTabNumberRandom[i] + ", ");
            sum = sum + myTabNumberRandom[i];
        }
        avg = sum / myTabNumberRandom.length;

        System.out.println(avg);*/

        /*int[] myTab3 = new int[10];
        int[] myTabR = new int[10];
        Random random1 = new Random();
        for (int j = 9, i = 0; i < myTab3.length; i++, j--) {
            myTab3[i] = random1.nextInt(10);
            myTabR[j] = myTab3[i];

        }
        System.out.print(Arrays.toString(myTab3));
        System.out.println();
        System.out.print(Arrays.toString(myTabR));*/

       /* Random random = new Random();
        int[]tabNext = new int[10];
        int i = 0;
        while (i<tabNext.length){
            int temp = -100 + random.nextInt(10);
            if (temp<0)
            tabNext[i]=temp;
            i++;
        }
        System.out.println(Arrays.toString(tabNext));*/

        /*Random random4 = new Random();
        int[] tabMyMy = new int[10];
        int i = 1;
        while (i < tabMyMy.length) {
            tabMyMy[0] = random4.nextInt(100);
            int temp = tabMyMy[0];
            for (int j = 1; j < tabMyMy.length; j++) {
                int temp2 = random4.nextInt(100);
                if (temp2 >= temp) {
                    tabMyMy[j] = temp2;
                } else {
                    continue;
                }
            }
            i++;
        }
        System.out.println(Arrays.toString(tabMyMy));*/

    }
}



