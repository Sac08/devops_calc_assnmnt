package calculator;
import java.util.*;
import java.lang.Math;
import java.lang.Exception;

public class calculator {
	public static void main(String args[])
	{
		System.out.println("Welcome to Calculator App!");
		Scanner sc = new Scanner(System.in);
		int choice = -1;
		while (choice != 6)
		{
			int a;
			int b;
			if (choice == 1)
			{
				System.out.println("enter 'a' and 'b' numbers");
				a = sc.nextInt();
				b = sc.nextInt();
				System.out.println(a+b);
			}
			else if (choice == 2)
			{
				System.out.println("enter 'a' and 'b' numbers");
				a = sc.nextInt();
				b = sc.nextInt();
				System.out.println(a-b);
			}
			else if (choice  == 3)
			{
				System.out.println("enter 'a' and 'b' numbers");
				a = sc.nextInt();
				b = sc.nextInt();
				System.out.println(a*b);
			}
			else if (choice == 4)
			{
				try 
				{
					System.out.println("enter 'a' and 'b' numbers");
					a = sc.nextInt();
					b = sc.nextInt();
					System.out.println(a/b);
				}
				catch (ArithmeticException a1)
				{
					System.out.println("divide by zero, cant do that!");
				}
			}
			else if (choice == 5)
			{
				System.out.println("enter 'a' and 'b' numbers");
				a = sc.nextInt();
				b = sc.nextInt();
				System.out.println(Math.pow(a,b));
			}
			System.out.println("Enter your choice :");
			System.out.println("1.Add\t2.sub\t3.mul\t4.div\t5.a^b\t6.exit");
			
			choice = sc.nextInt();
		}
		
	}
}

