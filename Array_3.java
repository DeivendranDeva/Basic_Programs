package september;

import java.util.Scanner;

public class Array_3 
{			 
	 int len []= {2,3,4,5,6};
	
	 
	 public static void main(String[ ] args)
	  {			
	       Array_3 call = new Array_3();
	               call.difference();
	  }
	 
	  public void difference()
	  {
		
		int even = 0;
		int odd = 0;
		for(int i=0;i<len.length;i++)
		{
	      if (len[i]%2 != 0)
	      {
	    	odd=odd+(len[i]);
	      }
	      else {
	        even=even+(len[i]);
	           }	     	         
		}
		
		System.out.println(even-odd);
	  }
	  
}
	 
	 
	 
	 
	 
	 

		  
	





