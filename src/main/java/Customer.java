import java.util.ArrayList;

public class Customer {

    private String username;
    private String password;
    private ArrayList<Account> AccountList;
    private int numberOfAccounts;

    public Customer(){
        this.username = "UNASSIGNED";
        this.password = "PASSWORD";
        this.AccountList = new ArrayList<Account>();
        this.AccountList.add(new Checking());
        this.numberOfAccounts = 1;
    }


    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public String getAccountByIndex(int index){
        return AccountList.get(index).toString();
    }

    public int getNumberOfAccounts(){
        return numberOfAccounts;
    }

    public Account getAccountObjectByIndex(int index){
        return AccountList.get(index);
    }

    public void addOneAccount(){

        this.AccountList.add(new Checking());
        this.numberOfAccounts++;
        return;

    }


//    public String getAccountList() {
//        for (:
//             ) {
//
//        }
//    }

//    public ArrayList<Account> getAccount(int index){
//
//        return AccountList;
//
//    };
//

//
//    public void closeAllAccounts(){
//
//    }






//    public ArrayList[] getAccountList() {
//        return AccountList;
//    }




}
