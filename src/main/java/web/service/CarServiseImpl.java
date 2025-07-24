package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiseImpl implements CarService {

    private final CarDao carDao;

    @Autowired
    public CarServiseImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getAllCars() {
        return carDao.getAllCars();
    }

    @Override
    public List<Car> getLimitedCars(int count) {
        List<Car> cars = carDao.getAllCars();
        if (count >= 1 && count < cars.size()) {
            return cars.subList(0, count);
        }
        return cars;
    }

}
