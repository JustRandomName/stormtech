package example4;

import example4.object.Car;
import example4.object.CarCompor;

import java.util.TreeSet;

public class Example4_2 {
    public static void main(String[] args) {

        CarCompor carCompor = new CarCompor();
        TreeSet<Car> set = new TreeSet<>(carCompor);

        set.add(new Car(1, "Subaru"));
        set.add(new Car(2, "Nissan"));
        set.add(new Car(3, "Audi"));

        for (Car car : set) {
            System.out.println(car.getName());
        }
    }
}
