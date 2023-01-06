package ItsGivingUber;

import java.util.ArrayList;

public class UberCar {
    public  final double PRICEPERGALLON = 5; // price per gallon

    private final double CHARGEPERMILE = 4; //charge per mine

    private double milesDriven, tankCapacity, mpg, gasInTank, moneyEarned;

    ArrayList<String> bozos = new ArrayList<String>(); //array list of all passengers who've used the car

    // constructor
    public UberCar(double tankCap, double mpg, double gasInTank){
        this.tankCapacity = tankCap;
        this.mpg = mpg;
        this.gasInTank = gasInTank;
        milesDriven = 0;
        moneyEarned = 0;
    }

    public UberCar(double tankCap, double mpg, double gasInTank, double moneyEarned){
        this.tankCapacity = tankCap;
        this.mpg = mpg;
        this.gasInTank = gasInTank;
        milesDriven = 0;
        this.moneyEarned = moneyEarned;
    }

    //methods
    public void addGas(double gal){
        if(gal+gasInTank <= tankCapacity){
            if(gal * PRICEPERGALLON < moneyEarned){
                gasInTank+=gal;
                moneyEarned -= (gal*PRICEPERGALLON);
            }
            else{
                double newGal = moneyEarned/PRICEPERGALLON;
                gasInTank += newGal;
                moneyEarned = 0;
            }
        }
        else{
            double needToFill = tankCapacity - gasInTank;
            if(needToFill*PRICEPERGALLON < moneyEarned){
                gasInTank = tankCapacity;
            }
            else{
                double newGal = moneyEarned/PRICEPERGALLON;
                gasInTank += newGal;
                moneyEarned = 0;
            }
        }
    }

    public void addGas() {
        double needToFill = tankCapacity - gasInTank;
        if (needToFill * PRICEPERGALLON < moneyEarned) {
            gasInTank = tankCapacity;
        } else {
            double newGal = moneyEarned / PRICEPERGALLON;
            gasInTank += newGal;
            moneyEarned = 0;
        }
    }
    public void drivePassenger(String bozo, double dist){

            if(dist > tankCapacity*mpg){
                System.out.println("Sorry, too far");
            }
            else if(gasInTank<2 && dist>gasInTank*mpg){
                gasInTank+=2;
                moneyEarned-=15;
                if(dist > gasInTank*mpg){
                    double reqGal = dist/mpg;
                    addGas(reqGal);
                }
                //DRIVING
                bozos.add(bozo);
                milesDriven+=dist;
                gasInTank-=(dist/mpg);
                moneyEarned+= CHARGEPERMILE * dist;
            }
            else if(dist>gasInTank*mpg){
                double reqGal = dist/mpg;
                addGas(reqGal);
                //driving
                bozos.add(bozo);
                milesDriven+=dist;
                gasInTank-=(dist/mpg);
                moneyEarned+= CHARGEPERMILE * dist;
            }
            else{
                //DRIVING
                bozos.add(bozo);
                milesDriven+=dist;
                gasInTank-=(dist/mpg);
                moneyEarned+= CHARGEPERMILE * dist;
            }
        }

    public void removePassenger(String name){
        bozos.remove(name);
    }

    public String toString(){
        return "Names" + bozos + ", Miles Driven: "+milesDriven + ", Gas in Tank: "+gasInTank +", Tank Capacity: "+tankCapacity+", Money Earned? "+moneyEarned;
    }
}
