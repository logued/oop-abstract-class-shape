package dkit.oop;   // Oct 2024
//
// Demonstrates:
// Shape class - an "abstract" class defined as a superclass for all shapes
// Circle class is subclass of Shape - it is a Concrete class so we can make objects from it.
// Rectangle class - contains exercises for you to complete. (TODOs)

import java.util.ArrayList;

/**
 * Abstract class Shape demonstration
 * oop-abstract-class-shape
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Abstract Class Shape" );
        App app = new App();
        app.start();
    }

    public void start() {

        // We cannot create an object of an Abstract class type.
        // (ie we cannot instantiate an Abstract class)
        //  Shape s1 = new Shape(2,3); // uncomment and note the compiler error message.
        //
        // This is sensible, because an abstract class is supposed to represent an abstraction
        // of a class of objects that stores only things common to all objects,
        // but not the full structure of any actual object types.


        // A class that we can instantiate is called a "concrete" class, as we can
        // make an object of that class type. e.g. Circle.
        Circle c1 = new Circle(1,2,5);
        System.out.println(c1.toString());

        // The following code calls getX() and getY() on a Circle type object c1
        // These methods exist for c1, because they have been inherited by Circle
        // from the Shape class.
        System.out.println("Circle c1: x=" + c1.getX() + ", y="+c1.getY());

        // Study the Circle class to see how ith inherits from Shape
        // before attempting the TODOs below

        // We can declare an ArrayList whose elements are of type Shape.
        // Circle objects can be added to this ArrayList because Circles are of type Shape
        // because of inheritance.
        //
        ArrayList<Shape> shapesList = new ArrayList<>();
        shapesList.add( new Circle(2,3,10));
        shapesList.add( new Circle(3,4,12));

        //TODO
        // implement the Rectangle class (see skeleton Rectangle class).
        // instantiate a Rectangle object r1, and output its details.



        //TODO
        // Add two new Rectangle objects to the ArrayList.
        // The ArrayList will now store two Circle and two Rectangle objects - both of type shape.



        // Write a displayShapes() method that accepts the list and displays all elements.
        //displayShapes( shapesList );

        // Using a for loop, sum the area of all the shapes and output that sum.
//        double totalArea = sumOfAreas( shapesList );
//        System.out.println("Sum of shape areas :" + totalArea);

        //TODO
        // The senior architect informs you that all shapes MUST have a method
        // called perimeter() that returns the perimeter of the shape.
        // Make the appropriate changes to the Shape, Circle and Rectangle classes.


    }

    //TODO implement the methods below
//    public double sumOfAreas( ArrayList<Shape> list) {
//
//    }
//
//    public void displayShapes( ArrayList<Shape> list) {
//
//    }


}
