package MyPackage;
import java.util.*;

public class xogame {
	int i,j;static int xi,xj,oi,oj;
	public static void main(String[] args) {
		int chance=1;String x="x",o="o",empty="-";
		xogame myobj=new xogame();
		Scanner sc=new Scanner(System.in);
		String arr[][]=new String[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				arr[i][j]=empty;
				System.out.print(arr[i][j]+" ");
			}System.out.println("");	
		}
		while(chance<=9) {System.out.println("chance:"+chance);
			if(chance%2!=0) {
			System.out.println("print xi:");
			xi=sc.nextInt();
			System.out.println("print xj:");
			xj=sc.nextInt(); 
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					if(arr[xi][xj]==empty) {
			for(i=0;i<3;i++) {	
				for(j=0;j<3;j++) {
					arr[xi][xj]=x;
					
				}
			}chance=chance+1;
			for(i=0;i<3;i++) {
				for(j=0;j<3;j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println("");
				//System.out.println("chance:"+chance);

			}
			if((arr[0][0]==x &&arr[0][1]==x &&arr[0][2]==x)||(arr[1][0]==x &&arr[1][1]==x &&arr[1][2]==x)||(arr[2][0]==x &&arr[2][1]==x &&arr[2][2]==x)||(arr[2][0]==x &&arr[1][1]==x &&arr[0][2]==x)||(arr[0][0]==x &&arr[1][1]==x &&arr[2][2]==x)||(arr[0][0]==x &&arr[1][0]==x &&arr[2][0]==x)||(arr[0][1]==x &&arr[1][1]==x &&arr[2][1]==x)||(arr[0][2]==x &&arr[1][2]==x &&arr[2][2]==x)) {
						System.out.println("X win");
						break;
					}
			}
			else{
				System.out.println("Already printed select another location");
				System.out.println("print xi:");
				xi=sc.nextInt();
				System.out.println("print xj:");
				xj=sc.nextInt();
				}
			}}}
		if(chance<10 && chance%2==0) {
				System.out.println("print oi:");
				oi=sc.nextInt();
				System.out.println("print oj:");
				oj=sc.nextInt();
				for(int i=0;i<3;i++) {
					for(int j=0;j<3;j++) {
						if(arr[oi][oj]==empty) {
				
			
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
					arr[oi][oj]="o";
					
			}}chance=chance+1;
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				System.out.print(arr[i][j]+" ");
			}System.out.println("");}
		if((arr[0][0]==o &&arr[0][1]==o &&arr[0][2]==o)||(arr[1][0]==o &&arr[1][1]==o &&arr[1][2]==o)||(arr[2][0]==o &&arr[2][1]==o &&arr[2][2]==o)||(arr[2][0]==o &&arr[1][1]==o &&arr[0][2]==o)||(arr[0][0]==o &&arr[1][1]==o &&arr[2][2]==o)||(arr[0][0]==o &&arr[1][0]==o &&arr[2][0]==o)||(arr[0][1]==o &&arr[1][1]==o &&arr[2][1]==o)||(arr[0][2]==o &&arr[1][2]==o &&arr[2][2]==o)) {
			System.out.println("O win");
			break;
		}}else {
			System.out.println("Already printed select another location");
			System.out.println("print oi:");
			oi=sc.nextInt();
			System.out.println("print oj:");
			oj=sc.nextInt();
			
		}

			}
			
		}
	}
}
		System.out.println("Match draw");}}
