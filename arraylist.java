package MyPackage;
import java.util.*;

public class arraylist {
	int age;String name,place;double num;
	arraylist(int age,String name,double num){
		this.age=age;
		this.name=name;
		//this.place=place;
		this.num=num;
	}
 public static void main(String[] args) {
	 arraylist myobj=new arraylist(10,"soloo",3.0);
	 arraylist myobj1=new arraylist(20,"holoo",0.40);
	 arraylist myobj2=new arraylist(30,"ploo",5.0);
	 arraylist myobj3=new arraylist(10,"soloo",3.0);
	 arraylist myobj4=new arraylist(20,"holoo",0.40);
	 ArrayList<arraylist> list=new ArrayList<arraylist>();
	 ArrayList<arraylist> list1=new ArrayList<arraylist>();
	 ArrayList<Integer> list3=new ArrayList<Integer>();
	 ArrayList<Integer> list4=new ArrayList<>();
	 list3.add(3);
	 list3.add(78);
	 list3.add(90);
	 list4.add(3);
	 list4.add(78);
	 list.add(myobj);
	 list.add(myobj1);
	 list1.add(myobj2);
	 list1.add(myobj3);
	 list1.add(myobj4);
	 //list.retainAll(list1);
	 list3.retainAll(list4);
	 list3.set(0,91);
	 Collections.sort(list3);
	 //Collections.sort(list1);
	 //Collections.sort(list);
	 //list1.remove(myobj3);
	 //for(arraylist i:list) {
		// System.out.println(i.age);
//	 }
	 for(Integer i:list3) {
		 System.out.println(i);
		 
	 }
	 for(arraylist i:list1) {
		 System.out.println(i.age+" "+i.name+""+i.num);
	 }
	 System.out.println(list3);
 }
}
