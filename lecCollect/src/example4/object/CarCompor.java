package example4.object;

import java.util.Comparator;

public class CarCompor implements Comparator<Car> {


    @Override
    public int compare(Car o1, Car o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
