package Task1;

public class Main {
    public static void main(String [] args) {
        Driver d1 = new Driver("Louise", 19);
        Car car = new Car("opel", "corsa", 2006, "sleek", d1);
        //1.l
        Car car2 = new Car("opel", "astra", 2006, "sleek", d1);
        car.setDriver(d1);
        System.out.println(car.toString()+ " " + car.getDriver());
        //1.m
        System.out.println(car2.toString()+ " " + car2.getDriver());


    }

}
