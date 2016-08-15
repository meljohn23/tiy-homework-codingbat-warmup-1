import java.util.Scanner;

/**
 * Created by melaniejohnson on 8/8/16.
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*System.out.println("give me a number");

        int x = scanner.nextInt();*/

        Kata kata = new Kata();

        System.out.println(kata.sleepIn(false, false));
        System.out.println(kata.sleepIn(true, false));
        System.out.println(kata.sleepIn(false, true));

        System.out.println(kata.monkeyTrouble(true, true));
        System.out.println(kata.monkeyTrouble(false, false));
        System.out.println(kata.monkeyTrouble(true, false));

        System.out.println(kata.sumDouble(1, 2));
        System.out.println(kata.sumDouble(3, 2));
        System.out.println(kata.sumDouble(2, 2));

        System.out.println(kata.diff21(19));
        System.out.println(kata.diff21(10));
        System.out.println(kata.diff21(21));

        System.out.println(kata.parrotTrouble(true, 6));
        System.out.println(kata.parrotTrouble(true, 7));
        System.out.println(kata.parrotTrouble(false,6));

        System.out.println(kata.makes10(9,10));
        System.out.println(kata.makes10(9,9));
        System.out.println(kata.makes10(1,9));

        System.out.println(kata.nearHundred(93));
        System.out.println(kata.nearHundred(90));
        System.out.println(kata.nearHundred(89));

        System.out.println(kata.posNeg(1, -1, false));
        System.out.println(kata.posNeg(-1, 1, false));
        System.out.println(kata.posNeg(-4, -5, true));

        System.out.println(kata.notString("candy"));
        System.out.println(kata.notString("x"));
        System.out.println(kata.notString("not bad"));

        System.out.println(kata.missingChar("kitten",1));
        System.out.println(kata.missingChar("kitten", 0));
        System.out.println(kata.missingChar("kitten", 4));
        System.out.println(kata.missingChar("melanie", 4));

        System.out.println(kata.frontBack("code"));
        System.out.println(kata.frontBack("a"));
        System.out.println(kata.frontBack("ab"));

        System.out.println(kata.front3("Java"));
        System.out.println(kata.front3("Chocolate"));
        System.out.println(kata.front3("abc"));

        System.out.println(kata.backAround("cat"));
        System.out.println(kata.backAround("Hello"));
        System.out.println(kata.backAround("a"));

        System.out.println(kata.or35(3));
        System.out.println(kata.or35(10));
        System.out.println(kata.or35(8));

        System.out.println(kata.front22("kitten"));
        System.out.println(kata.front22("HaHaHa"));
        System.out.println(kata.front22("abc"));

        System.out.println(kata.startHi("hi there"));
        System.out.println(kata.startHi("hi"));
        System.out.println(kata.startHi("hello hi"));

        System.out.println(kata.icyHot(120, -1));
        System.out.println(kata.icyHot(-1, 120));
        System.out.println(kata.icyHot(2, 120));

        System.out.println(kata.in1020(12, 99));
        System.out.println(kata.in1020(21, 12));
        System.out.println(kata.in1020(8, 99));

        System.out.println(kata.hasTeen(13, 20, 10));
        System.out.println(kata.hasTeen(20, 19, 10));
        System.out.println(kata.hasTeen(20, 10, 13));

        System.out.println(kata.loneTeen(13, 99));
        System.out.println(kata.loneTeen(21, 19));
        System.out.println(kata.loneTeen(13, 13));

        System.out.println(kata.delDel("adelbc"));
        System.out.println(kata.delDel("adelHello"));
        System.out.println(kata.delDel("adedbc"));

        System.out.println(kata.mixStart("mix snacks"));
        System.out.println(kata.mixStart("pix snacks"));
        System.out.println(kata.mixStart("piz snacks"));

        System.out.println(kata.startOz("ozymandias"));
        System.out.println(kata.startOz("bzoo"));
        System.out.println(kata.startOz("oxx"));

    }

}