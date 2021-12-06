package mashina.action;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import mashina.creator.Car;
import mashina.creator.Engine;

public class Sort implements Sortable{
    Print print = new Print();

    public void volumeEngine(Engine g) {
        ArrayList<Car> col = g.getEngine();
        Comparator<Car> comp1 = new Comparator<Car>() {
            public int compare(Car c1, Car c2) {
                return Double.compare(c1.getVolume(), c2.getVolume());
            }
        };
        Collections.sort(col, comp1);
        System.out.println("---------------");
        System.out.println("sortirovat po  obiemu:");
        System.out.println("---------------");
        print.printSort(col);
    }

    public void sortByExperience(Engine g) {
        ArrayList<Car> col = g.getEngine();
        Comparator<Car> comp1 = new Comparator<Car>() {
            public int compare(Car g1, Car g2) {
                return Double.compare(g1.getExperience(), g2.getExperience());
            }
        };
        Collections.sort(col, comp1);
        System.out.println("---------------");
        System.out.println("sortirovka po opytu:");
        System.out.println("---------------");
        print.printSort(col);
    }

    public void sortByAlphabet(Engine g) {
        ArrayList<Car> col = g.getEngine();
        Comparator<Car> comp2 = new Comparator<Car>() {
            public int compare(Car o1, Car o2) {
                return o1.getFamnam().compareToIgnoreCase(o2.getFamnam());
            }
        };
        Collections.sort(col, comp2);
        System.out.println("---------------");
        System.out.println("sortirovka po alfavitu:");
        System.out.println("---------------");
        print.printSort(col);

    }

}
