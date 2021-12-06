package mashina.creator;

import mashina.exception.CarException;

public class Creator {
    public Engine build(Engine cars) {
        Lorry lorry1 = new Lorry(740102444903L, "Bashenov Marat", 47, 11, "Mercedes", 2014, (float) 6.3, "black",
                "KZ_666_01", Condition.Buryn_ustalyngan, 1200);
        Lorry lorry2 = new Lorry(135846846L, "Ivanov Konstantin", 43, 25, "Fura", 2009, (float) 5.8, "red", "KZ_745_01",
                Condition.Buryn_ustalyngan, 1600);
        Lorry lorry3 = new Lorry(871231216457L, "Serik Zengir", 25, 7, "Gazel", 2001, (float) 2.7, "white",
                "KZ_606_16", Condition.Buryn_ustalyngan, 1860);
        Lorry lorry4 = new Lorry(12354656457L, "Abdollaev Adilet", 29, 10, "Kamaz", 2011, (float) 4.2, "blue", "KZ_741_13",
                Condition.Buryn_ustalyngan, 1240);
        Lorry lorry5 = new Lorry(445435156457L, "Bakytzhanuly Rysdaulet ", 41, 18, "Truck", 2017, (float) 4.2, "green",
                "KZ_243_11", Condition.Jana, 4800);
        SportCar sport1 = new SportCar(231386457L, "Kazbekov Dias", 33, 14, "Mercedes", 2011, (float) 3.2,
                "yellow", "KZ_963_16", Condition.Buryn_ustalyngan, 320);
        SportCar sport2 = new SportCar(03030445234L, "Kazybekov Yesbolat", 18, 1, "Bugatti", 2020, (float) 6.5, "grey",
                "KZ_016_16", Condition.Jana, 340);
        SportCar sport3 = new SportCar(3113535457L, "Popov Alexsandr ", 74, 56, "Volga", 2001, (float) 2.4, "white",
                "KZ_436_02", Condition.Jana, 160);
        SportCar sport4 = new SportCar(65442356457L, "Igor Vasilievich", 58, 23, "Priora", 2013, (float) 1.6,
                "yellow", "KZ_321_01", Condition.Buryn_ustalyngan, 200);
        SportCar sport5 = new SportCar(23543356457L, "Kianbekova Adina", 20, 2, "BMW", 2002, (float) 3.0, "black",
                "KZ_565_05", Condition.Jana, 240);
        try {
            cars.addToEngine(lorry1);
            cars.addToEngine(lorry2);
            cars.addToEngine(lorry3);
            cars.addToEngine(lorry4);
            cars.addToEngine(lorry5);
            cars.addToEngine(sport1);
            cars.addToEngine(sport2);
            cars.addToEngine(sport3);
            cars.addToEngine(sport4);
            cars.addToEngine(sport5);
        } catch (CarException e) {
            new CarException("Error");
        }

        return cars;
    }
}
