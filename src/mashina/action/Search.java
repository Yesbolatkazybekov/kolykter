package mashina.action;

import java.util.ArrayList;
import java.util.Iterator;

import mashina.creator.Car;
import mashina.creator.Engine;
import mashina.exception.CarException;

public class Search implements Findable {
    Print print2 = new Print();

    public void findGame(String marka, String color, Engine g) throws CarException {
        if (marka == null) {
            throw new CarException("Marka is null!");
        }
        if (color == null) {
            throw new CarException("Color is null!");
        }
        ArrayList<Car> col = g.getEngine();
        Iterator<Car> thegame = col.iterator();
        System.out.println("---------------");
        System.out.println("Marka: " + marka + ",cvet " + color);
        System.out.println("---------------");
        while (thegame.hasNext()) {
            Car current = thegame.next();
            if (current.getMarka().equalsIgnoreCase(marka) && current.getColor().equalsIgnoreCase(color)) {
                print2.printFindCar(current);
            }
        }
    }

    public void SearchForCar(String number, Engine g) throws CarException {
        if (number == null) {
            throw new CarException("The number null!!!");
        }
        ArrayList<Car> col = g.getEngine();
        Iterator<Car> thegame = col.iterator();
        System.out.println("---------------");
        System.out.println("Mashiny s nomerom  " + number);
        System.out.println("---------------");
        while (thegame.hasNext()) {
            Car current = thegame.next();
            if (current.getNumber().equalsIgnoreCase(number)) {
                print2.printFindCar(current);;
            }
        }
    }


}