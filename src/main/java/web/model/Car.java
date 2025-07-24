package web.model;


import java.util.Objects;

public class Car {

    /**
     * 1. Перенеси блок создания списка машин (имитацию БД) в слой ДАО имитируя постоянное хранилище
     *
     * 2. Слой ДАО - никаких статиков, должно быть два метода получения полного списка и части.
     *
     * Логика “больше 5, значит все” не должна находиться в дао.
     *
     * 3. Контроллер - count должен быть не обязательным параметром.
     * После чего смотрим, если есть данный параметр,
     * тогда отдается в один метод  контроллера (и далее сервис, дао),
     * если нет то в другой.
     */

    private String model;
    private String manufacturer;
    private int yearOfRelease;

    public Car() {
    }

    public Car(String model, String manufacturer, int yearOfRelease) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.yearOfRelease = yearOfRelease;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return yearOfRelease == car.yearOfRelease && Objects.equals(model, car.model) && Objects.equals(manufacturer, car.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, manufacturer, yearOfRelease);
    }
}
