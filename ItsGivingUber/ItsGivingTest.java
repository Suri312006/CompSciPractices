package ItsGivingUber;

public class ItsGivingTest {

    public static void main (String[] bozo){
        UberCar car1 = new UberCar(20, 20, 10);
        UberCar car2 = new UberCar(10,10,0,100);

        car2.drivePassenger("Billy", 400);
        car2.drivePassenger("Bill", 40);
        System.out.println(car2);
        car2.drivePassenger("Sally", 40);
        car2.drivePassenger("a", 0);
        car2.drivePassenger("b", 0);
        car2.drivePassenger("c", 0);
        System.out.println(car2);
        car1.addGas(5);
        car1.drivePassenger("Tom", 60);
        System.out.println(car1);
        car2.removePassenger("Sally");




    }
}
