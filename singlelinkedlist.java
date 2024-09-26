
package MyPackage;
import java.util.*;

public class singlelinkedlist {
   class slist{
	   int data;
	   slist next;
   
       public slist(int data) {
	       this.data=data;
	       this.next=null;
       }
   }

   public slist head=null;
   public slist tail=null;
   public slist current=head;

   public void creation() {
	   String res,res1;
	   slist temp;
	   Scanner sc=new Scanner(System.in);

	   System.out.println("Do you want to create headnode (yes/no):");
	   res=sc.nextLine();   
	   
	   if(res.equalsIgnoreCase("yes")) {
		   System.out.println("Enter the element:");
		   int headnode=sc.nextInt();
		   slist newnode=new slist(headnode);
		   head = newnode;
		   tail = newnode;
		   
		   System.out.println("Do you want to create node(yes/no):");
		   res1=sc.next();
		   while(res1.equalsIgnoreCase("yes")) {
			   System.out.println("Enter the node:");
			   int nodeData = sc.nextInt();
			   temp = new slist(nodeData);
			   tail.next = temp;
			   tail = temp;
			   System.out.println("Do you want to create node(yes/no):");
			   res1=sc.next();
		   }
	   }
   }
}


//package MyPackage;
//import java.util.*;
//
//public class singlelinkedlist {
//   class slist{
//	   int data;
//	   slist next;
//   
//   public slist(int data) {
//	   this.data=data;
//	   this.next=null;
//   }
//   public slist head=null;
//   public slist tail=null;
//   public slist current=head;
//   public void creation() {
//	   slist current=head;
//	   String res,res1;slist temp;
//	   System.out.println("Do you want to create headnode (yes/no):");
//	   Scanner sc=new Scanner(System.in);
//	   res=sc.nextLine();   
//	   if(res.equalsIgnoreCase("yes")) {
//		   System.out.println("Enter the element:");
//		   int headnode=sc.nextInt();
//		   slist newnode=new slist(headnode);
//		   System.out.println("Do you want to create node(yes/no):");
//		   res1=sc.nextLine();
//		   while(res.equalsIgnoreCase("yes")) {
//			   System.out.println("Enter the node:");
//			   temp=sc.next());
//			   current=temp;
//			   temp.next=null;
//		   }
//		   
//	   }
//   }
//}}
