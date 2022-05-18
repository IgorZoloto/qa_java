import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class FelineTest {

    Feline feline = new Feline();

    @Test
    public void eatMeatShouldReturnPredatorString() throws Exception {
        List<String> actual = feline.eatMeat();
        List<String> expected = new ArrayList<>(Arrays.asList("Животные", "Птицы", "Рыба"));
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getFamilyShouldReturnPositive() {
        String expected = "Кошачьи";
        String actual = feline.getFamily();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getKittensShouldReturnOne() {
        int actual = feline.getKittens();
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }
}
