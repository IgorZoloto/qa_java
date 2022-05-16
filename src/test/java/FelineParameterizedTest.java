import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class FelineParameterizedTest {

    Feline feline = new Feline();

    private int firstNumber;
    private int secondNumber;


    public FelineParameterizedTest(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;

    }

    @Parameterized.Parameters
    public static Object[][] kittens() {
        return new Object[][]{
                {1, 1},
                {0, 0},
                {3, 3},
                {7, 7},
        };
    }

    @Test
    public void getKittensShouldReturnManyPositive() {
        int actual = feline.getKittens(firstNumber);
        int expected = secondNumber;
        Assert.assertEquals(expected, actual);
    }

}
