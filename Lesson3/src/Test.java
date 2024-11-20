import lesson3.Lesson3;
import java.util.Scanner;
public class Test {
    public static void main (String[] args) {
        int x = 4 + 5;
        int y = 7 - 5;
        int umn = 6 * 5;
        int delenie2 = 7 % 5;
        double d = (double) 6/5; //  будет дробная часть
        int d2 = 6/5; //не будет дробная часть
        int number1 = 168;
        int number2 = 1500;

        System.out.println(x);
        System.out.println(y);
        System.out.println(number2 + number1);
        System.out.println(number2 - number1);
        System.out.println(number2 * number1);
        System.out.println(number2 / number1);
        System.out.println(number2 % number1);

        //В методе main инициализировать все примитивные типы.
        //Выведите в консоль char и сумму сложение всех численных переменнных
        byte b = 10;
        short s = 100;
        int i = 1000;
        long l = 10000L;
        float f = 10.5f;
        double db = 300.8;
        char symbol = 'A';
        boolean bool = true;
        System.out.println(symbol);
        System.out.println( b + s + i + l + f + db);

        System.out.print("Write hier");
        Scanner scanner = new Scanner(System.in);
        Lesson3 lesson3 = new Lesson3();
        int numberScan = scanner.nextInt();

        System.out.println(numberScan);

  lesson3.nonStaticNum = 8;
  lesson3.method();
  System.out.println(lesson3.number);
  System.out.println(lesson3.nonStaticNum);

        //считать два числа из консоли, и сложить их и вывести результат

        System.out.print("Write a1");
        int a1 = scanner.nextInt();
        System.out.print("Write a2");
        int a2 = scanner.nextInt();
        System.out.println(a1 + a2);

       // Считать два числа из консоли в переменный экземпляра класса и вывести результат их сложения
        System.out.print("Write number 1");
        lesson3.numberLesson3_1 = scanner.nextInt();
        System.out.print("Write number 2");
        lesson3.numberLesson3_2 = scanner.nextInt();
        System.out.println(lesson3.numberLesson3_1 + lesson3.numberLesson3_2);

    }
}



