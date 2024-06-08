import java.util.Scanner;

public class namberSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int namberseven = scanner.nextInt();
         int numberresult =( 1 & 2 & 0 );
        boolean nuberresult = (namberseven % 3 == 1);
        boolean numberseven = namberseven % 3 == 2;
        boolean naberresult = namberseven % 3 == 0;
        System.out.println(naberresult);


    }
}
