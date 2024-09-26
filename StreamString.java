package MyPackage;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


class Product{
	public int Price;
	public String name;
	public int getPrice() {
		return Price;
	}
	public Product() {
		
	}	
	public Product(int price, String name) {
		super();
		Price = price;
		this.name = name;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	 enum price{
		 LOW(13), MEDIUM(14), HIGH(23);
        int Price;
		price(int Price) {
			this.Price=Price;
		}
	    }
}
public class StreamString {
	
	Product product = new Product();
	public static void main(String[] args) {
		List<Product> productList = Arrays.asList(new Product(23, "potatoes"),
				  new Product(14, "orange"), 
				  new Product(13, "lemon"),
				  new Product(23, "bread"), 
				  new Product(13, "sugar"));
	
		List<String> collectorCollection = productList.stream()
				.map(Product::getName)
				.collect(Collectors.toList());
		System.out.println("collectorCollection: "+collectorCollection);
		
		String listToString = productList.stream()
				.map(Product::getName)
				.collect(Collectors.joining(", ", "[", "]"));
		System.out.println("listToString: "+listToString);		
			
		
		
//************************************Flat Map*****************************************************		
		List<Integer> numbers1 = Arrays.asList(1, 2, 3);
		List<Integer> numbers2 = Arrays.asList(3, 4);
		List<int[]> pairs = numbers1.stream()
							.flatMap(i -> numbers2.stream()
									.map(j -> new int[]{i, j})
									)
							.collect(Collectors.toList());
		for (int[] map : pairs) {
			System.out.println("flatMap: "+Arrays.toString(map));
		}
		List<List<Integer>> listOfLists = Arrays.asList(
				  Arrays.asList(1, 2, 3),
				  Arrays.asList(4, 5),
				  Arrays.asList(6, 7, 8)
				);
				List<Integer> flattenedList = listOfLists.stream()
				  .flatMap(list -> list.stream())  // Flattening step
				  .toList();
				System.out.println("Flattened list: " + flattenedList);
		
		int peek= IntStream.range(1, 6)
	            .peek(i -> System.out.println("Before map: " + i))
	            .map(i -> i * i)
	            .peek(i -> System.out.println("After map: " + i))
	            .sum();
		System.out.println("Sum of After peek: "+peek);
		

		List<Integer> intList = Arrays.asList(2, 4, 5, 6, 8);
	    Map<Boolean, List<Integer>> isEven = intList.stream().collect(
	      Collectors.partitioningBy(i -> i % 2 == 0));
	    System.out.println(isEven);
	    
	   
//	    
//		Map<Product,List<Product>> groupByPrice1= productList.stream()
//				  .collect(groupingBy(price::getPrice));
	
	    
	    
		 Map<Object, List<Object>> groupByPrice = productList.stream()
	                .collect(Collectors.groupingBy(p ->p.getPrice(),
	                        Collectors.mapping(p -> p.getName(), Collectors.toList())));
	     groupByPrice.forEach((price, products) -> {
	               System.out.println("Products with price " + price + ":");
	               products.forEach(System.out::println);
	              });
	     System.out.println(groupByPrice.toString());

	     
	     
//	     List<Product> products = productList.stream()
//	    	      .collect(Collectors.toList());
//	    	    assertEquals(products.get(0).getName(), "potatoes");
//	    	    assertEquals(products.get(1).getName(), "potatoes");
//	    	    assertEquals(products.get(2).getName(), "potatoes");
//	    String productName = productList.toString();
//	    	products.forEach(product -> {
//		          products.forEach(System.out::println);
//		        });    
//	    	System.out.println(productName); 
	 
	    	
	    	Map<Object, Integer> groupByPrices = productList.stream()
	                .collect(Collectors.groupingBy(p ->p.getPrice(),
	                		Collectors.summingInt(Product::getPrice)));
	                       
	     groupByPrices.forEach((price, productSummingPrice) -> {
	               System.out.println("Products with price " 
	            		   				+ price + ":" +productSummingPrice);
	              });
	    	
	       	Double averagePrice = productList.stream()
	       			.collect(Collectors.averagingInt(p -> p.getPrice()));
	    	System.out.println("AveragePrice: "+averagePrice);
	    	
	    	Optional<Product> maxPriceProduct =productList.stream()
	    			.collect(Collectors.maxBy(Comparator.comparingInt(p->p.getPrice())));
	    	Optional<Integer> maxPrice = maxPriceProduct.map(p->p.getPrice());
	         System.out.println("Max Price: " + maxPrice);
	    	
	
	
	
	
	
	
	
	
	
	
	
	}
		
	private static void assertEquals(String actual, String expected) {
        if (!actual.equals(expected)) {
            throw new AssertionError("Assertion failed: expected <" + expected + ">, but was <" + actual + ">");
        }
}	}
