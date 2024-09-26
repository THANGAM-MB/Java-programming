package MyPackage;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

//first class function
interface Square{
	   int square(int i);
	}

class person{
	int age=10;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public person(int age) {
		super();
		this.age = age;
	}
	public person() {
		
	}
	
	@Override
	public String toString() {
		return "person [age=" + age + "]";
	}

	public static person updateAge1(person person, int age){
		   System.out.println(person.getAge());
		   System.out.println("Non-Persistent way");	
		   person.setAge(age);
		   System.out.println(person.getAge());
		   System.out.println("person:"+person);
		   return person;
		}
	
		public static person updateAge(person pPerson, int age){
			System.out.println("Persistent way");	
		   person person = new person();
		   person.setAge(age);
		   System.out.println(person.getAge());
		   System.out.println("person:"+person);
		   System.out.println("pPerson:" +pPerson);
		   return person;
		}

}
public class FuncProgramming {
	 public static void main(String[] args) {
		 person per=new person();
		 person.updateAge1(per, 43);
		 person.updateAge(per, 56);
		 
		 
		 
		 
		 
		 int[] array = {1, 2, 3, 4, 5};
	      Square square = i -> i * i;
	      for(int i = 0; i < array.length; i++){
	         System.out.println(square.square(array[i]));
	      }
	   
	 //higher order function
	 int[] arr = {1, 2, 3, 4, 5};
     Function<Integer, Integer> square1 = t -> t * t;        
     Function<Integer, Integer> cube = t -> t * t * t;
     System.out.println("Square:");
     for(int i = 0; i < array.length; i++){
        print(square1, array[i]);
     }   
     System.out.println();
     System.out.println("Cube:");
     for(int j = 0; j < array.length; j++){
        print(cube, array[j]);
     }
     System.out.println();
     System.out.println("Pure function");
     
     
     //pure Function
     int a, b;
     a = 1;
     b = 2;
     
     System.out.println(sum(a, b));
    System.out.println("Pure Function");
    List<Integer> numbers=Arrays.asList(1,2,3,4); 
     int factor = 2;
     System.out.println(
         numbers.stream()
             .filter(number -> number % 2 == 0)
             .mapToInt(e -> e*factor)
             .sum());
      //factor = 3;
     
     
     
   System.out.println("Type Conversion");  
      Join<Integer,Integer,Integer> sum = (a2,b2) ->  a2 + b2;
      System.out.println(sum.compute(10,20));

      Join<String, String, String> concat = (a1,b1) ->  a1 + b1;
      System.out.println(concat.compute("Hello ","World!"));
     
      
      String url = "www.google.com";
      System.out.println(encodedAddress(url));
  
	 
 	 System.out.println("Stream Iteration:");
      Stream<Integer> num = Stream.iterate(0, n -> n + 3);

      num
         .limit(10)
         .forEach(n->System.out.println(n+" "));
	 
      
      
      
      
      System.out.println("Stream.of():");
      Stream<Integer> stream  = Stream.of(1, 2, 3, 4, 5);       
      stream.forEach(System.out::println);

      System.out.println("Collection.stream():");
      Integer[] num1 = {1, 2, 3, 4, 5};     
      List<Integer> list = Arrays.asList(num1);
      list.stream().forEach(System.out::println);

      System.out.println("StreamBuilder.build():");
      Stream.Builder<Integer> streamBuilder = Stream.builder();
      streamBuilder.accept(1);
      streamBuilder.accept(2);
      streamBuilder.accept(3);
      streamBuilder.accept(4);
      streamBuilder.accept(5);
      streamBuilder.build().forEach(System.out::println);    
	  
      System.out.println("Composition: ");
      
      Predicate<String> hasName = 
    		  text -> text.contains("name");
      Predicate<String> hasPassword =
    		  text -> text.contains("password");
      Predicate<String> hasBothNameAndPassword = 
    		  hasName.and(hasPassword);
      String queryString = "name=test;password=test";
      System.out.println(hasBothNameAndPassword
    		  .test(queryString));
	 
      
      Function<Integer, Integer> multiply = t -> t *3;
      Function<Integer, Integer> add = t -> t  + 3;
      Function<Integer, Integer> FirstAddThenMultiply =
    		  multiply.compose(add);
      Function<Integer, Integer> FirstMultiplyThenAdd =
    		  multiply.andThen(add);
      System.out.println(FirstMultiplyThenAdd.apply(3));
      System.out.println(FirstAddThenMultiply.apply(3));
     
      
      
      String stringQuery = "password=test";
      System.out.println(checkInEagerWay(hasName(stringQuery)
         , hasPassword(queryString)));
      System.out.println(checkInLazyWay(() -> hasName(stringQuery)
         , () -> hasPassword(queryString)));
   
      
      
      
      
      System.out.println("Sum using imperative way. Sum(5) : " + sum(5));
      System.out.println("Sum using recursive way. Sum(5) : " + sumRecursive(5));
   
      System.out.println("Tail recursion");
      printUsingTailRecursion(5);
	   
      
      System.out.println("Head recursion");
      printUsingHeadRecursion(5);
      
      System.out.println("Stream Parallelism");
      Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8 };
      List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(intArray));

      System.out.println("List using Serial Stream:");
      listOfIntegers
         .stream()
         .forEach(e -> System.out.print(e + " "));
      System.out.println("");

      System.out.println("List using Parallel Stream:");
      listOfIntegers
         .parallelStream()
         .forEach(e -> System.out.print(e + " "));
      System.out.println("");

      System.out.println("List using Another Parallel Stream:");
      listOfIntegers
         .stream()
         .parallel()
         .forEach(e -> System.out.print(e + " "));
      System.out.println("");

      System.out.println("List using Parallel Stream but Ordered:");
      listOfIntegers
         .parallelStream()
         .forEachOrdered(e -> System.out.print(e + " "));
         System.out.println(""); 
      
      
         String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday",
                 "Friday", "Saturday", "Sunday" };
              Function<Integer, String> getIndianWeekDay = getWeekDay(weekDays);
              System.out.println(getIndianWeekDay.apply(6)); 
              
              System.out.println("Currying");
              Function<Integer, Function<Integer, Function<Integer, Integer>>> 
              addNumbers = u -> v -> w -> u + v + w;             
           int result = addNumbers.apply(2).apply(3).apply(4);        
           System.out.println(result);
           
           System.out.println("Reducing");

           //1 * 2 * 3 * 4 = 24
           int product = IntStream.range(1, 5) 
        	         .reduce((Num1, Num2) -> Num1 * Num2)
        	         .orElse(-1); 

           
     	   //1 + 2 + 3 + 4 = 10
       	   int Sum =  IntStream.range(1, 5).sum();

       	   System.out.println("product :"+product);
       	   System.out.println("Sum: "+Sum);
           
              
              
       	 //with type declaration
           MathOperation addition = (int A, int B) -> A + B;
     		
           //with out type declaration
           MathOperation subtraction = (A, B) -> A - B;
     		
           //with curly braces
           MathOperation multiplication = (int A, int B) -> { return A * B; };
     		
           //without curly braces
           MathOperation division = (int A, int B) -> A / B;
     		
           System.out.println("10 + 5 = " + FuncProgramming.operate(10, 5, addition));
           System.out.println("10 - 5 = " + FuncProgramming.operate(10, 5, subtraction));
           System.out.println("10 x 5 = " + FuncProgramming.operate(10, 5, multiplication));
           System.out.println("10 / 5 = " + FuncProgramming.operate(10, 5, division));
     		
           //without parenthesis
           GreetingService greetService1 = message ->
           System.out.println("Hello " + message);
     		
           //with parenthesis
           GreetingService greetService2 = (message) ->
           System.out.println("Hello " + message);
     		
           greetService1.sayMessage("Mahesh");
           greetService2.sayMessage("Suresh");
           
           
           int inputNumber = 100;
           List<Long> perfectNumbers = findPerfectNumbers(inputNumber);

           System.out.println("Perfect numbers up to " + inputNumber + ": " + perfectNumbers);
           
           
        }
	 public static long sumOfFactors(long number) {
	        return LongStream.rangeClosed(1, number / 2)
	                .filter(i -> number % i == 0)
	                .sum();
	    }

	    public static List<Long> findPerfectNumbers(int number) {
	        return LongStream.rangeClosed(1, number)
	                .filter(i -> sumOfFactors(i) == i)
	                .boxed()
	                .collect(Collectors.toList());
	    }

	    
