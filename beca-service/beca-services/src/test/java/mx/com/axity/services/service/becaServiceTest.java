package mx.com.axity.services.service;

import mx.com.axity.commons.to.UserTO;
import mx.com.axity.services.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class becaServiceTest extends BaseTest {


    @Test
    public void shouldReturnTheSumOfTwoNumbers(){
        int sum1 = 5;
        int sum2 = 10;
        int result= becaService.sum(sum1,sum2);

        Assert.assertEquals(15,result);
    }
    @Test
    public void shouldReturnTheSubOfTwoNumbers(){
        int sub1= 15;
        int sub2= 5;
        int result= becaService.sub(sub1,sub2);

        Assert.assertEquals(10,result);
    }
}
