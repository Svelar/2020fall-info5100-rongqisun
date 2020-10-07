package Assignments.Assignment4.CircleAndCylinder;

public class TestCylinder {
    public static void main(String[] args) {

        //Constructed a Circle with Circle()
        //Run of the program should produce the following output:
        //Radius is 2.0, Color is yellow, Base area is (your answer)

        //Constructed a Cylinder with Cylinder()
        //Run of the program should produce the following output:
        //Radius is 1.0, Height is 1.0, Color is red, Base area is (your answer), Volume is (your answer)

        //Constructed a Cylinder with Cylinder(height, radius)
        //Run of the program should produce the following output:
        //Radius is 2.0, Height is 5.0, Color is red, Base area is (your answer), Volume is (your answer)
        Circle circle = new Circle();
        circle.setRadius(2.0);
        circle.setColor("yellow");
        System.out.println("Radius is "+circle.getRadius()+", Color is "+circle.getColor()+", Base area is "+circle.getArea()+".");

        Cylinder cylinder = new Cylinder();
        System.out.println("Radius is "+cylinder.getRadius()+", Height is "+cylinder.getHeight()+", Color is "+cylinder.getColor()+", Base area is "+cylinder.getBaseArea()+", Volume is "+cylinder.getVolume()+".");

        Cylinder cylinderA = new Cylinder(5.0,2.0);
        System.out.println("Radius is "+cylinderA.getRadius()+", Height is "+cylinderA.getHeight()+", Color is "+cylinderA.getColor()+", Base area is "+cylinderA.getBaseArea()+", Volume is "+cylinderA.getVolume()+".");

/*        Output:
        Radius is 2.0, Color is yellow, Base area is 12.566370614359172.
        Radius is 1.0, Height is 1.0, Color is red, Base area is 3.141592653589793, Volume is 3.141592653589793.
        Radius is 2.0, Height is 5.0, Color is red, Base area is 12.566370614359172, Volume is 62.83185307179586.*/
    }
}
