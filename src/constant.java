import java.util.Scanner;

public class constant {
    public static void main(String[] args){
        int X=10, Y=20, Z=30;
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число>>>");
        int T = s.nextInt();
        if(T==X || T==Y || T==Z){
            System.out.println("Данное значение имеется в константах");
        }
        else
            System.out.println("Такой константы нет!");
    }
}
