package com.example.project;

public class Triangle {
  // array of Point objects
  private Point[] vertices;
 
  // Constructor: initializes the vertices array
  // to contain the three Point objects
  public Triangle(Point p1, Point p2, Point p3) {
    vertices= new Point[]{p1, p2, p3};
  }
 
  // Returns the perimeter of the Triangle
  // HINT: use the distanceTo method that you wrote in the Point class
  public double perimeter() {
    double perim=0;
    perim+= vertices[0].distanceTo(vertices[1]);
    perim+= vertices[1].distanceTo(vertices[2]);
    perim+= vertices[2].distanceTo(vertices[0]);
    return perim;
  }

  // Returns a String with the three vertices that make up the Triangle;
  // if the vertices are the points (6, 10), (11, 15), and (18, 7),
  // this method should return: "[(6, 10), (11, 15), (18, 7)]"
  public String triangleInfo() {
    return getVertices()[0].pointInfo() + getVertices()[1].pointInfo() + getVertices()[2].pointInfo(); 
  }

  public Point[] getVertices(){
    return vertices; 
  }
}

  