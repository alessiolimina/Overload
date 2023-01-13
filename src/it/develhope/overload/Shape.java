package it.develhope.overload;

public class Shape {

public String shapeName;
public int numberOfEdges;

public Shape(){
this.shapeName = "Undefined shape";
System.out.println("Creating an Undefined Shape object");
}

public Shape(double radius){
this.shapeName = "Circle";
System.out.println("Creating a shape with radius " + radius + " cm long");
}

public Shape(int edges, double edgeLength){
this.shapeName = "Square";
this.numberOfEdges = edges;
System.out.println("Creating a shape with edge " + edgeLength + " cm long");
}

public Shape(int edges, double e1, double e2){
this.shapeName = "Rectangle";
this.numberOfEdges = edges;
System.out.println("Creating a shape with length " + e1 + " cm and width " + e2 + " cm");
}

public Shape(int edges, double e1, double e2, double e3){
this.shapeName = "Triangle";
this.numberOfEdges = edges;
System.out.println("Creating a shape with first edge " + e1 + " cm long, second edge " + e2 + " cm long and third edge " +e3 + " cm long");
}

public void getShapeDetails(){
System.out.println("This shape has the name " + shapeName + " and has " + numberOfEdges + " edges");
}

}
