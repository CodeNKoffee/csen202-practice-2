import java.util.Scanner;
import java.lang.Math;


public class sheetTwo {
  public static void main(String[] args) {
    // EXERCISE 2 - 6
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the x-coordinate:");
    int x = input.nextInt();

    System.out.println("Enter the y-coordinate:");
    int y = input.nextInt();
    
    if (x  > 0 && y > 0) {
      System.out.println("The point ("+ x +", " + y +") is in Quadrant I.");
    } else if (x < 0 && y > 0) {
      System.out.println("The point ("+ x +", "+ y +") is in Quadrant II.");
    } else if (x < 0 && y < 0) {
      System.out.println("The point ("+ x +", "+ y +") is in Quadrant III.");
    } else if (x > 0 && y < 0) {
      System.out.println("The point ("+ x +", "+ y +") is in Quadrant IV.");
    } else if (x == 0 && y != 0) {
      System.out.println("The point ("+ x +", "+ y +") lies on the y-axis.");
    } else if (x != 0 && y == 0) {
      System.out.println("The point ("+ x +", "+ y +") lies on the x-axis.");
    } else System.out.println("The point ("+ x +", "+ y +") lies at the origin.");


    // EXERCISE 2 - 7
    System.out.println("Enter the first number:");
    int z = input.nextInt();

    System.out.println("Enter the second number:");
    int m = input.nextInt();

    System.out.println("Enter the third number:");
    int n = input.nextInt();

    int min = (z < m) ? ((z < n) ? z : n) : (m < n) ? m : n;
    System.out.println(""+ min +" is the minimum amongst the three numbers.");


    // EXERCISE 2 - 8
    System.out.println("Enter the coefficiant a:");
    double a = input.nextDouble();

    System.out.println("Enter the coefficiant b:");
    double b = input.nextDouble();

    System.out.println("Enter the coefficiant c:");
    double c = input.nextDouble();

    double discriminant = Math.pow(b, 2) - 4 * a * c;

    if (discriminant < 0) {
      System.out.println("The quadratic equation has no real roots.");
    } else if (discriminant == 0) {
      System.out.println("The quadratic equation has only one real root.");
    } else {
      double rootOne = (-b - Math.sqrt(discriminant)) / 2 * a;
      double rootTwo = (-b + Math.sqrt(discriminant)) / 2 * a;
      System.out.println("The quadratic equation has two real roots: "+ rootOne +" and "+ rootTwo +".");
    }


    // EXERCISE 2 - 9
    System.out.println("Enter the pressure of the front right tire:");
    double frontRight = input.nextDouble();

    System.out.println("Enter the pressure of the front left tire:");
    double frontLeft = input.nextDouble();

    System.out.println("Enter the pressure of the rear right tire:");
    double rearRight = input.nextDouble();

    System.out.println("Enter the pressure of the rear left tire:");
    double rearLeft = input.nextDouble();

    boolean inflatedOk = true;

    if (frontRight < 35 || frontRight > 45) {
      System.out.println("The pressure of the front right tire is not within the recommended range.");
    } else if (frontLeft < 35 || frontLeft > 45) {
      System.out.println("The pressure of the front left tire is not within the recommended range.");
    } else if (rearRight < 35 || rearRight > 45) {
      System.out.println("The pressure of the rear right tire is not within the recommended range.");
    } else if (rearLeft < 35 || rearLeft > 45) {
      System.out.println("The pressure of the rear left tire is not within the recommended range.");
    } else if (Math.abs(frontRight - frontLeft > 3)) {
      System.out.println("The pressure difference between the front right and front left tires is more than 3 psi.");
    } else if (Math.abs(rearRight - rearLeft > 3)) {
      System.out.println("The pressure difference between the rear right and rear left tires is more than 3 psi.");
    }

    System.out.println(inflatedOk ? "The tire inflation is OK" : "Make a tire checkup please.");

    input.close();
  }
}