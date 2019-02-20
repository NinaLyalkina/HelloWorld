import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число в бинарном формате>>>");
        String a = in.nextLine();
        int b = Integer.parseInt(a, 2);
        System.out.println(b);

    }
}
