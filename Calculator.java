import java.util.Scanner;

public class Calculator {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      char askUserToContinue;

      do {
         System.out.print("Enter first number: ");
         double firstNumber = sc.nextDouble();
         System.out.print("Enter second number: ");
         double secondNumber = sc.nextDouble();
         System.out.print("Choose operation (+,-,*,/): ");
         char operand = sc.next().charAt(0);
         switch (operand) {
            case '+':
               System.out.println("Result: " + (firstNumber + secondNumber));
               break;
            case '-':
               System.out.println("Result: " + (firstNumber - secondNumber));
               break;
            case '*':
               System.out.println("Result: " + (firstNumber * secondNumber));
               break;
            case '/':
               if (secondNumber == 0) {
                  System.out.println("Cannot divide by zero.");
                  break;
               } else {
                  System.out.println("Result: " + (firstNumber / secondNumber));
                  break;
               }
            default:
               System.out.println("You can enter only one of these characters +, -, *, /");
               break;
         }
         System.out.print("Do you want to calculate again?(y/n): ");
         askUserToContinue = sc.next().charAt(0);
         System.out.println("Thank you for using the calculator.");
      } while (askUserToContinue != 'n');
   }
}
