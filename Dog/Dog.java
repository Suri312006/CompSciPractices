package Dog;

public class Dog {
    String name;
    String color;
    int weight;
    boolean fed;

    public Dog(String name, String color, int weight, boolean fed){
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.fed = fed;
    }

    public void feed(int amount){
        if(!fed){
            fed = true;
            weight += amount;
        }
    }

    public String isfed(){
      if(fed){
        return "true";
      }
      return "false";
    }
}
