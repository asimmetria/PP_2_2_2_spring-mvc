package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.services.CarService;

@Controller
@RequestMapping("/cars")
public class CarController {
    private CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping()
    public String index(@RequestParam(value = "count", required = false, defaultValue = "-1") int count,
                        Model model) {
        if (count != -1) {
            model.addAttribute("cars", carService.getCountItems(count));
        } else {
            model.addAttribute("cars", carService.getCountItems(carService.getAmount()));
        }
        return "cars";
    }

}

