package mashina.creator;

public abstract class Car {
    private long IIN;
    private String famnam;
    private int year;
    private int experience;
    private String marka;
    private int yearOfTheCar;
    private float volume;
    private String color;
    private String number;
    private Condition condition;

    public Car(long iIN, String famnam, int year, int experience, String marka, int yearOfTheCar, float volume,
               String color, String number, Condition condition) {
        IIN = iIN;
        this.famnam = famnam;
        this.year = year;
        this.experience = experience;
        this.marka = marka;
        this.yearOfTheCar = yearOfTheCar;
        this.volume = volume;
        this.color = color;
        this.number = number;
        this.condition = condition;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public long getIIN() {
        return IIN;
    }

    public void setIIN(long iIN) {
        IIN = iIN;
    }

    public String getFamnam() {
        return famnam;
    }

    public void setFamnam(String famnam) {
        this.famnam = famnam;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getYearOfTheCar() {
        return yearOfTheCar;
    }

    public void setYearOfTheCar(int yearOfTheCar) {
        this.yearOfTheCar = yearOfTheCar;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "FIO=" + famnam + " , IIN=" + IIN + " , zhasy=" + year + " , tajyribesy : " + experience
                + ",  Car marka=" + marka + " , mashina jyly : " + yearOfTheCar + " , obemy : " + volume + " , tusy : "
                + color + " , number:" + number + " , zhagdaiy : " + condition;
    }



}