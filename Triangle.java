import java.lang.Math;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * This is the stack.
 *
 * @author      Yiyun Qin
 * @version 1.0
 * @since   2022-11-07
 */

public class Triangle {
  private static int side1;
  private static int side2;
  private static int side3;
  private static int numPerimeter;
  public static double numSemiperimeter;
  public static double numArea;
  private static double side1Angle;
  private static double side2Angle;
  private static double side3Angle;
  private static ArrayList<Double> radian = new ArrayList<Double>();
  public static double numRadian;
  public static String type;
  private static double height1;
  private static double height2;
  private static double height3;
  private static ArrayList<Double> listHeight = new ArrayList<Double>();
  public static double numHeight;
  public static double numInnerCircleRadius;
  public static double numCircumsicleRadius;

  // constructor
  /**
   * The Triangle constructor.
   *
   */
  public Triangle(int sideInt1, int sideInt2, int sideInt3) {
    side1 = sideInt1;
    side2 = sideInt2;
    side3 = sideInt3;
  }

  /**
   * The getSide1() getter, return side1.
   *
   */
  public static int getSide1() {
    return side1;
  }

  // getSide2() getter
  public static int getSide2() {
    return side2;
  }

  // getSide3() getter
  public static int getSide3() {
    return side3;
  }

  /**
   * The perimeter() method, calculates the perimeter of the triangle.
   *
   */
  private static void perimeter() {
    numPerimeter = side1 + side2 + side3;
  }

  // The semiPerimeter() method
  /**
   * The semiPerimeter() method, half of the perimeter.
   *
   */
  public static double semiPerimeter() {
    perimeter();
    numSemiperimeter = numPerimeter / 2 * 1.0000;
    if (isValid()) {
      return numSemiperimeter;
    } else {
      return -1.0000;
    }
  }

  /**
   * Many functions, the isValid() method tells if the triangle is valid.
   *
   */
  public static boolean isValid() {
    final int sum1 = side1 + side2;
    final int sum2 = side2 + side3;
    final int sum3 = side1 + side3;
    if (sum1 <= side3 || sum2 <= side1 || sum3 <= side2) {
      return false;
    } else {
      return true;
    }
  }

  // area() method, calculate area
  /**
   * The area() method.
   *
   */
  public static double area() {
    if (isValid()) {
      numArea = Math.sqrt(
        numSemiperimeter
        * (numSemiperimeter - side1)
        * (numSemiperimeter - side2)
        * (numSemiperimeter - side3)
      ) * 1.0000;
      return numArea;
    } else {
      return -1.0000;
    }
  }

  // angle() method, calculate angle
  /**
   * The angle(int) method.
   *
   */
  public static double angle(int angleNumber) {
    if (isValid()) {
      side1Angle = Math.acos(
        (Math.pow(side2, 2)
         + Math.pow(side3, 2)
         - Math.pow(side1, 2))
        / (2 * side2 * side3)
      ) * 1.0000;
      side2Angle = Math.acos(
        (Math.pow(side1, 2)
         + Math.pow(side3, 2)
         - Math.pow(side2, 2))
        / (2 * side1 * side3)
      ) * 1.0000;
      side3Angle = Math.acos(
        (Math.pow(side1, 2)
         + Math.pow(side2, 2)
         - Math.pow(side3, 2))
        / (2 * side1 * side2)
      ) * 1.0000;
      radian.add(side1Angle);
      radian.add(side2Angle);
      radian.add(side3Angle);
      radian.add(-1.0000);
      if (angleNumber == 1) {
        numRadian = radian.get(0);
      } else if (angleNumber == 2) {
        numRadian = radian.get(1);
      } else if (angleNumber == 3) {
        numRadian = radian.get(2);
      } else {
        numRadian = radian.get(3);
      }
      return numRadian;
    } else {
      return -1.0000;
    }
  }

  // getType() method, identity which type the triangle is
  /**
   * The getType() method.
   *
   */
  public static String getType() {
    final double right1 = Math.sqrt(
                    Math.pow(side2, 2)
                    + Math.pow(side3, 2));
    final double right2 = Math.sqrt(
                    Math.pow(side1, 2)
                    + Math.pow(side3, 2));
    final double right3 = Math.sqrt(
                    Math.pow(side1, 2)
                    + Math.pow(side2, 2));
    if (isValid()) {
      if (side1 == side2 && side2 == side3) {
        type = "equilateral triangle";
      } else if (
          side1 == side2
          || side2 == side3
          || side1 == side3
      ) {
        type = "isosceles triangle";
      } else if (
          right1 == side1
          || right2 == side2
          || right3 == side3
      ) {
        type = "right angle triangle";
      } else {
        type = "scalene triangle";
      }
      return type;
    } else {
      return "-1.0000";
    }
  }

  // height() method, calculates height
  /**
   * The height(int) method.
   *
   */
  public static double height(int heightNumber) {
    if (isValid()) {
      height1 = numArea * 2 / side1 * 1.0000;
      height2 = numArea * 2 / side2 * 1.0000;
      height3 = numArea * 2 / side3 * 1.0000;
      listHeight.add(height1);
      listHeight.add(height2);
      listHeight.add(height3);
      listHeight.add(-1.0000);
      if (heightNumber == 1) {
        numHeight = listHeight.get(0);
      } else if (heightNumber == 2) {
        numHeight = listHeight.get(1);
      } else if (heightNumber == 3) {
        numHeight = listHeight.get(2);
      } else {
        numHeight = listHeight.get(3);
      }
      return numHeight;
    } else {
      return -1.0000;
    }
  }

  // innerCircleRadius() method
  /**
   * The innerCircleRadius() method
   * calculates the inner triangle circle's radius.
   *
   */
  public static double innerCircleRadius() {
    if (isValid()) {
      numInnerCircleRadius = numArea / numSemiperimeter * 1.0000;
      return numInnerCircleRadius;
    } else {
      return -1.0000;
    }
  }

  // circumsicleRadius() method
  /**
   * The circumsicleRadius() method
   * calculates the circle's radius which arounds the triangle.
   *
   */
  public static double circumsicleRadius() {
    if (isValid()) {
      numCircumsicleRadius = side1 / (2 * Math.sin(side1Angle)) * 1.0000;
      return numCircumsicleRadius;
    } else {
      return -1.0000;
    }
  }
}
