public class Rectangle {
    double length;
    double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double perimeter()
    {
        return (length + breadth) * 2;
    }

    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }
}