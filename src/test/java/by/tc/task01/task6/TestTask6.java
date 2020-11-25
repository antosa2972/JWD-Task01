package by.tc.task01.task6;
import org.junit.Assert;
import org.junit.Test;
public class TestTask6 {
    @Test
    public void getTimeTest1(){
        String actual=Task6.getTime(0);
        String expected="0:0:0";
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void getTimeTest2(){
        String actual=Task6.getTime(54323);
        String expected="12:3:4";
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void getTimeTest3(){
        String actual=Task6.getTime(-200);
        String expected="";
        Assert.assertEquals(expected,actual);
    }
}
