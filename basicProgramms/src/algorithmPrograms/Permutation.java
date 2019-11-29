package algorithmPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Permutation 
{
	Permutation p1=new Permutation();
	static ArrayList<String> list=new ArrayList<String>();
	
			
	 static void xyz()
			{
			
			Collections.shuffle(Permutation .list);
			
			
			}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter size");
		int a=sc.nextInt();
		
		
		for(int i=0;i<a;i++) 
		{
			System.out.println("enter char");
			String str=sc.next();
			list.add(str);
			
			
		}
		xyz();
		ArrayList list1=new ArrayList(list);
		System.out.println( list);
		
		if(list==list1)
		{
			xyz();
			System.out.println("match");
		}
		else
		{
			System.out.println(list1);
			xyz();
		   	
		}
		
		

		
	}

}
