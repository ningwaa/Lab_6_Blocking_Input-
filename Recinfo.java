import java.util.Scanner;
public class Recinfo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double length = 0.0;
        double breadth = 0.0;

        do {
            System.out.print("Enter the length of the rectangle: ");
            if (in.hasNextDouble()) {
                length = in.nextDouble();
                if (length > 0) {
                    break;
                } else {
                    System.out.println("Please enter a positive value.");
                }
            } else {
                String trash = in.next();
                System.out.println("You entered an incorrect input: " + trash + ". Please enter a double value.");
            }
        } while (true);

        do {
            System.out.print("Enter the breadth of the rectangle: ");
            if (in.hasNextDouble()) {
                breadth = in.nextDouble();
                if (breadth > 0) {
                    break;
                } else {
                    System.out.println("Please enter a positive value.");
                }
            } else {
                String trash = in.next();
                System.out.println("You entered an incorrect input: " + trash + ". Please enter a double value.");
            }
        } while (true);

        double area = length * breadth;
        double perimeter = 2 * (length + breadth);
        double diagonal = Math.sqrt(length * length + breadth * breadth);

        System.out.printf("The area of the rectangle is: %.2f%n", area);
        System.out.printf("The perimeter of the rectangle is: %.2f%n", perimeter);
        System.out.printf("The length of the diagonal of the rectangle is: %.2f%n", diagonal);

        in.close();
    }
}