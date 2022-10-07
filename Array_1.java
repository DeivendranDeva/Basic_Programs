package september;

import java.util.Scanner;

public class Array_1 
{  
	Scanner obj = new Scanner(System.in);
	
  public static void main(String[] args) 
  {	  	       
	  
	  Array_1 array = new Array_1();
	          array.array_creation();
  }
  
  public void array_creation()
  {   
	  System.out.println("Enter ur array length : ");
	  int length = obj.nextInt();
	  int height [] = new int [length];
	
	      for(int i=0;i<length;i++)
	      {
	        System.out.println("Enter ur Height : ");  
	    	height[i] = obj.nextInt(); 
	    	
	    	 if(height[i]%2==0)
		      {
		    	System.out.println("It is a even number" +height[i]);
		      }
	    	 else
	    		 System.out.println("It is a odd number" +height[i]);    	    	 
	      }
	      
	     
	  	  
//	      height [0] = obj.nextInt();
//	      height [1] = obj.nextInt();
//	      height [2] = obj.nextInt();
//	      height [3] = obj.nextInt();
//	      height [4] = obj.nextInt();
	
	      
	  //  System.out.println();
  }
}
