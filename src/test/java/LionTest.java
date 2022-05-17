import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class LionTest {


    @Test
    public void getKittensShouldReturnNumber() throws Exception {
        Lion lion = new Lion("Самец");
        int actual = lion.getKittens(3);
        int expected = 3;
        System.out.println(actual);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getKittensKittensShouldReturnOne() throws Exception {
        Lion lion = new Lion("Самец");
        int actual = lion.getKittens();
        int expected = 1;
        System.out.println(actual);
        Assert.assertEquals(expected, actual);


    }

    @Test
    public void doesHaveManeMaleReturnTrue() throws Exception {
        Lion lion = new Lion("Самец");
        Boolean actual = lion.doesHaveMane();
        System.out.println(actual);
        Assert.assertEquals(true, actual);

    }

    @Test
    public void doesHaveManFemaleReturnFalse() throws Exception {
        Lion lion = new Lion("Самка");
        Boolean actual = lion.doesHaveMane();
        System.out.println(actual);
        Assert.assertEquals(false, actual);
    }

    @Test(expected = Exception.class)
    public void doesHaveManOtherReturnException() throws Exception {
        Lion lion = new Lion("Другое");
        boolean actual = lion.doesHaveMane();
        Assert.assertEquals("Используйте допустимые значения пола животного - самец или самка", actual);
    }


    @Test
    public void checkGetFoodReturnPredatorFood() throws Exception {
        Lion lion = new Lion("Самец");
        List<String> actual = lion.getFood();
        List<String> expected = new ArrayList<>(Arrays.asList("Животные", "Птицы", "Рыба"));
        Assert.assertEquals(expected, actual);

    }
}