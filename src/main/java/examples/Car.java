package examples;

public class Car {
    int speed;
    String color;
    String name;

    public Car(int speed, String color, String name) {
        this.speed = speed;
        this.color = color;
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "example.Car{" +
                "speed=" + speed +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
