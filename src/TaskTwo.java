import java.util.Scanner;

public class TaskTwo {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ведите число: ");
        double x = scanner.nextDouble();
        double result = calculate(x);
        System.out.println(result);
    }
    public static double calculate(double x) {
        double radians = Math.toRadians(x);
        return Math.pow(Math.sin(radians), 2) - Math.cos(2*radians) + Math.tan(radians);
    }
}
