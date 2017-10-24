import org.junit.Assert;
import org.junit.Test;

public class CheckingTest {

       @Test
       public void setGetAcctnumberTest(){

        //given
        Checking checking = new Checking();
        int expected = 11;

        //when
        checking.setAcctNumber(11);
        int actual = checking.getAcctNumber();

        //then
        Assert.assertEquals("Set get test", expected, actual);
    }

    @Test
    public void setGetBalanceTest(){

        //given
        Checking checking = new Checking();
        double expected = 50000;

        //when
        checking.setBalance(50000);
        double actual = checking.getBalance();

        //then
        Assert.assertTrue("Set get balance test", expected == actual);
    }

}
