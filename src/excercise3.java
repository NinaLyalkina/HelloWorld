import java.util.Scanner;

public class excercise3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("введите текущий курс>>>");
        double s = in.nextDouble();
        System.out.println("введите количество рублей>>>");
        double r = in.nextDouble();
        double b = r / s;
        double round = Math.pow(10, 2);
        System.out.println(((long)(b*round))/round);
    }
}
