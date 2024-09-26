package MyPackage;

import java.awt.Button;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleSupplier;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

interface Lam{
	//abstract method 
	public  void abstractMethod(int x,int z,String y);
	
	public default void nonAbstract() {
		System.out.println("Non Abstract Method is called");
	}
}
interface Lam1{
	public String method1();
	public static <T> void forEach(List<T> list, Consumer<T> c){
		for(T i: list){
		c.accept(i);
		}
		
	}
}

@FunctionalInterface
interface myClass{
	
	public void fun();
    // It can contain any number of Object class methods.  
	int hashCode();
    String toString();  

}



public class Lambda {
    public static void main(String[] args) {
    	
    	
    	myClass a=()->System.out.println("In myClass");
    	a.fun();
    	
    	System.out.println();
    	Lam1 var1=()->"hello";
    	
    	Lam1.forEach(
    			Arrays.asList(1,2,3,4,5),
    			(Integer i) -> System.out.println(i)
    			);
    	
    	System.out.println("zero argument :"+var1);
    	System.out.println(var1.method1());
    	System.out.println();
     	
    	Lam myObj=(int x,int z,String y)->{
        		Comparator<Integer> var=(ob, ob2) -> {
    			return Integer.compare(ob2,ob);};
    			System.out.println(y+" "
    					+Math.max(x, z)*Math.max(x, z));
    		};
    	myObj.abstractMethod(7,9,"Square of the maximum value is");
    	myObj.abstractMethod(8,10,"Square of the maximum value is");
//    ************************************************
    	System.out.println();
    	System.out.println("Functional Interfaces");
    	Runnable myRunnable = () -> System.out.println("Running "
    			+ "in a separate thread");
    	Thread myThread = new Thread(myRunnable);
        myThread.start();
//  **********************Collections and Streams********************************   
       
        System.out.println();
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.stream().map(name -> name.toUpperCase())
        			.forEach(System.out::println);
        
//*****************Functional Programming************************************        
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> squaredNumbers = numbers.stream()
                                             .map(x -> x * x)
                                             .collect(Collectors.toList());
        System.out.println("Squared Numbers:"+squaredNumbers);
//************************Filtering and Predicate*****************************        
        List<Integer> number =  new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        number.removeIf(n -> n % 2 == 0);
        System.out.println("After Removing: "+number);
        
//************************Comparator and Sorting*****************************        
       
        List<String> name = Arrays.asList("Alice", "ABob", "Charlie");
        name.sort((name1, name2) -> name1.compareTo(name2));
        System.out.println(name);
        
        
//********************Optional and Error Handling********************************        
       
        Optional<Object> Name = Optional.ofNullable(getName());
        Optional<Object>age=Optional.ofNullable(getAge());
        Name.ifPresentOrElse(
            n -> System.out.println("Name: " + n),
            () -> System.out.println("Name not available")
        );
        age.ifPresentOrElse(
                n -> System.out.println("Age: " + n),
                () -> System.out.println("age not available")
            );      


        
    Consumer<String> printUpperCase = 
    		str -> System.out.println(str.toUpperCase());
    printUpperCase.accept("hello");
    
    Consumer<String> len=str1->System.out.println(str1.length());
    len.accept("hey");
    
    
    BiConsumer<String, Integer> printStringLength = (str, length) ->
    System.out.println("Length of '" + str + "': " + str.length());
    printStringLength.accept("hello", 0);
     
    Predicate<Integer> isEven = num -> num % 2 == 0;
    System.out.println(isEven.test(4)); // true
    System.out.println(isEven.test(5)); // false
       
    
    Function<String, Integer> stringLength = str -> str.length();
    System.out.println(stringLength.apply("hello")); // 5
        
        
    Supplier<Double> randomValue = Math::random;
    Supplier<Integer> randomInt=()->(int)Math.random();
    System.out.println(randomValue.get()); 
    System.out.println(randomInt.get());
     
    
    IntSupplier random=()->(int)Math.random();
    BooleanSupplier randomBool=()->true;
    DoubleSupplier randomDouble =Math::random;
    System.out.println("IntSupplier:"+random.getAsInt());
    System.out.println("BooleanSupplier:"+randomBool.getAsBoolean());
    System.out.println("DoubleSupplier:"+randomDouble.getAsDouble());
    
    IntPredicate evenNumbers = (int i) -> i % 2 == 0;
    evenNumbers.test(1000);
    System.out.println("Unboxing:"+evenNumbers.test(1000));
    
    
    Predicate<Integer> oddNumbers = (Integer i) -> i % 2 == 1;
    oddNumbers.test(1000);
    System.out.println("Boxing:"+oddNumbers.test(1000));
    
    
    
    
    
    }

	private static Object getName() {
		return null;
	}
	private static Object getAge() {
		return 9;
		
		
	}
	
		
}
	
	
	

