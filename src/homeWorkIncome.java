import java.util.Scanner;

public class homeWorkIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in);
        int come = scanner.nextInt();
       boolean cmeresult = (come > 500) && (come < 2500);
       System.out.println(cmeresult);


    }
}
