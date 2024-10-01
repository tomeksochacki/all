package examples;

import java.util.ArrayList;
import java.util.List;


public class Employee {
    String name;
    Integer age;
    Integer price;
    String department;

    public Employee(String name, Integer age, Integer price, String department) {
        this.name = name;
        this.age = age;
        this.price = price;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "example.Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", price=" + price +
                ", department='" + department + '\'' +
                '}';
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public List<Double> conutAvg(List<Employee> employees){
        double sumIt = 0.0;
        double sumFinance = 0.0;
        double sumHr = 0.0;
        double avgIt = 0.0;
        double avgHr = 0.0;
        double avgFinance = 0.0;
        List<Double> temp = new ArrayList<Double>();
        for (int i = 0; i <employees.size(); i++){
            if (employees.get(i).getDepartment().equals("IT")){
                sumIt= employees.get(i).getPrice() + sumIt;
            } else if (employees.get(i).getDepartment().equals("Finance")){
                sumFinance = employees.get(i).getPrice() + sumFinance;
            } else if (employees.get(i).getDepartment().equals("HR")){
                sumHr = employees.get(i).getPrice() + sumHr;
            }
        }

        avgHr = sumHr/2;
        avgFinance = sumFinance/2;
        avgIt = sumIt/3;

        temp.add(avgHr);
        temp.add(avgFinance);
        temp.add(avgIt);
    return temp;
    }
}
