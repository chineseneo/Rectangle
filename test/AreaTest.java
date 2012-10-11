import junit.framework.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: vagrant
 * Date: 10/11/12
 * Time: 5:19 AM
 * To change this template use File | Settings | File Templates.
 */
public class AreaTest {
    @Test
    public void shouldCalculateAreaForGivenRectangle()
    {
        Area area = new Area(new Rectangle(4, 5));
        Assert.assertEquals(20.0, area.getArea());
    }
}
