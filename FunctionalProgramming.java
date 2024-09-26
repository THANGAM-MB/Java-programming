package MyPackage;


class TrainJourney {
	public int price;
	public TrainJourney onward;
	public TrainJourney(int p, TrainJourney t) {
			price = p;
			onward = t;
		}

	static TrainJourney link(TrainJourney a, TrainJourney b){
			if (a==null) {
				System.out.println("If A: "+b);
				return b;
			}
			TrainJourney t = a;
			System.out.println("Link t: "+t);
			
		
			while(t.onward != null){
				System.out.println("While t.onward: "+t.onward);
				t = t.onward;
			}
			System.out.println();
			 
			t.onward = b;
			return a;
	}
	
	static TrainJourney append(TrainJourney a, TrainJourney b){
		return a==null ? b : new TrainJourney(a.price, append(a.onward, b));
		}
	
	 @Override
	    public String toString() {
	        StringBuilder result = new StringBuilder();
	        result.append(price);
	        TrainJourney current = onward;

	        while (current != null) {
	            result.append(" -> ").append(current.price);
	            current = current.onward;
	        }

	        result.append(" -> null");
	        return result.toString();
	    }
}
public class FunctionalProgramming {
	public static void main(String[] args) {
		//TrainJourney trainJourney=new TrainJourney(0,TrainJourney.onward);
		TrainJourney trainJourney1=new TrainJourney(0,null);
		//TrainJourney result=trainJourney1.append(trainJourney1,trainJourney1);
		TrainJourney result=trainJourney1.append(new TrainJourney(90,null), new TrainJourney(100,null));
		System.out.println(result);
		System.out.println(result.toString());
		TrainJourney trainLink = trainJourney1.link(new TrainJourney(90,null), new TrainJourney(90,null));
		System.out.println(trainLink);
	}

}
