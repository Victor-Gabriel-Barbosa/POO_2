public class Triangle implements Shape {
  private double width;
  private double height;

  public Triangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  public double getWidth() {
    return width;
  }

  public double getHeight() {
    return height;
  }

  public double getArea() {
    return (double) (height * width) / 2;
  }
}
