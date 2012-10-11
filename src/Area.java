/**
 * Created with IntelliJ IDEA.
 * User: vagrant
 * Date: 10/11/12
 * Time: 5:21 AM
 * To change this template use File | Settings | File Templates.
 */
public class Area {
    double length, breadth;
    public Area(Rectangle rectangle) {
        length = rectangle.getLength();
        breadth = rectangle.getBreadth();
    }

    public double getArea() {
        return length * breadth;  //To change body of created methods use File | Settings | File Templates.
    }
}
