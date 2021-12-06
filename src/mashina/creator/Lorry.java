package mashina.creator;

public class Lorry extends Car {
    private int maxWeight;

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxweight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public Lorry(long iIN, String famnam, int year, int experience, String marka, int yearOfTheCar, float volume,
                 String color, String number, Condition condition, int maxWeight) {
        super(iIN, famnam, year, experience, marka, yearOfTheCar, volume, color, number, condition);
        this.maxWeight = maxWeight;
    }

    @Override
    public String toString() {
        return "Lorry : " + super.toString() + " maxWeight=" + maxWeight;
    }

}
