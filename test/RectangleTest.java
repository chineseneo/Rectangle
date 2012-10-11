import junit.framework.Assert;
import org.junit.Test;

public class RectangleTest {

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
