/**
 * A rectangle defined by its width and height.
 */
public class Rectangle {
  private double width;
  private double height;

  /**
   * Constructs a new {@code Rectangle} with the given width and height.
   *
   * @param w the width of the rectangle
   * @param h the height of the rectangle
   */
  public Rectangle(double w, double h) {
    this.width = w;
    this.height = h;
  }

  /**
   * Calculates and returns the area of this rectangle.
   *
   * @return the area of this rectangle
   */
  public double area() {
    return width * height;
  }

  /**
   * Scales the dimensions of this rectangle by the specified factor.
   *
   * @param factor the scaling factor
   */
  public void scale(double factor) {
    width = width * factor;
    height = height * factor;
  }

  /**
   * Determines whether this rectangle has a larger area than another rectangle.
   *
   * @param other the other rectangle to compare against
   * @return true if this rectangle is larger in area than {@code other}; false otherwise
   */
  public boolean isLargerThan(Rectangle other) {
    return area() > other.area();
  }
}
