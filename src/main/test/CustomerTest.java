import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class CustomerTest {

    @Test
    public void CustomerTest(){
        //given
        Customer acustomer = new Customer();
        String expected = "UNASSIGNED";

        //when
        String actual = acustomer.getUsername();

        //then
        Assert.assertEquals("test default username assignment", expected, actual);

    }

//    @Test
//    public void getAccountList(){
//        //given
//        Customer customer = new Customer();
//        String expected = "Some weird string of objects or hashes";
//
//        //when
//        Objec = customer.getAccountList();
//
//        //then
//        Assert.assertEquals(expected, actual);
//    }


//    @Test
//    public void getOneAccount(){
//        //given
//        Customer customer = new Customer();
//        String expected = "Account 0";
//
//        //when
//        String expected = customer.ArrayList.get(0)
//    }
//
//    @Test
//    public void addOneAccount(){
//       //given
//       Customer customer = new Customer();
//       String expected = "Your new checking account 'gpatselas2' is now available.";
//
//       //when
//       String actual =  customer.addOneAccount();
//
//
//       //then
//        Assert.assertEquals(expected,actual);
//
//    }

    //moved deposit to account class

//    @Test
//    public void depositTest(){
//
//        //given
//        Customer acustomer = new Customer();
//        String expected = "You're new balance is 5000.";
//
//        //when
//        String actual = acustomer.deposit(5000);
//
//        //then
//        Assert.assertEquals(expected,actual);
//
//
//        }




    }


