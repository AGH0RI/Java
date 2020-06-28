package arrays;

import java.util.Scanner;

public class AverageMarks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number Of Students : ");
		int n = sc.nextInt();
		int student[]=new int[n],avg=0;
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter Marks Of Student "+i+" : ");
			student[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			avg=avg+student[i];
		}
		System.out.println("Average Marks Of All Students is "+avg/n);

	}

}
