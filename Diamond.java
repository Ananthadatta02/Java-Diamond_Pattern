package star_patterns;

import java.util.Scanner;

public class Diamond 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size");
		int n = s.nextInt();
		for(int i=0;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<i;j++)
			{
				System.out.print("*");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<n;j++)
			{
				System.out.print("*");
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
