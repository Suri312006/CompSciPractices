package randoms;

import ItsGivingUber.UberCar;

import java.util.ArrayList;

public class what_the_cock {
    ArrayList<UberCar> b = new ArrayList<>();
    static int[] itemsSold = {48,50,37,62,38,70,55,37,64,60};

    public static double computeBonusThreshold(){
    int max = itemsSold[0];
    int min = itemsSold[0];
    int total = itemsSold[0];
    for(int i = 1; i < itemsSold.length;i++){
        if(itemsSold[i] < min) min = itemsSold[i];
        if(itemsSold[i] > max) max = itemsSold[i];
        total+=itemsSold[i];
    }
    total = total - max - min;
    double bonusThreshold = total/(itemsSold.length-2);
    return bonusThreshold;
    }

    public static void main(String[] args){
        System.out.print(computeBonusThreshold());
    }




}
