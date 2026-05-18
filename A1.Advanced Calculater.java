import java.util.Scanner;

public class Advancedcalculater {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

while (true) {
try {
System.out.print("Enter first number: ");
double num1 = scanner.nextDouble();

System.out.print("Enter second number: ");
double num2 = scanner.nextDouble();

System.out.print("Choose an operation (+, -, *, /, %, ^): ");
char operation = scanner.next().charAt(0);

double result;

switch (operation) {
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
if (num2 != 0) {
result = num1 / num2;
}
else {
throw new ArithmeticException("Division by zero is not allowed");
}
break;

case '%':
if (num2 != 0) {
result = num1 % num2;
}
else {
throw new ArithmeticException("Modulo by zero is not allowed");
}
break;

case '^':
result = Math.pow(num1, num2);
break;

default:
throw new IllegalArgumentException("Invalid operation");
}

System.out.println("Result = " + result);
}

catch (Exception e) {
System.out.println("Error: " + e.getMessage());
scanner.nextLine();
}

System.out.print("Do you want to continue? (y/n): ");
char choice = scanner.next().charAt(0);

if (choice == 'n' || choice == 'N') {
System.out.println("Calculator is closing. Thank you!");
break;
}
}

scanner.close();
}
}