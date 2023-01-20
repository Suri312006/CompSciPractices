package Stuffsthings;
//import java.util.*;

class Main {
    public static void main(String[] args) {

        Student bill = new Student("bill");
        //bill.printOut();
        bill.calcGPA();
        bill.updateGrade(3,"A");
        bill.updateGrade(2,"C");
        bill.updateGrade(1,"B");

        //bill.printOut();
        bill.calcGPA();
    }
}
/*
IntroToRizz 1 C no yes
AP_MeatRiding 2 A yes yes
IntroToCrypto 3 D no yes
AP_DropShipping 4 F yes yes
LeClass_James 5 A yes yes
StrokeSkills101 6 F no yes
FemboyStudies2 7 A no no

+
 */