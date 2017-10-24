import com.sun.tools.javac.comp.Check;

public class Checking extends Account {

    private int acctnumber;
    private double balance;
    //make a static nextAcctNumber to track


    public Checking(){
        this.acctnumber = 0;
        this.balance = 0;
    }

//    public Checking(int acctnumber){
//        this.acctnumber = acctnumber;
//        this.balance = 0;
//    }

    public Checking(double initial_deposit){
        this(Checking);
        this
    }

    public Checking(int acctnumber, double initial_deposit){
        this(Checking);
        this.balance = initial_deposit;
    }

    @Override
    public void setAcctnumber() {
        this.acctnumber = acctnumber;
    }

    @Override
    public int getAcctnumber() {
        return acctnumber;
    }

    @Override
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
