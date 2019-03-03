import java.util.Scanner;

public class String3 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Введите первую строку>>>");
        String a = s.nextLine();
        int len1 = a.length();
        System.out.println("Введите вторую строку>>>");
        String b = s.nextLine();
        int len2 = b.length();
        if (len1>len2)
            System.out.println(a);
        if (len1<len2)
            System.out.println(b);
        else
            System.out.println("Строки равны. Введите заново.");

    }
}
