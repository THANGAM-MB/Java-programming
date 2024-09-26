package MyPackage;

public class arraycloning {  
	public static void main(String args[]){  
		int arr[]={33,3,4,5}; 
		//String a[]={"ab","bc","cd"};
		System.out.println("Printing original array:");  
		for(int i:arr)  
		System.out.print(i+" ");  
		System.out.println("");
		System.out.println("Printing clone of the array:");  
		int carr[]=arr.clone();  
		for(int i:carr)  
		System.out.print(i+" "); 
		System.out.println("");		  
		System.out.println("Are both equal?");  
		System.out.println(arr==carr);  
		  
		}}  


