import org.junit.Assert;
import org.junit.Test;

public class CatTest {

    @Test
    public void newCatTest() {
        Cat cat = new Cat();
       Assert.assertEquals("gav", cat.getSound("gav"));
    }
    @Test
    public void newDogTest() {
        Dog dog = new Dog();
        Assert.assertEquals("gav", dog.getSound("gav"));
    }

}
