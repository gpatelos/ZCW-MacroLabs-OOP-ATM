import org.junit.Assert;
import org.junit.Test;

public class CustomerTest {

    @Test
    public void CustomerTest(){
        //given
        Customer acustomer = new Customer()
        String expected = "UNASSIGNED";

        //when
        String actual = acustomer.getUsername();
        Assert.assertEquals("test default username assignment", expected, actual);


    }
}
