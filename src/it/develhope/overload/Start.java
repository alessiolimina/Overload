package it.develhope.overload;

public class Start {
public static void main(String[] args) {

System.out.println("---------Shapes Testing-------------");

Shape undefinedShape = new Shape();
undefinedShape.getShapeDetails();

System.out.println("------------------------------------");

Shape circle = new Shape(5.66);
circle.getShapeDetails();

System.out.println("------------------------------------");

Shape square = new Shape(4,6.2);
square.getShapeDetails();

System.out.println("------------------------------------");

Shape rectangle = new Shape(4,8.14,3.56);
rectangle.getShapeDetails();

System.out.println("------------------------------------");

Shape triangle = new Shape(3, 4.66,2.36,9.65);
triangle.getShapeDetails();

System.out.println("------------------------------------");

    }
}
