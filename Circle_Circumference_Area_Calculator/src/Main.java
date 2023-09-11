import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variable identification
        double r, pi = 3.14;

        // Retrieving data from the user
        System.out.print("Please enter the radius of the circle : ");
        r = input.nextDouble();


        // Calculation Section
        double circumference, area, u;

        circumference = 2 * pi * r;
        area = pi * r * r;

        System.out.println("Circumference of the circle : " + circumference);
        System.out.println("Area of the circle : " + area);

    }
}