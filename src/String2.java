import java.util.Scanner;

public class String2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Введите строку>>>");
        String a = s.nextLine();
        System.out.println(a.replace(" ", ""));
    }
}
