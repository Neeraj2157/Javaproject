package pkg;

import java.util.Scanner;

public class Prime 
{
	public Prime()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");     
		int num = sc.nextInt();
		boolean res = false;
		for(int i=2; i<=num/2; i++)
		{
			if(num%i==0)
				{
					res = true;
					break;
				}
		}
			if(!res)
				{
					System.out.println("Number is a prime number");
				}
			else
				{
					System.out.println("Number is not a prime number  ");
				}
	}
		public static void main(String[] args) 
			{
				Prime obj = new Prime();
			}
     
}
