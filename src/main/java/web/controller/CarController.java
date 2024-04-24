package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.servis.CarService;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Controller
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String printCars(ModelMap model, @RequestParam(required = false) Integer count) {
        model.addAttribute("cars", carService.
                createAndVerification(Objects.requireNonNullElse(count, 5)));
        return "cars";
    }
}
