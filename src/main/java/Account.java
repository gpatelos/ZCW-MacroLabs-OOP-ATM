
public abstract class Account {

    private int acctnumber;
    private double balance;
    private static int nextAvailableAcctNumber = 1;


    public Account(){
        this.acctnumber = nextAvailableAcctNumber;
        this.balance = 0;
        nextAvailableAcctNumber++;
    }

    public Account(double initial_deposit){
        this();
        this.balance = initial_deposit;
    }

    public void setAcctNumber(int acctnumber) {
        this.acctnumber = acctnumber;
    }


    public int getAcctNumber() {
        return acctnumber;
    }


    public void setBalance(double balance) {
        this.balance = balance;
    }


    public double getBalance() {
        return balance;
    }

    public String deposit(double deposit) {

        balance += deposit;

        return "Your new balance is $" + String.format("%,.2f", balance);

    }

    public String withdrawl(double withdrawl){

        balance -= withdrawl;

        return "Your new balance is $" + String.format("%,.2f", balance);

    }





}



