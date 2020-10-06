import java.util.Scanner;

public class Task4_5_AreaOfARegularPolygon {

    /*
     Write a program that prompts the user to enter the
     number of sides and their length of a regular polygon and displays its area
     */

    public static void main(String[] args) {

        System.out.println("Enter the number of sides in a regular polygon: ");
        Scanner input = new Scanner(System.in);
        int numberOfSides = input.nextInt();

        System.out.println("Enter the length of each side in the regular polygon: ");
        double side = input.nextDouble();

        double area = (numberOfSides * Math.pow(side, 2)) / (4 * Math.tan(Math.PI/numberOfSides));
        System.out.println("The area of the regular polygon is " + area);

    }
}
