import java.util.Scanner;

class Customer
{
double balance = 1000;
}

public class SimpleATM
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
Customer c = new Customer();

int amount;
int choice = 0;

do
{
try
{
System.out.println("=== MENU ===");
System.out.println("1.Display Balance");
System.out.println("2.Deposit Money");
System.out.println("3.Withdraw Money");
System.out.println("4.Exit");

choice = sc.nextInt();

switch(choice)
{
case 1:
System.out.println("Current Balance: " + c.balance);
break;

case 2:
System.out.println("Enter amount to deposit");
amount = sc.nextInt();

if(amount < 0)
{
throw new IllegalArgumentException("Invalid Deposit");
}

c.balance += amount;
break;

case 3:
System.out.println("Enter amount to withdraw");
amount = sc.nextInt();

if(amount < 0)
{
throw new IllegalArgumentException("Invalid Withdrawal");
}
else if(amount > c.balance)
{
throw new ArithmeticException("Insufficient Balance");
}

c.balance -= amount;
break;

case 4:
System.out.println("Exiting from system");
break;

default:
System.out.println("Invalid Choice");
}
}
catch(IllegalArgumentException e)
{
System.out.println(e.getMessage());
}
catch(ArithmeticException e)
{
System.out.println(e.getMessage());
}

}
while(choice != 4);

sc.close();
}
}