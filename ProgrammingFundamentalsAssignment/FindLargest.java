package LanguageFundamentals;
import java.util.*;

public class FindLargest {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			int no1=-1,no2=-1,no3=-1;
					
			Scanner sc = new Scanner(System.in);
			
		    if(sc.hasNextInt())
			 no1 = sc.nextInt();
		    
			if(sc.hasNextInt())
			   no2 = sc.nextInt();
		    
			if(sc.hasNextInt())
			  no3 = sc.nextInt();
		    
			
		if(no1!=-1 && no2!=-1 && no3!=-1)
		 {
			if((no1 > no2) && (no1 > no3))
			{
				
				System.out.println("No1:"+no1+" is greatest among three numbers");
			}
			else if(no2>no3 && no2>no1) 
			{
				//x++;
				System.out.println("No2:"+no2+" is greatest among three numbers");
			}
			else
			{
				System.out.println("No3:"+no3+" is greatest among three numbers");
			}
		 }
		else
		{
			System.out.println("One of the three inputs is Invalid");
		}
					
			
			sc.close();

		}

	}
