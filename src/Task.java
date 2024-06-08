import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int Squer = a * a + b * b;
        double c = Math.sqrt(Squer);
        System.out.println(c);


    }
}
