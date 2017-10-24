import org.junit.Assert;
import org.junit.Test;

public class CheckingTest {

    @Test
    public void CheckingTest(){

        //check constructors


        //given
        Checking checking = new Checking(50000);
        Checking checking2 = new Checking();
        double expected = 50000;
        int expected_account = 1;
        int expected_2nd_account = 2;

        //when
        double actual = checking.getBalance();
        int actual_account = checking.getAcctNumber();
        int actual_2nd_account = checking2.getAcctNumber();

        //then
        Assert.assertTrue("check constructor", expected == actual);
        Assert.assertEquals("check account number", expected_account, actual_account);
        Assert.assertEquals("check account number", expected_2nd_account, actual_2nd_account);

    }



}