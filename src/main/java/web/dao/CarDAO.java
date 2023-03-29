package web.dao;

import org.springframework.stereotype.Repository;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDAO implements ItemDAO<Car> {
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("car1", 1, "country1"));
        cars.add(new Car("car2", 2, "country2"));
        cars.add(new Car("car3", 3, "country3"));
        cars.add(new Car("car4", 4, "country4"));
        cars.add(new Car("car5", 5, "country5"));

    }

    @Override
    public List<Car> getItems() {
        return cars;
    }
}