//	    ​ //Please don't do this​
//	    ​ names.stream().filter(name -> name.length() ==
//	    4).map(String::toUpperCase)...
	 
	 
	 
//	 public static List<Long> findPerfectNumbers(int number) {
//	        return LongStream.range(1, number)
//	                .filter(i -> LongStream.range(1, i)
//	                        .filter(j -> i % j == 0)
//	                        .sum() == i)
//	                .boxed()
//	                .collect(Collectors.toList());}
	 
	 
//	 public static List<Long> findPerfectNumbers(int number) {
//	        return LongStream.rangeClosed(1, number)
//	                .filter(i -> {
//	                    long factor = 0;
//
//	                    for (int j = 1; j < i; j++) {
//	                        if (i % j == 0) {
//	                            factor += j;
//	                        }
//	                    }
//
//	                    return factor == i;
//	                })
//	                .boxed()
//	                .collect(Collectors.toList());
//	    }
//	 
     	
        interface MathOperation {
           int operation(int a, int b);
        }
     	
        interface GreetingService {
           void sayMessage(String message);
        }
     	
        private static int operate(int a, int b, MathOperation mathOperation) {
           return mathOperation.operation(a, b);
        }             
              
              
           

           public static Function<Integer, String> getWeekDay(String[] weekDays){
              return index -> index >= 0 ? weekDays[index] : null;
           }
      
	   public static void printUsingHeadRecursion(int n){
	      if(n == 0) {
	    	  System.out.println("n:"+n);
	         return;}
	      else {
	    	  System.out.println("else n:"+n);
	         printUsingHeadRecursion(n-1);} 
	      System.out.println(n);
	   }
	   
	   

	   public static void printUsingTailRecursion(int n){
	      if(n == 0) 
	         return;
	      else
	         System.out.println(n);
	      printUsingTailRecursion(n-1);
	   }
	   
	   

   private static int sum(int n){
      int result = 0;
      for(int i = 1; i <= n; i++){
         result = result + i;
      }
      return result;
   }

   private static int sumRecursive(int n){
      if(n == 1){
         return 1;
      }else{
         return n + sumRecursive(n-1);
      }
   }

   private static boolean hasName(String queryString){
      System.out.println("Checking name: ");
      return queryString.contains("name");
   }

   private static boolean hasPassword(String queryString){
      System.out.println("Checking password: ");
      return queryString.contains("password");
   } 

   private static String checkInEagerWay(boolean result1, boolean result2){
      return (result1 && result2) ? "all conditions passed": "failed.";
   }

   private static String checkInLazyWay(Supplier<Boolean> result1, Supplier<Boolean> result2){
      return (result1.get() && result2.get()) ? "all conditions passed": "failed.";
   }
      
      
      
   public static String encodedAddress(String... address) {
      return Arrays.stream(address)
         .map(s -> {
			try {
				return URLEncoder.encode(s, "UTF-8");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
			return s;
		})
         .collect(Collectors.joining(","));
   }
	 
	 
   interface Join<K,V,R>{
      R compute(K k ,V v);
   }
   
   
   
	 private static int sum(int a, int b){
	      return a + b;
	   }
	 
	 
	 
  private static <T, R> void print(Function<T, R> function, T t ) {
     System.out.print(function.apply(t)+" ");
  }
}





//		 String url = "www.google.com";       
//	      System.out.println(encodedAddress(url));
//	   }   
//	   public static String encodedAddress(String... address) {
//	      return Arrays.stream(address)
//	         .map(wrapper(s -> URLEncoder.encode(s, "UTF-8")))
//	         .collect(Collectors.joining(","));
//	   }
//	   private static <T, R, E extends Exception> Function<T, R> 
//	   wrapper(FunctionWithThrows<T, R, E> fe) {
//	      return arg -> {
//	         try {
//	            return fe.apply(arg);
//	         } catch (Exception e) {
//	            throw new RuntimeException(e);
//	         }
//	      };
//	   }}
//	   @FunctionalInterface
//	   interface FunctionWithThrows<T, R, E extends Exception> {
//	      R apply(T t) throws E;
//	   }
