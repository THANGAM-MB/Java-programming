package MyPackage;
import java.util.*;
class list {
	class link{
		int data;
		link next;
		public link(int data) {
			this.data=data;
			this.next=null;
		}
	}
		public link head=null;
		public link temp=null;
		public void create(int data) {
			link current=head;
			link node=new link(data);
			if(head==null)
			{
				head=node;
				temp=node;
				
			}
			else
			{
				temp.next=node;
				temp=node;
			}
			System.out.println("Element is created");
		}
		public void search(int data) {
			link node=new link(data);
			link current=head;
			while(current!=null && current.data!=data) {
				current=current.next;	
			}if(current==null) {
				System.out.println("Search Element not Exist");
			
			}else
			{System.out.println("Search Element Exist");
			}
		}
		public void insertion(int position,int data) {
			link node=new link(data);
			link current=head;
			while(current!=null && current.data!=position) {
				current=current.next;	
			}if(current==null) {System.out.println("Element not Exist");
			
			}else
			{node.next=current.next;
			current.next=node;
			System.out.println("Element Inserted");
			}
		}
		public void display()
		{
			link current=head;
		    if(head==null)
			{
				System.out.println("list is empty");
			}
			else {
			
				while(current!=null)
				{
					System.out.print(current.data+" ");
					current=current.next;
				}
			}
		}
		public void delete(int data) {
			link node=new link(data);
			link current=head;
			while(current!=null && current.next.data!=data ) {
				current=current.next;	
			}if(current==null) {System.out.println("Element not Exist");
			
			}else
			{
			current.next=current.next.next;
			System.out.println("Element is Deleted");
			}
		}
		}
	
	public class linkedlist
	{
		public static void main(String args[])
		
		{
			int a, choice;String choice1;
			list obj=new list();
			Scanner sc=new Scanner(System.in);
			System.out.println("no of elment want to create:");
			int n=sc.nextInt();
			while(n>0) {
				System.out.println("enter the elment:");
				int element=sc.nextInt();
				obj.create(element);
				n--;
			}
			do{System.out.println("1.display,2.insertion,3.delete,4.search");
			System.out.println("Enter your choice:");
			
			choice=sc.nextInt();
			switch(choice) {
			
			case 1:
			{
				System.out.println("Display");
				obj.display();
				break;
			}
			case 2:
			{System.out.println("inserted position is:");
			int pos=sc.nextInt();
				System.out.println("inserted element is:");
				int ele=sc.nextInt();
				obj.insertion(pos, ele);
				break;
			}
			case 3:
				System.out.println("remove elment:");
				int remove=sc.nextInt();
				obj.delete(remove);
				break;
			case 4:
			{
				System.out.println("Enter the search element:");
				obj.search(sc.nextInt());
				break;
				
			}}
			
			System.out.println("Do you want to continue(yes/no):"+sc.nextLine());
     		choice1=sc.nextLine();
			}while(choice1.equalsIgnoreCase("yes"));
			if(choice1.equalsIgnoreCase("No")) {
				System.out.println("Completed");
			}

	
		}
		
	}

