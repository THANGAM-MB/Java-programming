package MyPackage;
import java.util.*;

public class getword {
	void getWord(Vector<String> list) {
		System.out.println("In list:");
		for(String i:list) {
			System.out.println(i);
					}}
	void getWord(HashSet<String> list1) {
		System.out.println("In list1:");
		for(String i:list1) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) { 
		getword obj=new getword();
		Vector<String> list=new Vector<String>();
		HashSet<String> list1=new HashSet<String>();
		HashSet<String> list2=new HashSet<String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of string:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter a string:");
			String s=sc.next();
			list.add(s);
			list1.add(s);}
		list2.addAll(list);
		list2.addAll(list1);
		
		System.out.println("Vector is:"+list);
		obj.getWord(list);
		Iterator<String> itr=list.iterator();
		System.out.println("Iterator in list:");
		while(itr.hasNext()) {
			System.out.println(itr.next());
			if(itr.hasNext()) {
				System.out.println("loop continue");
			}
			else {
				System.out.println("loop terminate");
			}
			
		}
		
		System.out.println("HashSet is:"+list1);
		obj.getWord(list1);
		Iterator<String> itr1=list1.iterator();
		System.out.println("Iterator in list1:");
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
			if(itr1.hasNext()) {
				System.out.println("loop continue");
			}
			else {
				System.out.println("loop terminate");
			}
			
		}
		System.out.println("compare container is:"+list2);
		obj.getWord(list2);
		Iterator<String> itr2=list2.iterator();
		System.out.println("Iterator in list2:");
		while(itr1.hasNext()) {
			System.out.println(itr2.next());
			if(itr1.hasNext()) {
				System.out.println("loop continue");
			}
			else {
				System.out.println("loop terminate");
			}
			
		}

		}
}
