import java.util.Scanner;

public class excercise1 {

    public static int MyMethod(String a, int binary) {
        int value = 0;
        int power = 0;
        for(int i = a.length() - 1; i >= 0;i--) {
            if(a.charAt(i) == '1') {
                value += Math.pow(2, power);
            }
            power++;
        }
        return value;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число в бинарном формате>>>");
        String a = in.nextLine();
        int b = 0;
        System.out.println(MyMethod(a, b));
    }
}