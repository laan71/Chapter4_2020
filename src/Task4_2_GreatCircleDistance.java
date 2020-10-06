import java.util.Scanner;

public class Task4_2_GreatCircleDistance {

    /* Write a program that prompts the user to enter the latitude and longitude of two
points on the earth in degrees and displays its great circle distance. The average
radius of the earth is 6,371.01 km. Note you need to convert the degrees into radians using the Math.toRadians method since the Java trigonometric methods use
radians. The latitude and longitude degrees in the formula are for north and west.
Use negative to indicate south and east degrees. */


    public static void main(String[] args) {

        System.out.println("Enter point 1 (latitude and longitude) in degrees: ");
        Scanner input = new Scanner(System.in);
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x1Radians = Math.toRadians(x1);
        double y1Radians = Math.toRadians(y1);

        System.out.println("Enter point 2 (latitude and longitude) in degrees: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x2Radians = Math.toRadians(x2);
        double y2Radians = Math.toRadians(y2);

        final double radiusOfEarth = 6371.01;

        double d = radiusOfEarth * Math.acos(Math.sin(x1Radians) * Math.sin(x2Radians) + Math.cos(x1Radians) * Math.cos(x2Radians) * Math.cos(y1Radians - y2Radians));

        System.out.println("The distance between the two points is " + d + " km");
    }
}
