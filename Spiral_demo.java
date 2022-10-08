package september;

public class Spiral_demo 
{
	public static void main ( String args[])
	{
		Spiral_demo obj = new Spiral_demo();
		        obj.matrix();
	}

	
	public void matrix()
	  {
		int [][] spiral = new int [4][4] ;
		int value =1;
			
		int mincol=0;
		int maxcol=0;
		int minrow=0;
		int maxrow=0;
		
		for(int col=0 ; col<=3 ; col++)   //1
		{
			spiral[0][col] = value ;
			value++ ;
		}
		
		for(int row=1 ; row<=3 ; row++)   //2
		{
			spiral[row][3] = value ;
			value++;
		}
		
		for(int col=2 ; col>=0 ; col--)   //3
		{
			spiral[3][col] = value ;
			value++;
		}
		
		for(int row=2 ; row>=1 ; row--)   //4
		{
			spiral[row][0] = value ;
			value++;
		}
	
	  
		for(int col=1 ; col<=2 ; col++)    //5
		{
			spiral[1][col] = value ;
			value++ ;
		}
		
		for(int row=2 ; row<=2 ; row++)    //6
		{
			spiral[row][2] = value ;
			value++;
		}
		
		for(int col=1 ; col>=1 ; col--)     //7
		{
			spiral[2][col] = value ;
			value++;
		}
		
//		for(int row=2 ; row>=1 ; row--)     //8   Dummy to fail
//		{
//			spiral[row][0] = value ;
//			value++;
//		}
		
			
		for(int row=0 ; row<4 ; row++) 
		{
			for(int col=0 ; col<4 ; col++)
			{
				System.out.print(spiral[row][col] +"\t");
			}
			System.out.println();
		}
     }
}
