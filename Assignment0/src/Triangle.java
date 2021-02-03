public class Triangle extends Shape{
    private double s1;
    private double s2;
    private double s3;

    public Triangle(String name){
        super(name);
    }

    public Triangle(String name, double s1, double s2, double s3){
        super(name); 
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    /** Uses Herons formula */
    @Override
    public double getArea() {
        double s = s1 + s2 + s3;
        return Math.pow((s * (s-s1) * (s-s2) * (s-s3)), .5);
    }

    @Override
    public void printDimensions() {
        System.out.println("Side 1: " + s1 + " | Side 2: " + s2 + " | Side 3: " + s3);
        System.out.println("Area: " + getArea());
    }

    @Override
    public String getName(){
        return super.getName();
    }
}
