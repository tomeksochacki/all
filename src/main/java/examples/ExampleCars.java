package examples;

import java.util.LinkedList;
import java.util.List;

public class ExampleCars {
    public static void main(String[] args) {
        Car[] cars = new Car[5];
        cars[0] = new Car(190, "blue", "nissan");
        cars[1] = new Car(195, "red", "mazda");
        cars[2] = new Car(200, "black", "jeep");
        cars[3] = new Car(240, "green", "nissan");
        cars[4] = new Car(180, "red", "bmw");

        List<Car> listCars = new LinkedList<>();
        for (int i = 0; i<cars.length; i++){
            listCars.add(cars[i]);
        }

        System.out.println("Kompletna lista:");
        for (Car car: listCars) {
            System.out.println(car.toString());
        }


        System.out.print("sublista samochodów:" + listCars.subList(2,5));
        System.out.println();
        System.out.println();
        System.out.println(listCars.remove(2));
        System.out.println(listCars.remove(3));

        System.out.println("Lista po usunięciu:");
        for (Car car:listCars) {
            System.out.println(car);
        }
    }
}
