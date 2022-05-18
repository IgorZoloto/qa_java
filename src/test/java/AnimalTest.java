import com.example.Animal;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnimalTest {

    Animal animal = new Animal();

    @Test
    public void getFoodShouldReturnGreenEater() throws Exception {
        List<String> actual = animal.getFood("Травоядное");
        List<String> expected = new ArrayList<>(Arrays.asList("Трава", "Различные растения"));
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getFoodShouldReturnMeatEater() throws Exception {
        List<String> actual = animal.getFood("Хищник");
        List<String> expected = new ArrayList<>(Arrays.asList("Животные", "Птицы", "Рыба"));
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = Exception.class)
    public void getFoodShouldReturnOtherEater() throws Exception {
        List<String> actual = animal.getFood("Рептилия");
        List<String> expected = new ArrayList<>(Arrays.asList("Неизвестный вид животного, используйте значение Травоядное или Хищник"));
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getFamilyShouldReturnPositive() {
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        String actual = animal.getFamily();
        Assert.assertEquals(expected, actual);
    }
}