package by.tc.task01.task10;
import org.junit.Assert;
import org.junit.Test;
import java.util.HashMap;

public class Task10Test {
    @Test
    public void countFooTest(){
        HashMap<Integer, Double> actual = Task10.countFunctions(2, 12, 4);
        HashMap<Integer, Double> expected = new HashMap<Integer, Double>();
        expected.put(2,Math.tan(2));
        expected.put(6,Math.tan(6));
        expected.put(10,Math.tan(10));
        Assert.assertEquals(expected,actual);
    }
}
