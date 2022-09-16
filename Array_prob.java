package september;

public class Array_prob 
{
  public static void main(String args [])
  {
	  Array_prob small = new Array_prob();
	          //  small.alpha();
	           //  small.beta();
	        //      small.gamma();
	          //     small.sine();
	          //   small.traverse();
	              small.cosine();
  }
  
  public void alpha()
  {
	char list []= {'A','B','C','D','E'} ;
	for(int i=0 ; i<list.length ; i++)
	{	
		int  a=list[i];
		    a=a+32;
		    char c1 = (char) a;
		    list[i]=c1;	
			System.out.print(c1+" ");
	}
  }
  
  
  
  public void beta()
  {
	char list [] = {'A','B','C','D','Z'} ;
	 
	for(int i=0; i<list.length ; i++)
	{
		int a = list[i];
		    a = a+1;
	    
		    if(a>90) {
		    	      a=a-26;
		             }
		    char c = (char) a;
		    list[i] = c;
		    
		    System.out.print(c+" ");
	}
  }
  
  
  
  public void gamma()
  {
	  char list [] = {'1','2','3','4','5'} ;
	  
	  for(int i=0; i<list.length ; i++)
		{
			int a = list[i];
			    a = a+1;
			    char c = (char) a;
			    list[i] = c;
			    
			    System.out.print(c+" ");
		}	  
  }
  
  
  public void sine()
  {
	  char list [] = {'K','L','M','N','O','P'} ;
	  
	  for(int i=0 ; i<list.length ; i++)
	  {
		  int a = list[i] ;
		  
		  if(i%2 == 0)
		  {
			a=a+2;  
			list [i] = (char) a;
		  }
		   
		  else
		  {
			  a=a+1;  
			  list [i] = (char) a;  
		  }
		  
	  }
	  for(int i=0 ; i<list.length ; i++)
	  {
		System.out.print(list[i]+" ");  
	  }
  }
  
  
  public void traverse()
  {
	char list [] = {'1','2','3','4','5'} ;
	
	for(int j=0 ; j<1 ; j++) 
	{
	int temp = list[0];
	   for(int i=0 ; i<(list.length-1) ; i++)
	   {
        list[i] = list[i+1];	    
	   }
	    list[list.length-1] = (char) temp;
	}        
	  
	
	   for(int i=0 ; i<list.length; i++)
	   {
		System.out.print(list[i]+" ");
	   }
		 
//	 int temp = list[0] ;	 
//	 list[0] = list[1];
//	 list[1] = list[2];
//	 list[2] = list[3];
//	 list[3] = list[4];	
//	 list[4] = (char) temp;	 
//	 System.out.println(list);
  }
  
  
  
  public void cosine()
  {
	char list [] = {'{','|','{','|'} ;
	
	for(int i = 0 ; i<list.length ; i++)
	{
		int store =  list[i];
		if(i%2 == 0)
		{
			store = store-1;
			list [i] =(char) store;
		}
		else
		{
			store = store-2;
			list [i] =(char) store;
		}		
	}
	for(int i = 0 ; i<list.length ; i++)
	{
		System.out.println(list[i]);
	}
  }
}
