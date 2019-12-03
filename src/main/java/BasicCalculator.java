import java.util.Scanner;

public class BasicCalculator {


    int first = 0;
    int second = 0;
    char operation;
    double result = 0.0;
    char toContinue;

    public BasicCalculator() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        first = sc.nextInt();
        System.out.println("Enter second number");
        second = sc.nextInt();

        System.out.println("enter operation symbol (choose from +, -, *, /)");
        operation = sc.next().charAt(0);


        switch (operation) {
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case '*':
                result = first * second;
                break;
            case '/':
                result = first / second;
                break;
        }
        System.out.println(result);
        System.out.println("\nWould you like to stay in the same calculator (y/n)");
        toContinue= sc.next().charAt(0);




    }
 }



