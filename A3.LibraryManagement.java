import java.util.Scanner;

class Book
{
int id;
String name;
boolean issued = false;

static int totalBooks = 0;

Book(int id, String name)
{
this.id = id;
this.name = name;
totalBooks++;
}

void display()
{
System.out.println("Book ID : " + id);
System.out.println("Book Name : " + name);

if(issued)
System.out.println("Status : Issued");
else
System.out.println("Status : Available");
}

void issueBook()
{
if(!issued)
{
issued = true;
System.out.println("Book Issued");
}
else
{
System.out.println("Book Already Issued");
}
}

void returnBook()
{
if(issued)
{
issued = false;
System.out.println("Book Returned");
}
else
{
System.out.println("Book was not issued");
}
}

static void showTotalBooks()
{
System.out.println("Total Books : " + totalBooks);
}
}

public class LibraryManagement
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);

Book books[] = new Book[10];
int count = 0;
int choice;

do
{
System.out.println("\n=== Library Management System ===");
System.out.println("1. Add Book");
System.out.println("2. View Books");
System.out.println("3. Issue Book");
System.out.println("4. Return Book");
System.out.println("5. Total Book Count");
System.out.println("6. Exit");
System.out.print("Enter Choice : ");
choice = sc.nextInt();

switch(choice)
{
case 1:
System.out.print("Enter Book ID : ");
int id = sc.nextInt();

System.out.print("Enter Book Name : ");
String name = sc.next();

books[count] = new Book(id, name);
count++;

System.out.println("Book Added");
break;

case 2:
for(int i = 0; i < count; i++)
{
books[i].display();
System.out.println();
}
break;

case 3:
System.out.print("Enter Book Index : ");
int issue = sc.nextInt();
books[issue].issueBook();
break;

case 4:
System.out.print("Enter Book Index : ");
int ret = sc.nextInt();
books[ret].returnBook();
break;

case 5:
Book.showTotalBooks();
break;

case 6:
System.out.println("Program Exited");
break;

default:
System.out.println("Invalid Choice");
}

}
while(choice != 6);

sc.close();
}
}