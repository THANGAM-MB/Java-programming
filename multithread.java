package MyPackage;

class multi2 extends Thread{  
public void run(){  
System.out.println("thread is running...");  
}  
}
class multi1 implements Runnable{
	public void run() {
		 for(int i=1;i<5;i++){   
			  // the thread will sleep for the 500 milli seconds   
			    try{Thread.sleep(2500);}catch(InterruptedException e){System.out.println(e);}    
			    System.out.println(Thread.currentThread().getName()+i);    
			  }    
	}
}
class multithread{
public static void main(String args[]){  
//multi2 t1=new multi2();  
//multi2 t2=new multi2();  
multi1 t3=new multi1();
Thread t4=new Thread(t3);
Thread t5=new Thread(t3);

t4.start();


t5.start();
try {
	t4.join();
}
catch(Exception e)
{
	System.out.println("exception be caught"+e);
}
System.out.println(t4.getState());
//System.out.println(t1.getState());
//t1.start();
//t2.start();
//System.out.println(t1.getState());
 }  
}  
