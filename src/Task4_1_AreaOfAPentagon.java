import java.util.Scanner;

/* Write a program that prompts the user to enter
the length from the center of a pentagon to a vertex and computes the area of a
pentagon.




 */
public class Task4_1_AreaOfAPentagon {

    public static void main(String[] args) {

        System.out.println("Enter the length from the center of a pentagon to a vertex: ");
        Scanner input = new Scanner(System.in);

        double radius = input.nextDouble();
        double side = 2 * radius * Math.sin(Math.PI/5);;
        double area = (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI/5));

        System.out.printf("The area of the pentagon is %5.2f\n", area);
        }
    }

