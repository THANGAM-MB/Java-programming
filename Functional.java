package MyPackage;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class PersistentList<T> {
    private final List<T> elements;

    public PersistentList(List<T> elements) {
        this.elements = Collections.unmodifiableList(new ArrayList<>(elements));
    }

    public PersistentList<T> add(T element) {
        List<T> newElements = new ArrayList<>(this.elements);
        newElements.add(element);
        return new PersistentList<>(newElements);
    }

    public List<T> getElements() {
        return elements;
    }
}

class PersistentMap<K, V> {
    private final Map<K, V> entries;

    public PersistentMap(Map<K, V> entries) {
        this.entries = Collections.unmodifiableMap(new HashMap<>(entries));
    }

    public PersistentMap<K, V> put(K key, V value) {
        Map<K, V> newEntries = new HashMap<>(this.entries);
        newEntries.put(key, value);
        return new PersistentMap<>(newEntries);
    }

    public Map<K, V> getEntries() {
        return entries;
    }
}

class Person{
	int id;
	String Name;
	public Person() {
		
	}
	public Person(int id, String name) {
		super();
		this.id = id;
		Name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	
	
}
public class Functional {
	public static void main(String[] args) { 
		PersistentList<Integer> list1 = new PersistentList<>(List.of(1, 2, 3));
		PersistentList<Integer> list2 = list1.add(4);

		System.out.println(list1.getElements());  
		System.out.println(list2.getElements());  
		
	
		PersistentMap<String, Integer> map1 = new PersistentMap<>(Map.of("a", 1, "b", 2));
		PersistentMap<String, Integer> map2 = map1.put("c", 3);

		System.out.println(map1.getEntries());  
		System.out.println(map2.getEntries()); 
	   
		List<Person> personList=Arrays.asList(
				new Person(1,"deva"),
				new Person(2,"Priya"),
				new Person(3,"Praveen")); 
	
		String url = "www.google.com com";
	      System.out.println("encodedAddress: "+encodedAddress(url));
	      System.out.println("encodedString: "+encodedString(url));
	   }   

	   public static String encodedString(String... address) {
	      return Arrays.stream(address)
	         .map(s -> {
				try {
					return URLEncoder.encode(s, "UTF-8");
				} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return null;
			})
	         .collect(Collectors.joining(","));
	   }
	   public static String encodedAddress(String... address) {
		      return Arrays.stream(address)
		         .map(s -> encodedString(s))
		         .collect(Collectors.joining(","));
		   }

}
