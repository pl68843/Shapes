public class EquilateralTriangle extends Triangle{
    private double side;

    public EquilateralTriangle(String name, double side){
        super(name);
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 3);
    }

    @Override
    public void printDimensions() {
        System.out.println("Sides: " + side);
        System.out.println("Area: " + getArea());
    }
    
    
}
