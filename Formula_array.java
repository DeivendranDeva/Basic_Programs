package september;
import java.util.Scanner;
import java.lang.Math.*;

public class Formula_array 
{
 public static void main(String[] args) 
 {
	 Formula_array maths = new Formula_array();
	             //  maths.simple_interest();
	              // maths.compound_interest();
	               //  maths.sum_two_numbers();
	               //  maths.formula_algebra1();
	                   maths.formula_algebra2();
	 
	 System.out.println(maths);
 }
 Scanner sc = new Scanner(System.in) ;
 
 public void simple_interest()
 {
	 System.out.println("Enter Principle : ");
	 float principle = sc.nextFloat();
	 
	 System.out.println("Enter Duration : ");
	 int time = sc.nextInt();
	 
	 System.out.println("Enter Interest Rate : ");
	 int interestrate = sc.nextInt();
			 
	 double interest = (principle * time * interestrate)/100 ; 
	 
	 
	 System.out.println("Principle : "+principle);
	 System.out.println("Duration : "+time);
	 System.out.println("Interest Rate : "+interestrate);
	 System.out.println("Interest : "+interest);
	 
	
	 sc.close();
 }
 
 
 public void compound_interest()
 /*     A = P(1 + r/100)^nt
        A = Final amount , P = principle , r = interest rate
        n = no.of time interest applied per time period
        t = time                                               */
 {
	 System.out.println("Enter Principle :");
	 double principle = sc.nextDouble();
	 
	 System.out.println("Enter Duration :");
	 int time = sc.nextInt();
	 
	 System.out.println("Enter Rate :");
	 int rate = sc.nextInt();
	 
	 System.out.println("Enter No.of times interest applied per TP :");
	 int no_of_int_applied = sc.nextInt();
	 
	 double interest = principle*(Math.pow((1+rate/100) , no_of_int_applied*time));
	 
	 System.out.println("Principle : "+principle);
	 System.out.println("Duration : "+time);
	 System.out.println("Interest Rate : "+rate);
	 System.out.println("No of times paid : "+no_of_int_applied);
	 System.out.println("Interest : "+interest);
	 
	 sc.close();

  }
 
 
 
 
  public void sum_two_numbers()
  /*Distance between 2 points = sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1))*/
  
  {
	  System.out.println("Enter X1 :");
	  int X1 = sc.nextInt();
	  
	  System.out.println("Enter Y1 :");
	  int Y1 = sc.nextInt();
	  
	  System.out.println("Enter X2 :");
	  int X2 = sc.nextInt();
	  
	  System.out.println("Enter Y2 :");
	  int Y2 = sc.nextInt();
	  
	  double distance = Math.sqrt((X2-X1)*(X2-X1) + (Y2-Y1)*(Y2-Y1)) ;
	  
	  System.out.println("X1 :"+X1);
	  System.out.println("Y1 :"+Y1);
	  System.out.println("X2 :"+X2);
	  System.out.println("Y2 :"+Y2);
	  System.out.println("Distance b/w two points :"+distance);
	  sc.close() ;
  }
  
  
  
  public void formula_algebra1()
  {
	//  (a+b)^2 = a^2 + b^2 + 2ab
	  
	  System.out.println("Enter value A :");
	  int A = sc.nextInt();
	  
	  System.out.println("Enter value B :");
	  int B = sc.nextInt();
	  
	  double C = Math.pow(A,2) + Math.pow(B,2) + (2*A*B) ;
	  
	  System.out.println("A :"+A);
	  System.out.println("B :"+B);
	  System.out.println("(A+B)^2 :"+C);
	  sc.close();
  }
  
  
  
  public void formula_algebra2()
  {
	//  (a-b)^2 = a^2 + b^2 - 2ab
	  
	  System.out.println("Enter value A :");
	  int A = sc.nextInt();
	  
	  System.out.println("Enter value B :");
	  int B = sc.nextInt();
	  
	  double C = Math.pow(A,2) + Math.pow(B,2) - (2*A*B) ;
	  
	  System.out.println("A :"+A);
	  System.out.println("B :"+B);
	  System.out.println("(A-B)^2 :"+C); 
	  sc.close();
  }
 
}
