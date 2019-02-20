import java.util.Scanner;

        class Average {
    public static void main(String[] args){
        double X, Y, Z;
        Scanner s = new Scanner(System.in);
        System.out.println("Введите первое число>>>");
        X = s.nextDouble();
        System.out.println("Введите второе число>>>");
        Y = s.nextDouble();
        System.out.println("Введите третье число>>>");
        Z = s.nextDouble();
        double average = (X+Y+Z)/3;
        System.out.println("Среднее арифметическое =" + average);
        int d = (int) average/2;
        System.out.println("Среднее арифметическое / 2 = "+d);
        if (d>3){
            System.out.println("Программа выполнена корректно");
        }

    }
        }