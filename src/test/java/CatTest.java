import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class CatTest {


    @Mock
    Feline feline;

    Cat cat; //= new Cat(feline);

    @Before
    public void setUp() throws Exception {
      cat = new Cat(feline);
    }

    @Test
    public void checkSoundOfCatPositive() {
    String actual = cat.getSound();
    String expected = "Мяу";
    Assert.assertEquals(expected, actual);
    }

//    @Test
//    public void checkSoundOfCatNegative() {
//        String actual = cat.getSound();
//        String expected = "Гав";
//        Assert.assertEquals(expected, actual);
//
//    }


//    @Test ???
//    public void getFoodReturnString() throws Exception {
//        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
//        List<String> expected = new ArrayList<>(Arrays.asList("Животные", "Птицы", "Рыба"));
//        Assert.assertEquals(expected, cat.getFood());
//
//    }
}