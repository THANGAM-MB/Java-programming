package MyPackage;

public class Clone implements Cloneable {
	int a;
	int b;

	public static void main(String[] args)throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		System.out.println("*******Shallow cloning**********");
		Clone sc=new Clone();
		System.out.println(sc);
		Clone t1=sc;
		System.out.println(t1);
		sc.a=10;
		sc.b=15;
		System.out.println(sc.a);
		System.out.println(sc.b);
		t1.a=sc.a;
		t1.b=sc.b;
		System.out.println(t1.a);
		System.out.println(t1.b);
		System.out.println("************Deep cloning*********************");
		Clone t2=(Clone)sc.clone();
		System.out.println(sc);
		System.out.println(t2);
		t2.a=sc.a;
		t2.b=sc.b;
		System.out.println(t2.a);
		System.out.println(t2.b);
		

	}

}
