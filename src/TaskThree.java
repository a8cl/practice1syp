import java.util.Scanner;

public class TaskThree {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число №1: ");
        double x = scanner.nextDouble();
        System.out.print("Введите число №2: ");
        double y = scanner.nextDouble();

        if (x > y) {
            System.out.println(x);
            System.out.println(y);
        } else {
            System.out.println(y);
            System.out.println(x);
        }
    }
}
