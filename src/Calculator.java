import java.util.Scanner;

public class Calculator {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double num1 = getDouble();
        char operator = getOperator();
        double num2 = getDouble();
        double result = calculate(num1, num2, operator);
        System.out.println("Результат вычисления: " + result);
    }

    public static double getDouble(){
        System.out.println("Введите число");
        double num;
        if (sc.hasNextDouble()){
            num = sc.nextDouble();
        } else{
            System.out.println("Вы допустили ошибку при вводе. Попробуйте ещё раз");
            sc.next();
            num = getDouble();
        }
        return num;
    }
    public static char getOperator(){
        System.out.println("Введите оператор");
        char operator;
        if (sc.hasNext()){
            operator = sc.next().charAt(0);
        }else{
            System.out.println("Вы допустили ошибку при вводе. Попробуйте ещё раз");
            sc.next();
            operator = getOperator();
        }
        return operator;
    }
    public static double calculate(double num1, double num2, char operator){
        double result;
        switch(operator){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Операция не распознана, повторите ввод оператора");
                result = calculate(num1, num2, operator);
        }
        return result;
    }
}
