package MyPackage;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

class MyClass {
    // Static method
    public static String staticMethod(String s) {
        return s;
    }

    // Instance method of a particular object
     public String instanceMethod(String s) {
        System.out.println(s);
        return s;
    }

    // Instance method of an arbitrary object of a particular type
    public int arbitraryObjectInstanceMethod(String s) {
        return s.length();
    }
}

public class MethodReference {
    public static void main(String[] args) {
        // Static Method Reference
        Function<String, String> staticReference = MyClass::staticMethod;
        System.out.println("Static Method Reference: " + staticReference.apply("123"));

        // Instance Method Reference of a Particular Object
        MyClass instance = new MyClass();
        Consumer<String> instanceReference = instance::instanceMethod;
        instanceReference.accept("Instance Method Reference");

        // Instance Method Reference of an Arbitrary Object of a Particular Type
        List<String> words = Arrays.asList("apple", "banana", "orange");
        List<Integer> lengths = words.stream().map(String::length).collect(Collectors.toList());
        System.out.println("Instance Method Reference of an Arbitrary Object: " + lengths);

        // Constructor Reference
        Supplier<MyClass> constructorReference = MyClass::new;
        MyClass myObject = constructorReference.get();

        // Reference to an Instance Method of an Arbitrary Object of a Particular Type
        Function<String, Integer> arbitraryObjectInstanceReference = instance::arbitraryObjectInstanceMethod;
        System.out.println("Arbitrary Object Instance Method Reference: " + arbitraryObjectInstanceReference.apply("Java"));

        
        
    }
}

