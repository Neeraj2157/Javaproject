package pkg;
import java.util.Scanner;
public class Armstrong                   
{
	int a,b,c,d,sum = 0;
	public Armstrong()
	{
		
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the number: ");
	a= s.nextInt();
	b=a;
	while(b>0)
		{
			c= b%10;
			sum = sum+(c*c*c);
			b = b/10;
		}
	if(a==sum)
		{
			System.out.println("Number is Armstrong");
		}
	else
		{	
			System.out.println("Number is not Armstrong");
		}
	}                                      
	public static void main(String[] args) 
	{
		Armstrong obj = new Armstrong();	
	}
	

}
