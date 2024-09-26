package MyPackage;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;



class Apple{
	private String appleColor;
	private Double appleRate;
	public Apple() {
		
	}
	public Apple(Double appleRate) {
		this.appleRate=appleRate;
	}
	public Apple(String appleColor) {
		this.appleColor=appleColor;
	}
	
	public Apple(String appleColor, Double appleRate) {
		super();
		this.appleColor = appleColor;
		this.appleRate = appleRate;
	}
	public String getAppleColor() {
		return appleColor;
	}
	public void setAppleColor(String appleColor) {
		this.appleColor = appleColor;
	}
	public Double getAppleRate() {
		return appleRate;
	}
	public void setAppleRate(Double appleRate) {
		this.appleRate = appleRate;
	}
	
	public String toString() {
		return appleColor+appleRate;
	}
	public static Apple newwApple() {
		
        return new Apple("Red", 150.0);
	}
	public String newApple(String s,Double d) {
		System.out.println( s+" "+d);
		return s+" "+d;
	}
	
}
class Orange{
	private String orangeColor;
	private Double orangeRate;
	
	public Orange() {
		
	}
	public Orange(Double orangeRate) {
		this.orangeRate=orangeRate;
	}
	public Orange(String orangeColor) {
		this.orangeColor=orangeColor;
	}
	
	public Orange(String orangeColor, Double orangeRate) {
		super();
		this.orangeColor = orangeColor;
		this.orangeRate = orangeRate;
	}

	public String getOrangeColor() {
		return orangeColor;
	}

	public void setOrangeColor(String orangeColor) {
		this.orangeColor = orangeColor;
	}

	public Double getOrangeRate() {
		return orangeRate;
	}

	public void setOrangeRate(Double orangeRate) {
		this.orangeRate = orangeRate;
	}
	
	
}

public class LambdaUsage {
	public static void main(String[] args) {
		List<Apple> apple=Arrays.asList(
				new Apple("green",100.0),
				new Apple("Red",110.0),
				new Apple("green",300.0),
				new Apple("Red",300.0),
				new Apple("yellow",360.0));
		
		List<Orange> orange=Arrays.asList(
				new Orange("orange",100.0),
				new Orange("liteorange",110.0));
		
		
		
		String s=null,s1=null; Double i=0.0,i1=0.0;
		Apple myApple=new Apple();
		Orange myOrange=new Orange();
		
		Apple newApple =new Apple(s, i);
		Orange newOrange= new Orange(s1,i1);
		
		Supplier<Apple> c22=()->new Apple();
		Apple a1 = c22.get();
		System.out.println("a1: "+a1);
		
		Supplier<Apple> s21=()->myApple.newwApple();
		Apple s22 =s21.get();
		System.out.println("s22: "+s22);
				
		Supplier<Apple> S11=()->new Apple("Red",900.0);
		Apple S12=S11.get();
		System.out.println("S12"+S12);
		
		
		Supplier<Apple> c=Apple::new;
		Apple ac=c.get();
		System.out.println("ac: "+ac);
//		Predicate<Apple> redAndHeavyApple =
//		redApple.and(a -> a.getWeight() > 150);
		Supplier<String> s11=new Apple()::getAppleColor;
		String s12=s11.get();
		System.out.println("s12: "+s12);
		
		Supplier<Apple> cc=Apple::newwApple;
		Apple cc1=cc.get();
		System.out.println("cc1: "+cc1);
				
		Function<Double, Apple> c2 = Apple::new;
		Apple a2 = c2.apply(310.0);
		System.out.println("a2:  "+a2);
		
		BiFunction<String,Double,String> f1=new Apple()::newApple;
		String f2=f1.apply("red", 500.0);
		System.out.println("f2: "+f2);
		
		System.out.println("Consumer");
		Consumer<String> k1=new Apple()::setAppleColor;
		k1.accept("pink");
		System.out.println(k1);
		
		BiConsumer<String, Double> k2=new Apple()::newApple;
		k2.accept("green", 800.0);
		
		System.out.println("predicate");
		Predicate<Apple> p1= p->p.getAppleRate()==150.0;
		p1.test(cc1);
		System.out.println(p1.test(cc1));
		
		
		List<Apple> app=apple.stream()
				.collect(Collectors.toList());
		System.out.println(app);
		
		
		System.out.println("Sorting");
		apple.sort(Comparator.comparing(Apple::getAppleRate).reversed());
		apple.stream().forEach(a->System.out.print(a+" "));
		System.out.println();
		
		System.out.println("CHAINING COMPARATORS");
		apple.sort(Comparator.comparing(Apple::getAppleRate)
				.reversed()
				.thenComparing(Apple::getAppleColor));
		apple.stream().forEach(a->System.out.print(a+" "));
		
		
		System.out.println("Composing predicates");
		System.out.println("Negate");
		Predicate<Apple> YellowApple = a->a.getAppleColor().equals("yellow");
		boolean Yellow =YellowApple.test(new Apple("yellow"));
		System.out.println(Yellow);
		Predicate<Apple> notYellowApple =YellowApple.negate();
		boolean notYellow =notYellowApple.test(new Apple("yellow"));
		System.out.println(notYellow);
		
		
		Predicate<Apple> redApple = a->a.getAppleColor().equals("yellow");
		boolean Red =redApple.test(new Apple("Red"));

		Predicate<Apple> redRate=a->a.getAppleRate()>800.0;
        //System.out.println("inside prediacte: "+redRate.test(Red));	
        
        BiPredicate<Integer,Integer> bbbb=(a,b)->(a+b)>5;
        System.out.println("BiPredicate: "+bbbb.test(4, 9));
        
        
		
		Predicate<Apple> rate=a->a.getAppleRate()>800.0;
		Predicate<Apple> colorAndRate=YellowApple.and(rate);
		System.out.println("predicate and: "+colorAndRate.test(new Apple("Red",900.0)));
		Predicate<Apple> colorOrRate=YellowApple.or(rate);
		System.out.println("predicate or: "+colorOrRate.test(new Apple("Red",900.0)));

		

		Predicate<String> pp=a->a.equals("Red");
		
		Predicate<Boolean> pp1=a->a.equals(true);
		boolean res1 = pp.test("Red");
		System.out.println("predicate: "+pp1.test(res1));
		//System.out.println("predicate: "+pp1.test(pp));
		
		
		
		
		
		BinaryOperator<Integer> sumCombiner = (a, b) -> a + b;
		int res=sumCombiner.apply(5, 6);
		System.out.println("sumCombiner: "+res);
		
		BinaryOperator<String> concatenate = (str1, str2) -> str1 + str2;

        String concatResult = concatenate.apply("Hello, ", "World!");
        System.out.println("Concatenated String: " + concatResult);
		
		
		
		Function<Integer, Integer> f = x -> x + 1;
		Function<Integer, Integer> g = x -> x * 2;
		Function<Integer, Integer> h = f.andThen(g);
		int result = h.apply(1);
		System.out.println("AndThen:"+result);
		Function<Integer, Integer> com = f.compose(g);
		int comp=com.apply(1);
		System.out.println("Compose: "+comp);
		

        integrate(f,4,9);
        integrate(g,2,3);
		
	}
	public static double integrate(Function<Integer, Integer> f, int a, int b) {
		System.out.println("integration");
		System.out.println((f.apply(a) + f.apply(b)) * (b-a) / 2.0);
		return (f.apply(a) + f.apply(b)) * (b-a) / 2.0;
		}

	
	
	
}
