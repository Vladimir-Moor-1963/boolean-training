public class Main {
    public static void main(String[] args) {
        int speed = 5;
        boolean b =true;
        boolean c = false;
        System.out.println(b);
        System.out.println(c);
        boolean d = ( speed > 0);
        System.out.println(d);
        boolean e = ( speed == 0);
        System.out.println(e);
        boolean f = ( 0 == 0);
        System.out.println(f);
        int dounts = 25;
        int cola = 50;
        int persons = 12;



        boolean eat = (dounts / persons) >=2;
        boolean drink = ( cola / persons) >=1;
        boolean amIGootMaan = eat && drink;
        System.out.println(amIGootMaan);
        System.out.println(eat);
        System.out.println(drink);
        boolean amSouGootMann = eat || drink;
        System.out.println(amSouGootMann);
        boolean amYouUpset = !amSouGootMann;
        System.out.println(amYouUpset);
        System.out.println(!(0 == 0));
        boolean anser = ( 0== 0);
        System.out.println(anser);
        System.out.println(! anser);


    }
}
