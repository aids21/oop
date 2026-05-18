interface Calculator
{
int add(int a, int b);
}

interface Payment
{
void pay(double amount);

default void receipt()
{
System.out.println("Payment Successful. Receipt Generated.");
}

static void paymentInfo()
{
System.out.println("Welcome to Payment System");
}
}

class CreditCard implements Payment
{
public void pay(double amount)
{
System.out.println("Paid " + amount + " using Credit Card");
}
}

class UPI implements Payment
{
public void pay(double amount)
{
System.out.println("Paid " + amount + " using UPI");
}
}

public class AllInOneDemo
{
public static void main(String[] args)
{
Payment.paymentInfo();

Payment p;

p = new CreditCard();
p.pay(1000);
p.receipt();

p = new UPI();
p.pay(500);
p.receipt();

Calculator c = (a, b) -> a + b;

System.out.println("Addition using Lambda: " + c.add(10, 20));
}
}