import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class AccountWarehouseTest {

//    @Test
//    public static void getNumberofAccountsTest(){
//        return AccountWarehouse.size();
//    }





    @Test
    public void findAccountByAcctNumber(){
        //given
        // ArrayList<Account> accounts = AccountWarehouse.getAccounts();
        Account expected = new Savings();
        AccountWarehouse.addAccount(expected);

        //when
        Account actual = AccountWarehouse.findAccountByAcctNumber(expected.getAcctNumber());

        //then
        Assert.assertEquals(expected,actual);

    }


    @Test
    public void addAccountTest(){
        //given
        Account expected  = new Savings();

        //when
        AccountWarehouse.addAccount(expected);

        //then
        Account actual = AccountWarehouse.findAccountByAcctNumber(expected.getAcctNumber());


        Assert.assertEquals(expected, actual);

    }

    @Test
    public void removeAccountTest(){
        //given
        Account acctnumber1 = new Savings();
        Account acctnumber2 = new Savings();
        Account acctnumber3 = new Checking();
        AccountWarehouse.addAccount(acctnumber1);
        AccountWarehouse.addAccount(acctnumber2);
        AccountWarehouse.addAccount(acctnumber3);
        String = "Account# 3 removed";


        //when
        AccountWarehouse.removeAccount(3);

        //then


    }

}
