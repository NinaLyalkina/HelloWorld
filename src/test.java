import java.util.Scanner;

public class test {
    public static void main (String[] args){
        Scanner s1 = new Scanner (System.in);
        System.out.println("Введите число>>>");
        String S = s1.nextLine();
        System.out.println(S);
        int X = Integer.parseInt(S);
        System.out.println(X);
        double Y = (double) X;
        System.out.println(Y);
    }
}
