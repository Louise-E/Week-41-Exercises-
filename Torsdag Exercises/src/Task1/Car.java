package Task1;

public class Car {
    //1.c
    private String brand;
    private String model;
    private int year;
    private String bodyStyle;
    private Driver driver;

    public Car(String brand, String model, int year, String bodyStyle, Driver driver) {
        //1.d
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.bodyStyle = bodyStyle;
        this.driver = driver;
    }

    //1.e
    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver)
    {
        this.driver = driver;
    }
    //1.f
    @Override
    public String toString() {
        return brand + " " + model;
    }

}
