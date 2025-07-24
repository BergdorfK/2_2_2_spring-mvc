package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;


@Repository
public class CarDaoImpl implements CarDao {
    private List<Car> cars;

    public CarDaoImpl() {
        cars = new ArrayList<Car>();
        cars.add(new Car("3", "BMW", 2025));
        cars.add(new Car("Vesta", "Lada", 2021));
        cars.add(new Car("v90", "Volvo", 2020));
        cars.add(new Car("Focus", "Ford", 2015));
        cars.add(new Car("Camry", "Toyota", 2010));
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }
}
