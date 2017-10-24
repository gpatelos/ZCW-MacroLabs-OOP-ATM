import java.util.ArrayList;

public class Customer {

    private String username;
    private String password;
    private ArrayList<int> AccountList;

    public Customer(){
        this.username = "UNASSIGNED";
        this.password = "password";
        this.AccountList = {0};
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

    public void setAccountList(ArrayList[] accountList) {
        AccountList = accountList;
    }

    public ArrayList[] getAccountList() {
        return AccountList;
    }

    public String deposit(){
        return "";
    }



}
