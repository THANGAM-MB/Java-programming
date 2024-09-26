package MyPackage;

import java.io.IOException;
import java.util.stream.Stream.Builder;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


class employee{
	
	int empId;
	String empName;
	double empSalary;
	
	public employee() {
		
	}
	
	public employee(int empId, String empName, double empSalary) {
		this.empId=empId;
		this.empName=empName;
		this.empSalary=empSalary;
	}

	
	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public double getEmpSalary() {
		return empSalary;
	}


	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}


	@Override
	public String toString() {
		return "employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}

	enum GroupingCriteria {
	    SALARY,
	    NAME
	}
	
	enum SALARY{
		Min,
		Medium,
		Max
	}
	
}


public class StreamMethods {
	
	
	public static void main(String[] args) throws IOException {
		employee emp=new employee();
		List<employee> emps = Arrays.asList(
			    new employee(1, "Jeff Bezos", 100000.0), 
			    new employee(2, "Bill Gates", 200000.0), 
			    new employee(3, "Mark Zuckerberg", 300000.0),
			    new employee(4,"Devid",100000.0)
			);
		
//**************************summarizingDouble**********************************		
		
		List<Double> numbers = List.of(2.5, 3.0, 4.5, 1.5, 2.0);

        DoubleSummaryStatistics stats = numbers.stream()
                .collect(Collectors.summarizingDouble(Double::doubleValue));

        System.out.println("Count: " + stats.getCount());
        System.out.println("Sum: " + stats.getSum());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Average: " + stats.getAverage());
        System.out.println("Max: " + stats.getMax());
		
		
        List<String> words = Arrays.asList("apple", "banana", "grape", "kiwi", "orange");

        Map<Boolean, List<String>> partitionedWords = words.stream()
                .collect(Collectors.partitioningBy(word -> word.length() > 4));
        System.out.println("Short words: " + partitionedWords.get(false));
        System.out.println("Long words: " + partitionedWords.get(true));
		
        List<Integer> wordLengths = words.stream()
                .collect(Collectors.mapping(String::length, Collectors.toList()));
        System.out.println("Word Lengths: " + wordLengths);
      
		boolean allmatch= emps.stream()
				.allMatch(d -> d.getEmpSalary()==300000);
		System.out.println("allmatch: "+allmatch);
		
		boolean anyMatch =emps.stream()
				.anyMatch(d -> d.getEmpName()=="Jeff Bezos");
		System.out.println("anyMatch: "+anyMatch);

		boolean noneMatch =emps.stream()
				.noneMatch(d ->d.getEmpId()==1);
		System.out.println("noneMatch: "+noneMatch);

		double maxSalary =  emps.stream()
				.mapToDouble(employee::getEmpSalary)
				.max()
				.orElse(1);
		System.out.println("MaxSalary: "+maxSalary);
		
//		int a=3;
//		
//		Stream<int[]> box=IntStream.rangeClosed(1, 100)
//		.filter(b ->Math.sqrt( a*a + b*b) % 1 == 0)
//		.boxed()
//		.map(b -> new int[]{a, b, (int) Math.sqrt(a * a + b * b)});
//		
//		box.forEach(triplet -> System.out.println(
//	                "Pythagorean Triplet: " + triplet[0] + ", " + triplet[1] + ", " + triplet[2]));
//		
		
		
		Stream<int[]> pythagoreanTriples =
				IntStream.rangeClosed(1, 100).boxed()
				.flatMap(a ->
				IntStream.rangeClosed(1, 100)
				.filter(b -> Math.sqrt(a*a + b*b) % 1 == 0)
				.mapToObj(b ->
				new int[]{a, b, (int)Math.sqrt(a * a + b * b)})
				)
				.limit(3);
		pythagoreanTriples.forEach(triplet -> System.out.println(
               "Pythagorean Triplet: " + triplet[0] + ", " 
            		   	+ triplet[1] + ", " + triplet[2]));
		
		
		int[] number = {2, 3, 5, 7, 11, 13};
		int sum = Arrays.stream(number).sum();
		System.out.println("Sum: "+sum);
		
//**********************Streams from files****************************************		
		
		
		System.out.println("Streams from files:");
		List<String> uniqwords;
		try(Stream<String> lines =
				Files.lines(Paths.get("/home/thangam/Documents/NF.txt"), 
						Charset.defaultCharset())){
				uniqwords = lines.flatMap(line -> Arrays.stream(line.split(" ")))
								.distinct()
								.collect(Collectors.toList());
				
		//	List<String> word =lines.toList();	
				System.out.println(uniqwords);
		}
		catch(Exception e){
			System.out.println("IO exception");

		}
		
		
//**************************Fibonacci*******************************************	
		
	System.out.println("Fibonacci series");	
		Stream.iterate(new int[]{0, 1},
				t -> new int[]{t[1], t[0]+t[1]})
				.limit(5)
				.forEach(t -> System.out.print(t[0]+" "));
		System.out.println();
		
		
		Stream<Integer> stream = Arrays.asList(1, 2, 3, 4, 5, 6).stream();
		List<Integer> num = stream.reduce(new ArrayList<Integer>(),
				(List<Integer> l, Integer e) -> {
					l.add(e);
					return l; },
				(List<Integer> l1, List<Integer> l2) -> {
					l1.addAll(l2);
					return l1; });
		System.out.println("Number: "+num);
		
		 Stream<Integer> str = Arrays.asList(1, 2, 3, 4, 5, 6).stream();
	                List<Integer> nums = str.collect(
	                        ArrayList::new,
	                        List::add,
	                        List::addAll);

	        System.out.println("Num: "+num);
		
		
	        
	        
	        String shortName = emps.stream().map(employee::getEmpName)
	        		.collect(Collectors.joining());    
	        System.out.println("ShortName: "+shortName);
	        
	        
	        String shortMenu = emps.stream().map(employee::getEmpName)
	        		.collect( Collectors.reducing( (s1, s2) -> s1 + s2 ) ).get();
	        System.out.println("shortName1: "+shortMenu);
	        
//	        
//	        String fullName = emps.stream()
//	        		.collect( Collectors.reducing( (d1, d2) -> 
//	        			d1.getEmpName() + d2.getEmpName() ) ).get();
//	        System.out.println("FullName: "+fullName);
	        	        
	        
	        String sName = emps.stream()
	        		.collect( Collectors.reducing( "",employee::getEmpName, 
	        				(s1, s2) -> s1 + s2 ) );	
	        System.out.println("ShortName2: "+sName);
	        
	        
//***************************Streams Joining***********************************************************	        
	        Stream<Integer> stream1 = Stream.of(1, 2, 3);
	        Stream<Integer> stream2 = Stream.of(4, 5, 6);

	        Stream<Integer> combinedStream = Stream.concat(stream1, stream2);
	        List<Integer> CombinedStream=combinedStream.toList();
	        System.out.println("CombinedStream: "+CombinedStream);
	        
	        
	        
	        List<Stream<Integer>> listOfStreams = Arrays.asList(
	                Stream.of(1, 2, 3),
	                Stream.of(4, 5, 6)
	        );
	        Stream<Integer> combineStream = listOfStreams.stream().flatMap(s -> s);
	        List<Integer> CombineStream = combineStream.toList();
	        System.out.println("CombineStream: "+CombineStream);
	        
	        Stream<Integer> stream3 = Stream.of(1, 2, 3);
	        Stream<Integer> stream4 = Stream.of(4, 5, 6);
      	        
	        Builder<Integer> streamBuilder = Stream.builder();
	        stream3.forEach(streamBuilder);
	        stream4.forEach(streamBuilder);
	        
	        System.out.print("StreamBuildercombine: ");
	        Stream<Integer> comStream = streamBuilder.build();
	        comStream.forEach(d ->System.out.print(d+" "));
	        System.out.println();
	        
	        Map<Boolean, Map<Object, Map<Double, Map<String, List<employee>>>>> partition=
	        		emps.stream()
	        		.collect(Collectors.partitioningBy((e->e.getEmpSalary()>200000.0),
	        				Collectors.groupingBy(
	                                person -> {
	                                	if (person.getEmpSalary()==100000.0) {
	                                		//System.out.println("max");
	                                		return employee.SALARY.Min;
	                                	}
	                                	else if(person.getEmpSalary()<3000000.0 
	                                			&& person.getEmpSalary()>100000.0) {
	                                		return employee.SALARY.Medium;
	                                	}
	                                	else {
	                                		System.out.println(person.getEmpSalary());
	                                		return employee.SALARY.Max;
	                                	}}
	                                	,Collectors.groupingBy(employee::getEmpSalary,
	        						Collectors.groupingBy(employee::getEmpName)))));
	        System.out.println(partition);
	       
//***********************TakeWhile & dropwhile****************************
	        System.out.println("takeWhile");
	        Stream.iterate(1, i -> i + 1)
            .takeWhile(n -> n <= 3)
            .map(x -> x * x)
            .forEach(d ->System.out.print(d+" "));
	        System.out.println();
	        System.out.println("dropWhile");
	       
	        Stream.of(1,2,3,4,5,6,7,8,9)
	        .dropWhile(x -> x <= 5)
            .forEach(d ->System.out.print(d+" "));
	        System.out.println();
	        
	        Integer n = null;
	        Stream<Integer> result = Stream.ofNullable(n);
	        result.map(x -> x * x).forEach(System.out::println); 
	        
	        Integer i=null;
	        Stream<Integer> res = Stream.empty();
	        		res.map(x -> x * x).forEach(System.out::println); 
	        		
	        
	
//**Collecting statistical information about stream’s elements******************
	
	        IntSummaryStatistics statistics = emps.stream()
	        		  .collect(Collectors.summarizingInt(employee::getEmpId));
	
	        System.out.println("IntSummaryStatistics: "+statistics);
	
	        DoubleSummaryStatistics statistic = emps.stream()
	        		  .collect(Collectors.summarizingDouble(employee::getEmpSalary));
	
	        System.out.println("DoubleSummaryStatistics: "+statistic);
	
	        
	        
	        Set<employee> unmodifiableSet1 = emps.stream()
	        		  .collect(Collectors.collectingAndThen(Collectors.toSet(),
	        		   Collections::unmodifiableSet
	        				  ));
	        System.out.println(unmodifiableSet1);		

	
	
	
	
	
	
	
	
	
	}
}
