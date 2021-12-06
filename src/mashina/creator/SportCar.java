package mashina.creator;

public class SportCar extends Car {
    private int maxSpeed;

    public SportCar(long iIN, String famnam, int year, int experience, String marka, int yearOfTheCar, float volume,
                    String color, String number, Condition condition, int maxSpeed) {
        super(iIN, famnam, year, experience, marka, yearOfTheCar, volume, color, number, condition);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "SportCar : " + super.toString() + "maxSpeed=" + maxSpeed;
    }

}