import java.util.Scanner;

public class Furstclass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year= scanner.nextInt();
        boolean multiplisidiFor4 = (year % 4)  == 0;
        boolean multiplisidiFor100 = ( year % 100) == 0;
        boolean  multiplisidiFor400 = ( year % 400) == 0;
        boolean result = multiplisidiFor4 && !multiplisidiFor100 || multiplisidiFor400;
        boolean sekondresult = (year % 4 == 0) && ( year % 100 != 0) || ( year % 400 == 0);
        System.out.println(result);
        System.out.println(sekondresult);


    }
}
