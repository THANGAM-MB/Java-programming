package MyPackage;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.*;
import java.util.logging.Logger;

public class StreamOperations {
	private static long counter;
	   
	   private void wasCalled() {
	          counter++;
	      } 
	   private static final Logger log = Logger.getLogger(StreamOperations.class.getName());

	public static void main(String args[])
	    {
		StreamOperations Str=new StreamOperations();
	        List<Integer> number = Arrays.asList(2, 3, 4, 5,6,7); 
	        List<Integer> square = number.stream()
	            .map(x -> x * x)
	            .collect(Collectors.toList());
	        System.out.println("Square:" +square);
	        
	        List<String> names = Arrays.asList
	        		("Reflection", "Collection", "Stream");
	        List<String> result = names.stream()
	            .filter(s -> s.startsWith("S"))
	            .collect(Collectors.toList());
	        System.out.println("Start with 's': "+result);
	 
	        List<String> show = names.stream()
	            .sorted()
	            .collect(Collectors.toList());
	       
	        System.out.println("Sorting:" +show);
	 
	        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 2);
	 	    Set<Integer> squareSet = numbers.stream()
	            .map(x -> x * x)
	            .collect(Collectors.toSet());
	       
	        System.out.println("squareSet: "+squareSet);
	 
	        System.out.println("forEach Method");
	        numbers.stream()
	            .map(x -> x * x)
	            .forEach(y -> System.out.println(y));
	  	   
			OptionalInt reduced =
				  IntStream.range(1, 4).reduce((a, b) -> a + b);
			System.out.println("Intgervalue: "+reduced);
		
	        int even = number.stream()
	            .filter(x -> x % 2 == 0)
	            .reduce(1, (j, i) -> j*i);

	        System.out.println("Even: "+even);
	        
	      long startTime1= System.currentTimeMillis();
			int reducedParams = Stream.of(1, 2, 3)
					
					  .reduce(10, (a, b) -> a + b, (a, b) -> {
						 System.out.println("In reducedParams");
					     log.info("reducedParams combiner was called");
					     return a + b;
					  });
			long endTime1= System.currentTimeMillis();
			 long streamTime =endTime1-startTime1;
			 System.out.println("startTime1: "+startTime1);
			 System.out.println("endTime1: "+endTime1);
			 System.out.println("streamTime: "+streamTime);

			System.out.println("reducedParams: "+reducedParams);
			
		      long startTime2= System.currentTimeMillis();

			int reducedParallel = Arrays.asList(1, 2, 3).parallelStream()
				    .reduce(10, (a, b) -> a + b, (a, b) -> {
				       log.info("reducedParallel combiner was called");
				       return a + b;
				    });
			long endTime2= System.currentTimeMillis();
			 long parallelstreamTime =endTime2-startTime2;
			 System.out.println("startTime2: "+startTime2);
			 System.out.println("endTime2: "+endTime2);
			 System.out.println("parallelstreamTime: "+parallelstreamTime);

			System.out.println("reducedParallel: "+reducedParallel);
			
	        Optional<String> longName =names.stream()
	        		.reduce((string1 , string2 )-> string1.length()> string2.length() ? string1:string2);
	        System.out.println("longName: "+longName);
	       
//******************************************************
//		Stream of Collection
//		We can also create a stream of any type of Collection (Collection, List, Set):
	        Collection<String> collection = Arrays.asList("a", "b", "c");
	        Stream<String> streamOfCollection = collection.stream();
	        System.out.println("streamOfCollection: "+streamOfCollection);
	        List<String> streamOfCollection1=collection.stream()
		            .collect(Collectors.toList());
	        System.out.println("streamOfCollection1: "+streamOfCollection1);
//	     Stream of Array
//	     An array can also be the source of a stream:
	        Stream<String> streamOfArray = Stream.of("a", "b", "c");
	        List<String> streamofarray =streamOfArray.collect(Collectors.toList());
	        System.out.println("streamOfArray: "+streamofarray);
//       create a stream out of an existing array or of part of an array
	        String[] arr = new String[]{"a", "b", "c"};
	        Stream<String> streamOfArrayFull = Arrays.stream(arr);
	        List<String> streamofarrayfull=streamOfArrayFull.collect(Collectors.toList());
	        System.out.println("streamOfArrayFull: "+streamofarrayfull);

	        
	        Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3);
	        List<String> streamofarraypart=streamOfArrayPart.collect(Collectors.toList());
	        System.out.println("streamOfArrayPart: "+streamofarraypart);

//	     Stream.builder()
	        
//	     When builder is used, the desired type should be additionally specified in the 
//	     right part of the statement, otherwise the build() method will create an  
//	     instance of the Stream<Object>
	        
	        Stream<String> streamBuilder =Stream.<String>builder()
	        		.add("Hello").add("welcome").add("Everyone").build();
	   
	        List<String> streambuilder=streamBuilder.toList();
	        System.out.println("streamBuilder: "+streambuilder);
//	     Stream.generate()
	        
