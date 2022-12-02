package Dog;

import java.util.*;

public class WhatsPoppin {
    public static void main(String[] penis){
        Dog fido = new Dog("fido", "brown", 50, false);
        Dog dumbass = new Dog("dumbass", "red", 100, false);
        Scanner input = new Scanner(System.in);

        /*
        Dog[] Dogs = {fido, dumbass};
        for(Dog dog : Dogs){
            System.out.print("Do you want to feed "+dog.name+" ? (Enter y or n): ");
            String response = input.nextLine();
            if(response.equals("y")){
                System.out.print("How much do you want to feed "+dog.name+" ? ");
                int fedAmount = input.nextInt();
                dog.feed((fedAmount));
            }
        }
        */

        fido.bite(dumbass, 70);

        if(!dumbass.isAlive()){
            System.out.println("dumbass fucking died ");
        }

        System.out.print(dumbass);



    }
}
