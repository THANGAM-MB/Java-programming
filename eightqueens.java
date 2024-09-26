package MyPackage;
import java.util.*;



public class eightqueens {
	static int chessboard[][]=new int[8][8];
	private eightqueens() {
	
for(int i=0;i<8;i++) {
	for(int j=0;j<8;j++) {
		chessboard[i][j]=0;
		System.out.print(chessboard[i][j] +" ");
	}System.out.println("intialisation ");}
}
	
	public static void main(String args[]) {
		eightqueens myobj=new eightqueens();
		Scanner sc=new Scanner(System.in);
		if(myobj.mytry(0)) 
		{
			for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				System.out.print(chessboard[i][j] +" ");
			}System.out.println(" ");
		}

	}
	}
		boolean mytry(int count)//,int chessboard[][]) 
		
	    {
	    for(int column=0;column<8;column++) {
	
	    	chessboard[count][column]=1;
	    	if(count<7 && goodposition(count,column) && mytry(count+1)) 
	    		return true;
	    	if(count==7 && goodposition(count,column)) 
	    		return true;
	    	
	    	chessboard[count][column]=0;
	    	}
	    return false;
	
	    }
		boolean goodposition(int row, int column){//,int chessboard[][]) {
		
			for(int i=0;i<8;i++)
				if(i!=row)
					if(chessboard[i][column]==1)
						return false;
			for(int j=0;j<8;j++)
				if(j!=column)
					if(chessboard[row][j]==1)
						return false;
			int myrow=row;
			int mycolumn=column;
			while(myrow>=0 && mycolumn>=0) {
				if(myrow!=row)
					if(chessboard[myrow][mycolumn]==1) 
						return false;
				myrow--;
				mycolumn--;
			}
			myrow=row;
			mycolumn=column;
			while(myrow<8 && mycolumn<8) {
				if(myrow!=row)
					if(chessboard[myrow][mycolumn]==1) 
					{System.out.println("diagonal12");
					return false;
					}
			myrow++;
			mycolumn++;
			}
			myrow=row;
			mycolumn=column;
			while(myrow<8 && mycolumn>=0) {
				if(mycolumn!=column)
					if(chessboard[myrow][mycolumn]==1)
					{System.out.println("diagonal21");
					return false;
					}
				myrow++;
				mycolumn--;
			}
			myrow=row;
			mycolumn=column;
			while(myrow>=0 && mycolumn<8) {
				if(mycolumn!=column)
					if(chessboard[myrow][mycolumn]==1) 
						return false;
				
				myrow--;
				mycolumn++;
			}
			return true;
			
		}
		
	
		
}
