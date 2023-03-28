package web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDAO;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private CarDAO carDAO;
    @Autowired
    public CarService(CarDAO carDAO) {
        this.carDAO = carDAO;
    }
    public int getAmount() {
        return carDAO.getCars().size();
    }
    public List<Car> getCountCars(int count) {
        List<Car> selectedCars = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            if (i < carDAO.getCars().size()) {
                selectedCars.add(carDAO.getCars().get(i));
            } else {
                break;
            }
        }
        return selectedCars;
    }
}
