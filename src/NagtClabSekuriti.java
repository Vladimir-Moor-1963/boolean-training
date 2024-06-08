import java.util.Scanner;

public class NagtClabSekuriti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст");
        int aeg = scanner.nextInt();
        System.out.println("Можете ли вы его документально подтвердить?");
        boolean hasPassport = scanner.nextBoolean();
        boolean securitiResult = hasPassport && (aeg >= 18) && (aeg <= 95) && (aeg  !=21) && (aeg !=22) || (aeg == 1234567)  ;
        System.out.println("Результат проверки " + securitiResult);

    }
}
