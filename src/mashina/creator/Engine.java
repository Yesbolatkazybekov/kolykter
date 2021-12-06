package mashina.creator;

import java.util.ArrayList;

import mashina.exception.CarException;

public class Engine {
    private ArrayList<Car> cars;

    public Engine() {
        cars = new ArrayList<Car>();
    }

    public ArrayList<Car> getEngine() {
        return (ArrayList<Car>) cars;
    }

    public Engine(ArrayList<Car> cars) throws CarException {
        if (cars == null) {
            throw new CarException("Gift is null!");
        }
        this.cars = cars;
    }

    public boolean addToEngine(Car c) throws CarException {
        if (c == null) {
            throw new CarException("Driver object can't add, because it is null!");
        }
        boolean i = false;
        i = cars.add(c);
        return i;
    }

}