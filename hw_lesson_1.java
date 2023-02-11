import java.util.Scanner;
public class hw_lesson_1 {
    public static void main(String[] args) {
        //#1
        // Scanner iScanner = new Scanner(System.in);
        // System.out.println("Введите число n: ");
        // String n = iScanner.nextLine();
        // Integer N = Integer.valueOf(n);
        // int sum = 0;
        // int fact = 1;
        // for (int i=1; i<=N;i++){
        //     sum+=i;
        //     fact*=i;
        // }
        // System.out.println(sum);
        // System.out.println(fact);


        //#2
        // for (int i = 1;i<1001;i++) System.out.println(i);


        //#3
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        String n = iScanner.nextLine();
        int a = Integer.valueOf(n);
        System.out.println("Выберите действие   * - + /   : ");
        String h = iScanner.nextLine();
        System.out.println("Введите число: ");
        String o = iScanner.nextLine();
        int b = Integer.valueOf(o);
        int c = 0;
        switch (h) {
            case "+":
                c = a+b;
                System.out.printf("%d + %d = %d \n",a,b,c);
                break;
            case "*":
                c = a*b;
                System.out.printf("%d * %d = %d \n",a,b,c);
                break;
            case "/":
                c = a/b;
                System.out.printf("%d / %d = %d \n",a,b,c);
                break;
            case "-":
                c = a-b;
                System.out.printf("%d - %d = %d \n",a,b,c);
        }
    }
}
