import java.util.ArrayList;

public class Customer {

    private String username;
    private String password;
    private ArrayList<Account> AccountList;

    public Customer(){
        this.username = "UNASSIGNED";
        this.password = "PASSWORD";
        this.AccountList = null;
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

    public void setAccountList(Account anAccount) {
        this.AccountList.add(anAccount);
    }

//    public ArrayList[] getAccountList() {
//        return AccountList;
//    }




}
