package web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDAO;
import web.models.Car;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {
    private CarDAO carDAO;

    @Autowired
    public CarService(CarDAO carDAO) {
        this.carDAO = carDAO;
    }
    public List<Car> getCountItems(int count) {
        return carDAO.getItems().stream()
                .limit(count)
                .collect(Collectors.toList());
    }

}
