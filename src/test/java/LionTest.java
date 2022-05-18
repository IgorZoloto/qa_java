import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class LionTest {

    private Lion lion;

    Feline feline = new Feline();

    @Test
    public void getKittensKittensShouldReturnOne() throws Exception {
        Lion lion = new Lion("Самец", feline);
        int actual = lion.getKittens();
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void doesHaveManeMaleReturnTrue() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Boolean actual = lion.doesHaveMane();
        Assert.assertEquals(true, actual);
    }

    @Test
    public void doesHaveManFemaleReturnFalse() throws Exception {
        Lion lion = new Lion("Самка", feline);
        Boolean actual = lion.doesHaveMane();
        Assert.assertEquals(false, actual);
    }

    @Test(expected = Exception.class)
    public void doesHaveManOtherReturnException() throws Exception {
        Lion lion = new Lion("Другое", feline);
        boolean actual = lion.doesHaveMane();
        Assert.assertEquals("Используйте допустимые значения пола животного - самец или самка", actual);
    }


    @Test
    public void checkGetFoodReturnPredatorFood() throws Exception {
        Lion lion = new Lion("Самец", feline);
        List<String> actual = lion.getFood();
        List<String> expected = new ArrayList<>(Arrays.asList("Животные", "Птицы", "Рыба"));
        Assert.assertEquals(expected, actual);
    }
}