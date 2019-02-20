import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = s.nextInt();
        System.out.println(a + "x2=" + a*2);
        System.out.println(a + "x3=" + a*3);
        System.out.println(a + "x4=" + a*4);
        System.out.println(a + "x5=" + a*5);
        System.out.println(a + "x6=" + a*6);
        System.out.println(a + "x7=" + a*7);
        System.out.println(a + "x8=" + a*8);
        System.out.println(a + "x9=" + a*9);
    }
}
