package Car;

public class Car {
    private double mpg; //miles per gallon

    private double fuelLevel; //amount of gallons in tank

    private double odom; //miles traveled

    private int licensePlate; //random 5 digit number

    private String make; //brand

    private double tankCapacity; //in gallons

/*
need two constructors:
    one to represent new cars where odom = 0; fuel level = 0.5*tankCapacity
    One to represent used cars where you set all parameters
 */
public Car(String make, double mpg, double tankCapacity) {

    this.make = make;
    this.mpg = mpg;
    this.fuelLevel = tankCapacity * 0.5;
    this.odom = 0;
    this.tankCapacity = tankCapacity;
}

public Car(String make, double mpg, double fuelLevel, double odom, double tankCapacity) {
        this.make = make;
        this.mpg = mpg;
        this.fuelLevel = fuelLevel;
        this.odom = odom;
        this.tankCapacity = tankCapacity;

}
//methods

    public void drive(double distance) {
        //think about class invaritants and how it affects other fields
        //miles per gallon
    }

    public void refuel(double amount) {
        //should not fuel more than what is allowed by tankCapacity
        if(amount > 0) {
            if (fuelLevel + amount <= tankCapacity) {
                fuelLevel += amount;
            } else {
                fuelLevel = tankCapacity;
                System.out.println("Watch out slime, we gettin too gassy!");
            }
        }
    }

    public void refuelFriend(Car friend, double amount, double distance) {
        //can only give a maximum of 5 gallons
        //must be able to travel to friend and end with enough fuel to satisfy requirement

    }

    public String toString() {

        return null;
    }

}


