package bANKsTUFF;

public class Test {

    public static void main(String[] args){
        CheckingAcct brian = new CheckingAcct("brain", 100, 0);
        CheckingAcct Surendra = new CheckingAcct("surendra", 1000, 0);

        Surendra.transferTo(brian, 50);
        System.out.print(Surendra.getBalance());
    }



}