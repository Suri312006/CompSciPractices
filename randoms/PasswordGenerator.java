package randoms;

import java.util.Random;

public  class PasswordGenerator{
    private String prefix;
    public static int randCount;
    private int passGen;
    public PasswordGenerator(int randCount, String prefix){
        this.randCount = randCount;
        this.prefix = prefix;
    }
    public PasswordGenerator(int randCount){
        this.randCount = randCount;
        this.prefix = "A";
    }

    public int pwCount(){ return passGen; }

    public String pwGen(){
        Random rand = new Random();
        int tempCount = randCount;
        int bigNum = 1;
        String password;

        for(int i = 0; i<tempCount; i++){
            bigNum*=10;
        }
        bigNum-=1;

        int number = rand.nextInt(bigNum);

        password = prefix+"."+number;
        passGen++;
        return password;

    }
}