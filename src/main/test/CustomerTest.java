import org.junit.Assert;
import org.junit.Test;

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

    //moved deposit to account

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


