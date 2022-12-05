package Dog;

public class Dog {
    //first you set up all the fields you want
    private String name;
    private String color;
    private int weight;
    private boolean fed;

   private  boolean alive = true;

    //constructor (should loook exactly like this)
    public Dog(String name, String color, int weight, boolean fed){
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.fed = fed;
    }
    // constructor for stray
    public Dog(String color, int weight) {
        this.name = "Stray";
        this.color = color;
        this.weight = weight;
        this.fed = false;
    }
    public String getName(){
        return name;
    }
    public String getColor(){
        return color;
    }
    public int getWeight(){
        return weight;
    }
    public boolean getFed(){
        return fed;
    }

    public boolean isAlive(){
        return alive;
    }


    public void feed(int amount){
        if(!fed){
            fed = true;
            weight += amount;
        }
    }

    public void run(int distance){
        double temp = weight - distance/100;
        if(temp < 1){
            alive = false;
            weight = 0;
        }
        else{
            weight = (int) temp;
        }
        fed = false;
    }

    public String isFed(){
      if(!alive){
          return "That boy " + name +" is fucking dead";
      }
      else if(fed){
        return "Yes, " + name+ " is fed. They now weigh "+weight;
      }
      return "That boy "+name+" is starvin";
    }

    public void bite(Dog bitten, int chunk){
        int temp = bitten.weight - chunk;
        if(temp < bitten.weight / 2){
            bitten.alive = false;
        }
        bitten.weight -= chunk;

        this.weight += chunk;
        this.fed = true;

        if(!bitten.alive){
            System.out.println(name+" fucking killed "+bitten.name);
        }

    }
    
    public String toString(){
        return "Name: "+name + ", Color: "+color +", Weight: "+weight+", Fed? "+fed+", Alive? "+alive;


    }



}
