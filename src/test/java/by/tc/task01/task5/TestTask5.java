package by.tc.task01.task5;
import org.junit.Assert;
import org.junit.Test;
public class TestTask5 {
    @Test
    public void isPerfectTest1(){
        boolean actual= Task5.isPerfect(8128);
        Assert.assertTrue(actual);
    }
    @Test
    public void isPerfectTest2(){
        boolean actual= Task5.isPerfect(8123);
        Assert.assertFalse(actual);
    }
    @Test
    public void isPerfectTest3(){
        boolean actual= Task5.isPerfect(29);
        Assert.assertFalse(actual);
    }
    @Test
    public void isPerfectTest4(){
        boolean actual= Task5.isPerfect(0);
        Assert.assertFalse(actual);
    }
}
