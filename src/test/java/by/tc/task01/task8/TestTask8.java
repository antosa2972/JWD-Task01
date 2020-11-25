package by.tc.task01.task8;
import org.junit.Assert;
import org.junit.Test;
public class TestTask8 {
    @Test
    public void getValueOfFooTest1(){
        double actual= Task8.getValueOfFoo(1);
        double expected=-0.2;
        Assert.assertEquals(expected,actual,0.0);
    }
    @Test
    public void getValueOfFooTest2(){
        double actual= Task8.getValueOfFoo(6);
        double expected=-9;
        Assert.assertEquals(expected,actual,0.0);
    }
}
