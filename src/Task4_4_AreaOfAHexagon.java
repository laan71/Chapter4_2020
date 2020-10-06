import java.util.Scanner;

public class Task4_4_AreaOfAHexagon {

    /* Write a program that prompts the user to enter the side of a hexagon and displays
       its area */

    public static void main(String[] args) {

        System.out.println("Enter the site of a hexagon: ");
        Scanner input = new Scanner(System.in);

        double side = input.nextDouble();
        double area = (6 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI/6));

        System.out.printf("The area of the hexagon is %5.2f\n ", area );

    }
}
