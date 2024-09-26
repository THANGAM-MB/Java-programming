package MyPackage;

public class genericSample <KeyType,ValueType>{
	private final KeyType key;
    private final ValueType value;
    public genericSample() {
    	key=null;
    	value=null;
    }
    public genericSample(KeyType key, ValueType value) {  
        this.key = key;
        this.value = value;
        System.out.println("key="+key.getClass());
        System.out.println("value+"+value.getClass());}
    public void print(KeyType key,ValueType value) {
        System.out.println("key="+key.getClass());
        System.out.println("value+"+value.getClass());
    }
 public static void main(String[] args) {
	 genericSample obj=new genericSample("hi",8);
	
	 genericSample myobj=new  genericSample ();
	 myobj.print("nasme",true);
 }
}
