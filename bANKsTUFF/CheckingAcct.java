package bANKsTUFF;

public class CheckingAcct extends BankAcct{

    private int checkNo;
    private  double fee= 0.5;
    public CheckingAcct(String name, double Balance, int checkNo) {
        super(name, Balance);
        this.checkNo = checkNo;
    }
    public void writeCheck(double amount){
        super.withdraw(amount+fee);
        checkNo++;
    }
    public void printStatement(){
        System.out.print("Name: "+ super.getName()+" ID Number: "+ super.getMyIDNmber()+" Balance: "+ super.getBalance());
    }
}
