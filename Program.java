import java.util.Scanner;

public class Program {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Write nums and operations: ");
        String input = sc.nextLine();
        
        int operatorIndex = -1;
        char[] operators = {'+', '-', '*', '/'};
        for (char op : operators) {
            if (input.indexOf(op) != -1) {
                operatorIndex = input.indexOf(op);
                break;
            }
        }
        
        if (operatorIndex == -1 || operatorIndex == 0 || operatorIndex == input.length() - 1) {
            System.out.println("invalid input!");
            return;
        }
        
        double num1 = Double.parseDouble(input.substring(0, operatorIndex).trim());
        double num2 = Double.parseDouble(input.substring(operatorIndex + 1).trim());
        char operator = input.charAt(operatorIndex);
        
        double result = 0;
        switch (operator) {
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
                if (num2 == 0) {
                    System.out.println("division by zero!");
                    return;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("invalid operator!");
                return;
        }
        
        System.out.println("Result: " + result);
        

        System.out.println("press enter to leave");
        String inputwait = sc.nextLine();
        sc.close();
    }
}
