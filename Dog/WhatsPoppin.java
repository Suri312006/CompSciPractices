package Dog;

import java.util.*;

public class WhatsPoppin {
    public static void main(String[] penis){
        Dog fido = new Dog("fido", "brown", 50, false);
        Dog dumbass = new Dog("dumbass", "blue", 100, false);
        Dog clifford = new Dog("Clifford", "red", 10000000, true);
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

        clifford.bite(fido, clifford.getWeight());
        System.out.print(dumbass);




    }

    public static void createDog(){

    }
}
