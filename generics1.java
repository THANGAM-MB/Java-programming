package MyPackage;

public class generics1<KeyType, ValueType> {
  
    private final KeyType key;
    private final ValueType value;

    public generics1(KeyType key, ValueType value) {  
        this.key = key;
        this.value = value;
    }

    public KeyType getKey() {
        return key;
    }

    public ValueType getValue() {
        return value;
    }

    public String toString() { 
        return "(" + key + ", " + value + ")";  
    }

public static void main(String[] args) {
final generics1<String, String> grade = new generics1<String, String>("Mike", "A");
final generics1<String, Integer> mark = new generics1<String, Integer>("Mike", 100);
System.out.println("grade: " + grade);
System.out.println("mark: " + mark);

final generics1<Integer, Boolean> prime = new generics1<Integer, Boolean>(13, true);
if (prime.getValue()) {
    System.out.println(prime.getKey() + " is prime.");
}
else {
    System.out.println(prime.getKey() + " is not prime.");
}}}
