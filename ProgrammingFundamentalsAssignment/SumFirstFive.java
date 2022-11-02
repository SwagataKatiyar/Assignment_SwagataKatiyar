package LanguageFundamentals;
import java.util.*;

public class SumFirstFive {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);	
		int startnum = sc.nextInt();
		int sum = firstFive(startnum);
		System.out.println("The sum:"+sum);
		sc.close();
		
	}
		static int firstFive(int num)
		{		
			int sum =0;
			int i=0;
					
			while(i<5)
			{
		  System.out.println("The number="+num);	
			  sum +=num;
//			  System.out.println("The current sum="+sum);	
			  num++;  
			  
			  i++;
			}					
			return sum;
		}	  
	}
