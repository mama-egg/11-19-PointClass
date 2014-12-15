// A Point object represents a pair of (x, y) integer coordinates.
// Reference Building Java Programs pp 505-517
public class Point {
  
  int x;
  int y;
  
  public int getX() {
    return x;
  }
  
  public int getY() {
    return y;
  }
  
  public double distanceFromOrigin() {
    return Math.sqrt((x*x) + (y*y));
  }
  
  public double distance(Point p) {
    return 2 * (Math.sqrt(((p.x - x)*(p.x - x)) +((p.y - y)*(p.y - y)));
  }
  
  public String toString() {
    return "(" + x + ", " + y + ")";
  }
  
  public void setX(int newX) {
    x = newX;
  }
  
  public void setY(int newY) {
    y = newY;
  }
  
  public void translate(int a, int b) {
    x = x + a;
    y = y + b;
  }
}
