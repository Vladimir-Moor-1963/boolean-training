import java.util.Scanner;

public class twoDigitNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in);
        int nabbertwo = scanner.nextInt();
        boolean number = ( nabbertwo >= 10) && ( nabbertwo< 100);
        System.out.println(number);
    }
}
