package mashina.creator;

import java.util.Scanner;

import mashina.exception.CarException;

public class AddCar {
    Engine cars = new Engine();
    Scanner s = new Scanner(System.in);

    public Engine writeInfoAboutCar(Engine cars) throws CarException {
        System.out.println("Спортивная машина или Грузовая машина ?");
        System.out.println("1 - Спортивная машина\n2 - Грузавая машина");
        int ch = s.nextInt();
        if (ch != 1 && ch != 2) {
            throw new CarException("incorrect input!");
        }
        System.out.print("Mashina zhurgyzushy , FIO :");
        String name = s.next();
        System.out.print("Zhurgyzushy IIN-y:");
        int IIN = s.nextInt();
        System.out.print("Zhurgyzushy jasy:");
        int year = s.nextInt();
        System.out.print("Zhurgyzushy opyty:");
        int experience = s.nextInt();
        System.out.print("Mashina markasy:");
        String marka = s.next();
        System.out.print("Mashina shyqqan zhyly:");
        int yearOfTheCar = s.nextInt();
        System.out.print("Mashina obemy:");
        float volume = s.nextFloat();
        System.out.print("Mashina tusy:");
        String color = s.next();
        System.out.print("Mashina nomery:");
        String number = s.next();
        Condition con = Condition.Jana.Buryn_ustalyngan;
        System.out.println("Mashina zhagdaiy:");
        System.out.println("1-Jana\t2-Buryn ustalyngan");
        int i = s.nextInt();
        switch (i) {
            case 1:
                con = Condition.valueOf("Jana");
                break;
            case 2:
                con = Condition.valueOf("Buryn ustalyngan");
                break;
        }
        if (ch == 1) {
            System.out.print("Maximaldy jyldamdygy:");
            int maxSpeed = s.nextInt();
            SportCar newGame = new SportCar(IIN, name, year, experience, marka, yearOfTheCar, volume, color, number,
                    con, maxSpeed);
            try {
                cars.addToEngine(newGame);
            } catch (CarException e) {
                e.printStackTrace();
            }
        } else if (ch == 2) {
            System.out.print("Zhuk kolygynyn maximal koteretyn zhugy : ");
            int maxWeight = s.nextInt();
            Lorry newGame = new Lorry(IIN, name, year, experience, marka, yearOfTheCar, volume, color, number, con,
                    maxWeight);
            try {
                cars.addToEngine(newGame);
            } catch (CarException e) {
                e.printStackTrace();
            }
        }
        return cars;
    }
}