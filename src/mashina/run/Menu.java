package mashina.run;

import java.util.Scanner;

import mashina.action.Print;
import mashina.action.Search;
import mashina.action.Sort;
import mashina.creator.Creator;
import mashina.creator.Engine;
import mashina.exception.CarException;

public class Menu {
    Creator creator = new Creator();
    Engine engine = creator.build(new Engine());
    Sort sort = new Sort();
    Search find = new Search();
    // float volume = sort.volumeEngine(engine);
    Print print = new Print();
    Scanner sc = new Scanner(System.in);

    public void showMenu() {
        print.printMenu();
        int n = sc.nextInt();
        if (n == 1) {
            sort.volumeEngine(engine);
            showMenu();
        } else if (n == 2) {
            sort.sortByExperience(engine);
            ;
            showMenu();
        } else if (n == 3) {
            sort.sortByAlphabet(engine);
            showMenu();
        } else if (n == 4) {
            System.out.print("vvedite marku:");
            String marka = sc.next();
            System.out.print("vvedite cvet :");
            String color = sc.next();
            try {
                find.findGame(marka, color, engine);
            } catch (CarException e1) {
                e1.printStackTrace();
            }
            showMenu();
        } else if (n == 5) {
            System.out.print("vvedite nomer mashiny:");
            String number = sc.next();
            try {
                find.SearchForCar(number, engine);
            } catch (CarException e) {
                e.printStackTrace();
            }
            showMenu();
        } else if (n == 6) {
            System.out.println("rabota zavershena!");
        } else {
            System.out.print("nekorrektnyi vvod!");
            showMenu();
        }
    }

    public void show() {
        print.printEngine(engine);
    }
}
