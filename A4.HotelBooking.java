import java.util.Scanner;

public class HotelBooking
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);

int rooms[][] = new int[3][4];
int choice;

do
{
System.out.println("\n=== Hotel Room Booking System ===");
System.out.println("1. View Rooms");
System.out.println("2. Book Room");
System.out.println("3. Checkout Room");
System.out.println("4. Exit");
System.out.print("Enter Choice : ");
choice = sc.nextInt();

switch(choice)
{
case 1:
System.out.println("\nRoom Status");

for(int i=0; i<3; i++)
{
System.out.print("Floor " + (i+1) + " : ");

for(int j=0; j<4; j++)
{
if(rooms[i][j] == 0)
System.out.print("[Available] ");
else
System.out.print("[Booked] ");
}
System.out.println();
}
break;

case 2:
System.out.print("Enter Floor (1-3) : ");
int floor = sc.nextInt();

System.out.print("Enter Room Number (1-4) : ");
int room = sc.nextInt();

if(rooms[floor-1][room-1] == 0)
{
rooms[floor-1][room-1] = 1;
System.out.println("Room Booked Successfully");
}
else
{
System.out.println("Room Already Booked");
}
break;

case 3:
System.out.print("Enter Floor (1-3) : ");
int cfloor = sc.nextInt();

System.out.print("Enter Room Number (1-4) : ");
int croom = sc.nextInt();

if(rooms[cfloor-1][croom-1] == 1)
{
rooms[cfloor-1][croom-1] = 0;
System.out.println("Room Checked Out Successfully");
}
else
{
System.out.println("Room Already Available");
}
break;

case 4:
System.out.println("Thank You");
break;

default:
System.out.println("Invalid Choice");
}
}
while(choice != 4);

sc.close();
}
}