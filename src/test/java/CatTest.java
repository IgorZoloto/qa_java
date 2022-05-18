import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import java.util.Collections;
import java.util.List;

public class CatTest {

    private Cat cat;

    @Mock
    private Feline feline;

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

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

    @Test
    public void getFoodReturnString() throws Exception {
        List<String> expected = Collections.emptyList();
        Mockito.when(feline.eatMeat()).thenReturn(expected);
        List<String> actual = cat.getFood();
        Assert.assertEquals(expected, actual);
    }
}