package web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDAO;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService implements ItemService<Car> {
    private CarDAO carDAO;

    @Autowired
    public CarService(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @Override
    public int getAmount() {
        return carDAO.getItems().size();
    }

    @Override
    public List<Car> getCountItems(int count) {
        List<Car> selectedCars = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            if (i < carDAO.getItems().size()) {
                selectedCars.add(carDAO.getItems().get(i));
            } else {
                break;
            }
        }
        return selectedCars;
    }
}
