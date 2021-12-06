package mashina.action;

import java.util.ArrayList;

import mashina.creator.Car;
import mashina.creator.Engine;

public class Print {

    public void printEngine(Engine g) {
        System.out.println("---------------");
        ArrayList<Car> col = g.getEngine();
        for (Car gm : col) {
            System.out.println(gm.toString());
        }
    }

    public void printSort(ArrayList<Car> gamelist) {
        ArrayList<Car> gList = new ArrayList<>(gamelist);
        for (Car gm : gList) {
            System.out.println(gm.toString());
        }
    }

    public void printFindCar(Car gm) {
        System.out.println(gm.toString());
    }

    public void printMenu() {
        System.out.println("\nvyberite neobxodimoe deistvie");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("1 - Sortirobka po obemu");
        System.out.println("2 - otsortirovat voditeley po opytu");
        System.out.println("3 - otsortirovat voditeley po alfavitu");
        System.out.println("4 - Naity mashinu po marke i po cvetam");
        System.out.println("5 - Naity mashinu po nomeru");
        System.out.println("6 - vyxod");
    }

}
