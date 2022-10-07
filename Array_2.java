package september;

import java.util.Scanner;
public class Array_2 
{
  public static void main(String arg [])
  {
	  Array_2 array =  new Array_2 ();
	           array.creation();
  }
  
  Scanner box = new Scanner(System.in);
  
  public void creation()
  {
	 System.out.println("Enter length : ");
	    int length = box.nextInt();
	    int values[] = new int [length];
	    
	    int sum =0;
	    for(int i=0;i<length;i++)  
	    {
		 System.out.println("Enter values : ");  
		 values [i] = box.nextInt();
		 
		 sum = sum + values[i];
	    }
	    System.out.println("Sum of the given number is " +sum);	
  }
}  
  
 