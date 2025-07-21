package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiseImpl implements CarService {

    private List<Car> cars;

    public CarServiseImpl() {
        cars = new ArrayList<Car>();
        cars.add(new Car("3", "BMW", 2025));
        cars.add(new Car("Vesta", "Lada", 2021));
        cars.add(new Car("v90", "Volvo", 2020));
        cars.add(new Car("Focus", "Ford", 2015));
        cars.add(new Car("Camry", "Toyota", 2010));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count >= 1 && count < 5) {
            return cars.subList(0, count);
        }
        return cars;
    }

}
