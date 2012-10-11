import junit.framework.Assert;
import org.junit.Test;

public class RectangleTest {

    @Test
    public void shouldAreaBeTenIfLengthIsFiveAndBreadthIsTwo() {
        Rectangle rectangle = new Rectangle(5, 2);
        Assert.assertEquals((double) 10, rectangle.area());
    }

    @Test
    public void shouldAreaBeFifteenIfLengthIsFiveAndBreadthIsThree() {
        Rectangle rectangle = new Rectangle(5, 3);
        Assert.assertEquals(15.0, rectangle.area());
    }

    @Test
    public void shouldAreaBeFivePointFiveIfLengthIsFiveAndBreadthIsOnePointOne() {
        Rectangle rectangle = new Rectangle(5, 1.1);
        Assert.assertEquals(5.5, rectangle.area());
    }

    @Test
    public void shouldPerimeterBeTwentyIfLengthIsSevenAndBreadthIsThree() {
        Rectangle rectangle = new Rectangle(7, 3);
        Assert.assertEquals(20.0, rectangle.perimeter());
    }

    @Test
    public void shouldPerimeterBeTwentyTwoIfLengthIsSevenAndBreadthIsFour() {
        Rectangle rectangle = new Rectangle(7, 4);
        Assert.assertEquals(22.0, rectangle.perimeter());
    }


}
