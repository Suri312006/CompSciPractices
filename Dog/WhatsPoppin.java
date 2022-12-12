package Dog;

import java.util.Scanner;

public class WhatsPoppin {
    public static void main(String[] penis){

        //here fido is an instance of the dog class
        Dog fido = new Dog("fido", "brown", 50, false);
        Dog dumbass = new Dog("dumbass", "blue", 100, false);
        Dog clifford = new Dog("Clifford", "red", 10000000, true);

        Dog.freeEm();
        Scanner input = new Scanner(System.in);


        Dog[] Dogs = {fido, dumbass, clifford};
        for(Dog dog : Dogs){
            System.out.println(dog);
        }

        //fido is an implicit parameter for the bite method inside dog
        fido.bite(dumbass, 70);
        clifford.bite(fido, clifford.getWeight());

        System.out.print(dumbass);




    }

    public static void createDog(){

    }
}
