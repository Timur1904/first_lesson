import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 2.5");
        int day = 234;
        int dayInWeek = 7;
        int result = day / dayInWeek;
        System.out.println(result);
        System.out.println("Задача 2.6");
        int sec = 5000;
        int hours = sec / 3600;
        System.out.println(hours);
        int minutes = hours * 60;
        System.out.println(minutes);
        int secInMinutes = minutes * 60;
        System.out.println(secInMinutes);
        System.out.println("Задача 2.13");
        int number = 123;
        String strNumber = Integer.toString(number);
        char last = strNumber.charAt(2);
        char second = strNumber.charAt(1);
        char first = strNumber.charAt(0);
        int numberLast = last - '0';
        int numberSecond = second - '0';
        int numberFirst = first - '0';
        int res = numberLast + numberSecond + numberFirst;
        System.out.println(res);
        System.out.println("Задача 2.19");
        int a = 1234;
        String strA = Integer.toString(a);
        char firstChar = strA.charAt(0);
        char secondChar = strA.charAt(1);
        char thirdChar = strA.charAt(2);
        char fourthChar = strA.charAt(3);
        int numFirstChar = firstChar - '0';
        int numSecondChar = secondChar - '0';
        int numThirdChar = thirdChar - '0';
        int numFourthChar = fourthChar - '0';
        int resSum = numFirstChar + numSecondChar + numThirdChar + numFourthChar;
        int resMult = numFirstChar * numSecondChar * numThirdChar * numFourthChar;
        System.out.println(resSum);
        System.out.println(resMult);
        System.out.println("Задача 4.9");
        Scanner scanner = new Scanner(System.in);
        double kmInHours = scanner.nextDouble();
        double mInSec = scanner.nextDouble();
        double transformInKm = mInSec * 3.6;
        if (kmInHours >= transformInKm) {
            System.out.println("Км/час больше чем м/с");
        } else {
            System.out.println("М/с больше чем км/час");
        }
        System.out.println("Задача 4.10");
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double square = sc.nextDouble();
        double sCircle = 3.14 * (radius * radius);
        double sSquare = square * square;
        System.out.println("Площадь круга равна " + sCircle);
        System.out.println("Площадь квадрата равна " + sSquare);
        if (sCircle >= sSquare) {
            System.out.println("Площадь круга больше площади квадрата");
        } else {
            System.out.println("Площадь квадрата больше площади круга");
        }
        System.out.println("Задача 4.13");
        double a1 = 0;
        while (true) {
            System.out.println("Введите число не равное 0: ");
            a1 = sc.nextDouble();
            if (a1 != 0) {
                break;
            } else {
                System.out.println("Введите число не равное 0!");
            }
        }
        double b1 = sc.nextDouble();
        double c1 = sc.nextDouble();
        double D = b1 * b1 - 4 * a1 * c1;
        if (D > 0) {
            System.out.println("уравнение имеет два различных вещественных корня");
        } else if (D == 0) {
            System.out.println("уравнение имеет один двойной вещественный корень");
        } else {
            System.out.println("уравнение не имеет вещественных корней");
        }
        System.out.println("Задача 4.36");
        int t = sc.nextInt();
        if (t % 5 < 3) {
            System.out.println("Зелёный");
        } else {
            System.out.println("Красный");
        }
        System.out.println("Задача 4.96");
        a1 = 0;
        while (true) {
            System.out.println("Введите число не равное 0: ");
            a1 = sc.nextDouble();
            if (a1 != 0) {
                break;
            } else {
                System.out.println("Введите число не равное 0!");
            }
        }
        b1 = sc.nextDouble();
        c1 = sc.nextDouble();
        D = b1 * b1 - 4 * a1 * c1;
        if (D > 0) {
            double x1 = (-b1 + Math.sqrt(D)) / (2 * a1);
            double x2 = (-b1 - Math.sqrt(D)) / (2 * a1);
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
        } else if (D == 0) {
            double x = -b1 / (2 * a1);
            System.out.println("Двойной корень: x = " + x);
        } else {
            System.out.println("У уравнения нет вещественных корней.");
        }

        System.out.println("Задача 4.97");
        a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int min, mid, max;
        if (a <= b && a <= c) {
            min = a;
            if (b <= c) {
                mid = b;
                max = c;
            } else {
                mid = c;
                max = b;
            }
        } else if (b <= a && b <= c) {
            min = b;
            if (a <= c) {
                mid = a;
                max = c;
            } else {
                mid = c;
                max = a;
            }
        } else {
            min = c;
            if (a <= b) {
                mid = a;
                max = b;
            } else {
                mid = b;
                max = a;
            }
        }

        System.out.println("Минимальное: " + min);
        System.out.println("Среднее: " + mid);
        System.out.println("Максимальное: " + max);
        System.out.println("Задача 4.122");

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a < b + c && b < a + c && c < a + b) {
            System.out.println("Да, это треугольник");
        } else {
            System.out.println("Это не треугольник");
        }


    }
}