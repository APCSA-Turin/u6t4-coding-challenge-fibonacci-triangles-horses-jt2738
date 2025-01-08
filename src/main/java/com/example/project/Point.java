package com.example.project;

public class Point {
  private int x;
  private int y;
 
  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }
  public int getX(){
    return x;
  }
  public int getY(){
    return y;
  }

  public void setX(int change){
    x=change;
  } 
  public void setY(int change){
    y=change;
  } 
  // Returns distance between this Point object and another Point object
  public double distanceTo(Point other) {
    double dist= Math.sqrt((Math.pow(x-other.x, 2))+(Math.pow(y-other.y, 2)));
    return dist;
  }


  // Returns a string in the format: (x, y)
  public String pointInfo() {
      return "(" + x + ", " + y + ")";
  }
}
