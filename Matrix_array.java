package september;
import java.util.Scanner;

public class Matrix_array
{
 public static void main (String args [])
 {
	 Matrix_array obj = new Matrix_array();
	// obj.matrix();
	 //obj.transpose();
	 //obj.addition_2_arrays();
	   obj.merging_2_arrays();
 }
 
 Scanner sc = new Scanner(System.in);
 
 public void matrix()
 {	 	 
	 int arr[][] = new int [4][3] ;
	 
	 int x = arr[0].length;
	 
	 for(int row=0 ; row<arr.length ; row++)
	 {	
       for(int col=0 ; col<x ; col++)   //col<arr[row].length
       {
	    arr[row][col] = sc.nextInt();	   
       }	 
        System.out.println();
	 }
	
 
     for(int row=0 ; row<arr.length ; row++)
     {	
      for(int col=0 ; col<x; col++)
      {
       System.out.print(arr[row][col]+" ");
      }	 
       System.out.println();
     }
}
 
 
 public void transpose()
 {	 	 
	 int arr[][] = new int [3][3] ;
	 
	 
	 for(int row=0 ; row<arr.length ; row++)
	 {	
       for(int col=0 ; col<arr.length; col++)   //col<arr[row].length
       {
	    arr[row][col] = sc.nextInt();	   
       }	 
        System.out.println();
	 }
	
 
     for(int row=0 ; row<arr.length ; row++)
     {	
      for(int col=0 ; col<arr.length; col++)
      {
       arr[row][col] = arr [col][row];
      }	 
     }
     
     
     for(int row=0 ; row<arr.length ; row++)
     {	
      for(int col=0 ; col<arr.length ; col++)
      {
       System.out.print(arr[row][col]+" ");
      }	 
       System.out.println();
     }
}
 
 
 public void addition_2_arrays()
 {
	 int array [] = new int [4] ;
	 int array2 [] = new int [4] ;
	 for(int i=0 ; i<array.length ; i++)
	 {
		 array[i] = sc.nextInt() ;
		 array2[i] = sc.nextInt() ;
	 }
	
     int[] array3 = new int [array.length];
	 for(int i=0 ; i<array.length ; i++)
	 {	
		array3  [i] = array[i] + array2[i] ;
	 }
	 
	 for(int i=0 ; i<array.length ; i++) 
	 {
		 System.out.println(array3[i]);
	 }
 }
 
 
 
 
 public void merging_2_arrays()
 {
	 System.out.println("Enter the values :") ;
    int array [] = new int [4]	;
    int array2 [] = new int [4]  ;
    
    for(int i=0 ; i<array.length ; i++)
    {
     
      array [i] = sc.nextInt() ;
      array2 [i] = sc.nextInt() ;
    }
    
     //  int j = 0 ;
    
    int array3 [] = new int [array.length + array2.length] ;
    for(int i=0 ; i<array3.length ; i++)
    {
      if(i<array.length)	
      {
    	array3 [i] = array [i] ;
      }
      else
      {
    	array3 [i] = array2[i-array.length] ;
    	
    	//j++;
      }
    }
    
    for(int i=0 ; i<array3.length ; i++)
    {
    	System.out.println(array3[i]);
    }
 }
 
 
}

