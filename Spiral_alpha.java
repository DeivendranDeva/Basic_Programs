package september;

public class Spiral_alpha {

	public static void main(String[] args) 
	{
		Spiral_alpha array = new Spiral_alpha();
		             array.alphabet();
	}
	
	public void alphabet()
	{
	    char [][] spiral = new char [5][5] ;
		char value ='A';
		int mincol=0;
		int maxcol=spiral.length-1;
		int minrow=0;
		int maxrow=spiral.length-1;
//		int loop = spiral.length * spiral.length ;
		
		while(value<90) { 
			
			for(int col=mincol ; col<=maxcol ; col++)   //1
			{
				spiral[minrow][col] = value ;
			    value = (char) (value+1);
				
			}
			
			for(int row=minrow+1 ; row<=maxrow ; row++)   //2
			{
				spiral[row][maxcol] = value ;
				value = (char) (value+1);
				
			}
			
			for(int col=maxcol-1 ; col>=mincol ; col--)   //3
			{
				spiral[maxrow][col] = value ;
				value = (char) (value+1);
			}
			
			for(int row=maxrow-1 ; row>=minrow+1 ; row--)   //4
			{
				spiral[row][mincol] = value ;
				value = (char) (value+1);
			}
			mincol++;
			maxcol--;
			minrow++;
			maxrow--;
			}
			
			for(int x=0 ; x<spiral.length ; x++) 
			{
				for(int y=0 ; y<spiral.length ; y++)
				{
					System.out.print(spiral[x][y] +"  ");
				}
				System.out.println(" ");
			}
	 }	

}