//	     The generate() method accepts a Supplier<T> for element generation.
//	     As the resulting stream is infinite, the developer should specify
//	     the desired size, or the generate() method will work until it 
//	     reaches the memory limit
	        
	        Stream<String> streamGenerated = Stream.generate(() -> "print")
	        		  						.limit(4);
	        List<String> streamgenerated=streamGenerated.toList();
	        System.out.println("streamGenerated: "+streamgenerated);
	    
//	     Stream.iterate()
	        
//	     Another way of creating an infinite stream is by using the 
//	     iterate() method
	    
	        Stream<Integer> streamIterated = Stream.iterate(40, n -> n + 2)
	        								.limit(5);
	        List<Integer> streamiterated=streamIterated.toList();
	        System.out.println("streamIterated: "+streamiterated);

//**************************Stream of Primitives***********************************	        
	        IntStream intStream = IntStream.range(1, 3);
	        int[] intstream= intStream.toArray(); 	    		
	        System.out.println("intStream: "+Arrays.toString(intstream));
	        System.out.println(intStream);
	  
	        
	        LongStream longStream = LongStream.rangeClosed(1, 3);
	        long[] longstream=longStream.toArray();
	        System.out.println("longStream: "+Arrays.toString(longstream));

	        Random random = new Random();
	        DoubleStream doubleStream = random.doubles(3);
	        System.out.println("doubleStream: "
	        				+Arrays.toString(doubleStream.toArray()));
	        DoubleStream doubleStreamRange = random.doubles(2,7,9);
	        System.out.println("doubleStreamRange: "
	        				+Arrays.toString(doubleStreamRange.toArray()));
	        
	        IntStream streamOfChars = "abc".chars();
	        System.out.println("charactors integer values");
	        streamOfChars.forEach(value -> System.out.print(value+" "));
	        System.out.println();	        
	        
	        Stream<String> streamOfString =
	        		  Pattern.compile(",").splitAsStream("abcc,h,l");
	        System.out.println("charactors String values");
	        streamOfString.forEach(d -> System.out.print(d+" "));
	        System.out.println();
	        
	        Stream<String> streamffString =
	        		  Pattern.compile("h").splitAsStream("abcc,h,l");
	        System.out.println("charactors String values");
	        streamffString.forEach(d -> System.out.print(d+" "));
	        System.out.println();
//**************************Referencing Stream***********************************	        
	        Stream<String> stream = Stream.of("a", "bc", "b")
	        		.filter(element -> element.contains("b"));
	       Optional<String> anyElement = stream.findAny();
	       System.out.println("anyElement: "+ anyElement);
	       
	       
	        Stream<String> first = Stream.of("abc", "bc", "b");
	        Optional<String> FirstElement = first.findFirst();
	        System.out.println("FirstElement: "+ FirstElement);
	        
//	        streams can’t be reused but collectors can be reused.
	        List<String> elements = Stream.of("a", "b", "cd")
	        		    .collect(Collectors.toList());
	        		Optional<String> anyelement = elements.stream().findAny();
	     	        System.out.println("In collectors: anyElement: "+ anyelement);
	        		Optional<String> firstelement = elements.stream().findFirst();
	    	        System.out.println("In collectors: FirstElement: "+ firstelement);
     
	    	Stream<String> onceModifiedStream = Stream.of("abcd", "bbcd", "cbcd")
	    									.skip(1)
	    									.skip(1);
	        List<String> Skip=onceModifiedStream.toList();
	        System.out.println("Skip: "+Skip); 
	        
	        Stream<String> twiceModifiedStream = Stream.of("abcd", "bbcd", "cbcd")
	        		.skip(1).map(element -> element.substring(0, 3));
	        List<String> twiseSkip = twiceModifiedStream.toList();
	        System.out.println("twiseSkip: "+twiseSkip); 

	        List<String> list = Arrays.asList("abc1", "abc2", "abc3");
	        long size = list.stream().skip(1)
			          .map(element -> element.substring(0, 3))
			          .sorted()
			          .count();
	        System.out.println("Size: "+size);
	        List<String> value =Arrays.asList("abc1", "abc2", "abc3");
	        Stream<String> val = value.stream().skip(1)
			          .map(element -> element.substring(1, 4))
			          .sorted();
	        List<String> valList=val.toList();
 	        System.out.println("valList: "+valList);

 	        
	        List<String> values =Arrays.asList("abc1", "abc2", "abc3");
 	       	counter = 0;
 	       	Stream<String> streams = values.stream().filter(element -> {
 	       			Str.wasCalled();
 	       			return element.contains("2");
 	       		}); 
 	       	List<String> Streams=streams.toList();
 	        System.out.println("Streams: "+Streams);

 	        
 	       List<String> logStream = list.stream().filter(element -> {
 	    	    log.info("filter() was called");
 	    	    return element.contains("2");
 	    	}).map(element -> {
 	    	    log.info("map() was called");
 	    	    return element.toUpperCase();
 	    	}).collect(Collectors.toList());

	        System.out.println("logStream: "+logStream);
      
	    }
	}

