import java.text.DecimalFormat;
/**
 * This is the program that calculates the triangle using semiperimeter.
 *
 * @author  Yiyun Qin
 * @version 1.0
 * @since   2022-11-07
 */
public final class Main {
  /**
   * The main function.
   *
   */
  public static void main(String[] args) {
    System.out.println("");
    DecimalFormat decimal = new DecimalFormat("0.####");

    // triangle 1
    Triangle testTriangle1 = new Triangle(3, 4, 5);
    System.out.println("Created a 3 mm by 4 mm by 5 mm triangle.");
    System.out.println(" → Is the triangle valid: " + Boolean.toString(testTriangle1.isValid()));
    System.out.println(" → Semiperimeter: " + decimal.format(testTriangle1.semiPerimeter()) + " mm");
    System.out.println(" → Area: " + decimal.format(testTriangle1.area()) + " mm²");
    System.out.println(" → Type: " + testTriangle1.getType());
    System.out.println(" → Angle 1: " + decimal.format(testTriangle1.angle(1)) + " rad");
    System.out.println(" → Angle 2: " + decimal.format(testTriangle1.angle(2)) + " rad");
    System.out.println(" → Angle 3: " + decimal.format(testTriangle1.angle(3)) + " rad");
    System.out.println(" → Height 1: " + decimal.format(testTriangle1.height(1)) + " mm");
    System.out.println(" → Height 2: " + decimal.format(testTriangle1.height(2)) + " mm");
    System.out.println(" → Height 3: " + decimal.format(testTriangle1.height(3)) + " mm");
    System.out.println(" → Inner circle radius: " + decimal.format(testTriangle1.innerCircleRadius()) + " mm");
    System.out.println(" → Circumcircle radius: " + decimal.format(testTriangle1.circumsicleRadius()) + " mm");
    System.out.println("");

    // triangle 2
    Triangle testTriangle2 = new Triangle(3, 3, 3);
    System.out.println("Created a 3 mm by 3 mm by 3 mm triangle.");
    System.out.println(" → Is the triangle valid: " + Boolean.toString(testTriangle2.isValid()));
    System.out.println(" → Semiperimeter: " + decimal.format(testTriangle2.semiPerimeter()) + " mm");
    System.out.println(" → Area: " + decimal.format(testTriangle2.area()) + " mm²");
    System.out.println(" → Type: " + testTriangle2.getType());
    System.out.println(" → Angle 1: " + decimal.format(testTriangle2.angle(1)) + " rad");
    System.out.println(" → Angle 2: " + decimal.format(testTriangle2.angle(2)) + " rad");
    System.out.println(" → Angle 3: " + decimal.format(testTriangle2.angle(3)) + " rad");
    System.out.println(" → Height 1: " + decimal.format(testTriangle2.height(1)) + " mm");
    System.out.println(" → Height 2: " + decimal.format(testTriangle2.height(2)) + " mm");
    System.out.println(" → Height 3: " + decimal.format(testTriangle2.height(3)) + " mm");
    System.out.println(" → Inner circle radius: " + decimal.format(testTriangle2.innerCircleRadius()) + " mm");
    System.out.println(" → Circumcircle radius: " + decimal.format(testTriangle2.circumsicleRadius()) + " mm");
    System.out.println("");

    // triangle 3
    Triangle testTriangle3 = new Triangle(3, 4, 4);
    System.out.println("Created a 3 mm by 4 mm by 4 mm triangle.");
    System.out.println(" → Is the triangle valid: " + Boolean.toString(testTriangle3.isValid()));
    System.out.println(" → Semiperimeter: " + decimal.format(testTriangle3.semiPerimeter()) + " mm");
    System.out.println(" → Area: " + decimal.format(testTriangle3.area()) + " mm²");
    System.out.println(" → Type: " + testTriangle3.getType());
    System.out.println(" → Angle 1: " + decimal.format(testTriangle3.angle(1)) + " rad");
    System.out.println(" → Angle 2: " + decimal.format(testTriangle3.angle(2)) + " rad");
    System.out.println(" → Angle 3: " + decimal.format(testTriangle3.angle(3)) + " rad");
    System.out.println(" → Height 1: " + decimal.format(testTriangle3.height(1)) + " mm");
    System.out.println(" → Height 2: " + decimal.format(testTriangle3.height(2)) + " mm");
    System.out.println(" → Height 3: " + decimal.format(testTriangle3.height(3)) + " mm");
    System.out.println(" → Inner circle radius: " + decimal.format(testTriangle3.innerCircleRadius()) + " mm");
    System.out.println(" → Circumcircle radius: " + decimal.format(testTriangle3.circumsicleRadius()) + " mm");
    System.out.println("");

    // triangle 4
    Triangle testTriangle4 = new Triangle(2, 3, 4);
    System.out.println("Created a 2 mm by 3 mm by 4 mm triangle.");
    System.out.println(" → Is the triangle valid: " + Boolean.toString(testTriangle4.isValid()));
    System.out.println(" → Semiperimeter: " + decimal.format(testTriangle4.semiPerimeter()) + " mm");
    System.out.println(" → Area: " + decimal.format(testTriangle4.area()) + " mm²");
    System.out.println(" → Type: " + testTriangle4.getType());
    System.out.println(" → Angle 1: " + decimal.format(testTriangle4.angle(1)) + " rad");
    System.out.println(" → Angle 2: " + decimal.format(testTriangle4.angle(2)) + " rad");
    System.out.println(" → Angle 3: " + decimal.format(testTriangle4.angle(3)) + " rad");
    System.out.println(" → Height 1: " + decimal.format(testTriangle4.height(1)) + " mm");
    System.out.println(" → Height 2: " + decimal.format(testTriangle4.height(2)) + " mm");
    System.out.println(" → Height 3: " + decimal.format(testTriangle4.height(3)) + " mm");
    System.out.println(" → Inner circle radius: " + decimal.format(testTriangle4.innerCircleRadius()) + " mm");
    System.out.println(" → Circumcircle radius: " + decimal.format(testTriangle4.circumsicleRadius()) + " mm");
    System.out.println("");

    // triangle 5
    Triangle testTriangle5 = new Triangle(23, 4, 6);
    System.out.println("Created a 23 mm by 4 mm by 6 mm triangle.");
    System.out.println(" → Is the triangle valid: " + Boolean.toString(testTriangle5.isValid()));
    System.out.println(" → Semiperimeter: " + decimal.format(testTriangle5.semiPerimeter()) + " mm");
    System.out.println(" → Area: " + decimal.format(testTriangle5.area()) + " mm²");
    System.out.println(" → Type: " + testTriangle5.getType());
    System.out.println(" → Angle 1: " + decimal.format(testTriangle5.angle(1)) + " rad");
    System.out.println(" → Angle 2: " + decimal.format(testTriangle5.angle(2)) + " rad");
    System.out.println(" → Angle 3: " + decimal.format(testTriangle5.angle(3)) + " rad");
    System.out.println(" → Height 1: " + decimal.format(testTriangle5.height(1)) + " mm");
    System.out.println(" → Height 2: " + decimal.format(testTriangle5.height(2)) + " mm");
    System.out.println(" → Height 3: " + decimal.format(testTriangle5.height(3)) + " mm");
    System.out.println(" → Inner circle radius: " + decimal.format(testTriangle5.innerCircleRadius()) + " mm");
    System.out.println(" → Circumcircle radius: " + decimal.format(testTriangle5.circumsicleRadius()) + " mm");
    System.out.println("");

    System.out.println("\nDone.");
  }
}
