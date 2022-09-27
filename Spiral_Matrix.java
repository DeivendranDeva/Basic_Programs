package september;

public class Spiral_Matrix 
{
  public static void main(String args [])
  {
	  Spiral_Matrix Numbers = new Spiral_Matrix();
	                Numbers.matrix();
  }
	
  public void matrix()
  {
	int [][] spiral = new int [5][5] ;
	int value =1;
	int mincol=0;
	int maxcol=spiral.length-1;
	int minrow=0;
	int maxrow=spiral.length-1;
	int loop = spiral.length * spiral.length ;
	
	while(value<=loop) { 
		
	for(int col=mincol ; col<=maxcol ; col++)   //1
	{
		spiral[minrow][col] = value ;
		value++ ;
	}
	
	for(int row=minrow+1 ; row<=maxrow ; row++)   //2
	{
		spiral[row][maxcol] = value ;
		value++;
	}
	
	for(int col=maxcol-1 ; col>=mincol ; col--)   //3
	{
		spiral[maxrow][col] = value ;
		value++;
	}
	
	for(int row=maxrow-1 ; row>=minrow+1 ; row--)   //4
	{
		spiral[row][mincol] = value ;
		value++;
	}
	mincol++;
	maxcol--;
	minrow++;
	maxrow--;
	}
	
	for(int row=0 ; row<spiral.length ; row++) 
	{
		for(int col=0 ; col<spiral.length ; col++)
		{
			System.out.print(spiral[row][col] +"\t");
		}
		System.out.println();
	}
  }
}  
  

	
	

