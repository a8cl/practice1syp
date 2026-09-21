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
        return Math.pow(Math.sin(x), 2) - Math.cos(2*x) + Math.tan(x);
    }
}
