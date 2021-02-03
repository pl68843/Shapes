import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        /**
        // Circle doing its thing
        Circle circ = new Circle("Phobius", 3.14);
        circ.printDimensions();
        System.out.println(circ.getName());
        System.out.println();

        // Square doing its thing
        Square square = new Square("Alexander", 51.4, 23.5);
        square.printDimensions();
        System.out.println(square.getName());
        System.out.println();

        // Triangle being pointy
        Triangle triangle = new Triangle("Cynthia", 2.0, 3.4, 4.98);
        triangle.printDimensions();
        System.out.println(triangle.getName());
        System.out.println();

        // McSpecial over here... Equilateral triangle called to service
        EquilateralTriangle equilateralTriangle = new EquilateralTriangle("Doge", 1.618);
        equilateralTriangle.printDimensions();
        System.out.println(equilateralTriangle.getName());
        System.out.println();

         */
        
        while (true){
            String name;
            Scanner usr = new Scanner(System.in);
            
            // SHAPE
            System.out.println("|-|-|Shape|-|-|");
            System.out.println("Enter name: ");
            name = usr.nextLine();
            Shape shape2 = new Shape(name);

            System.out.println();

            // CIRCLE
            System.out.println("|-|-|Circle|-|-|");
            System.out.println("Enter name: ");
            name = usr.nextLine();

            System.out.println("Enter radius: ");
            double rad = usr.nextDouble();
            usr.nextLine();
            Circle circle2 = new Circle(name, rad);

            System.out.println();

            // SQUARE
            System.out.println("|-|-|Square|-|-|");
            System.out.println("Enter name: ");
            name = usr.nextLine();

            System.out.println("Enter length: ");
            double len = usr.nextDouble();
            usr.nextLine();

            System.out.println("Enter width: ");
            double wid = usr.nextDouble();
            usr.nextLine();
            Square square2 = new Square(name, len, wid);

            System.out.println();

            // TRIANGLE
            System.out.println("|-|-|Triangle|-|-|");
            System.out.println("Enter name: ");
            name = usr.nextLine();

            System.out.println("Enter Side 1: ");
            double s1 = usr.nextDouble();
            usr.nextLine();

            System.out.println("Enter Side 2: ");
            double s2 = usr.nextDouble();
            usr.nextLine();

            System.out.println("Enter Side 3: ");
            double s3 = usr.nextDouble();
            usr.nextLine();
            Triangle triangle2 = new Triangle(name, s1, s2, s3);

            System.out.println();

            // EQT
            System.out.println("|-|-|Equilateral Triangle|-|-|");
            System.out.println("Enter name: ");
            name = usr.nextLine();

            System.out.println("Enter Side: ");
            double side = usr.nextDouble();
            usr.nextLine();
            EquilateralTriangle eqt2 = new EquilateralTriangle(name, side);

            System.out.println();

            System.out.println(shape2.getName());
            shape2.printDimensions();
            System.out.println();

            System.out.println(circle2.getName());
            circle2.printDimensions();
            System.out.println();

            System.out.println(square2.getName());
            square2.printDimensions();
            System.out.println();

            System.out.println(triangle2.getName());
            triangle2.printDimensions();
            System.out.println();

            System.out.println(eqt2.getName());
            eqt2.printDimensions();
            System.out.println();
            return;
        }
    }
}
