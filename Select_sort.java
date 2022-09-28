package september;
import java.util.Scanner;
public class Select_sort {

	public static void main(String[] args) 
	{
		Select_sort ss = new Select_sort();
		            ss.sort();
	}
	Scanner sc = new Scanner(System.in) ;
	
	public void sort()
	{
	    int temp=0;
		int arr [] = new int[10] ;
		
		System.out.println("Enter array length");
		int size = sc.nextInt();
		
		System.out.println("Enter the elements");
		for(int i=0 ; i<arr.length ; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		 for(int i=0; i<size; i++)  
	       {  
	           for(int j=i+1; j<size; j++)  
	           {  
	               if(arr[i] > arr[j])  
	               {  
	                   temp = arr[i];  
	                   arr[i] = arr[j];  
	                   arr[j] = temp;  
	               }  
	           }  
	       }
		 
		 for(int i=0; i<size; i++)  
	     {  
	      System.out.print(arr[i]+ "  "); 
	     }
   }
}