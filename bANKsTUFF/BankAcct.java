package bANKsTUFF;

public class BankAcct {
    private double balance;
    private String name;
    private int myIDNmber;
    private static int IDNumber = 0;

    public BankAcct(String name, double Balance){
        this.name = name;
        this.balance = balance;
        this.myIDNmber = IDNumber++;

    }
    public void deposit(double amount){
        if(amount > 0) {
            balance += amount;
        }
    }
    public void withdraw(double amount){
        if(amount<balance) {
            balance -= amount;
        }
    }
    public void transferTo(BankAcct other, double amount) {
        if (amount < this.balance) {
            this.withdraw(amount);
            other.deposit(amount);
        }
        else{
            System.out.print("not enough money in origin account");
        }
    }
    public double getBalance(){
        return balance;
    }
    public String getName(){
        return name;
    }
    public int getMyIDNmber(){
        return myIDNmber;
    }
}
