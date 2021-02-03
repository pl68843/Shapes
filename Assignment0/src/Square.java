public class Square extends Shape{
    private double length;
    private double height;

    public Square(String name, double length, double height){
        super(name);
        this.length = length;
        this.height = height;
    }

    @Override
    public double getArea() {
        return length * height;
    }

    @Override
    public void printDimensions() {
        System.out.println("Length: " + length + " | height: " + height);
        System.out.println("Area: " + getArea());
    }
}
