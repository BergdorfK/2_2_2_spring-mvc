package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
@RequestMapping("/cars")
public class CarController {
    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public String printCars(@RequestParam(value = "count", defaultValue = "5") Integer count, ModelMap model) {
        if (count != null) {
            model.addAttribute("cars", carService.getLimitedCars(count));
        } else {
            model.addAttribute("cars", carService.getAllCars());
        }
        return "cars";
    }
}
