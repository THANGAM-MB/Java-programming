package MyPackage;
class details{
	String name;
	long universityId;
	details(String name,long universityId){
		this.name=name;
		this.universityId=universityId;
	}
	details(){
		String name;
		long universityId;
		System.out.println("details");
	}
}
class faculty extends details{
	
	int rank;
	faculty(String name,long universityId,int rank){
		super();
		this.rank=rank;
		System.out.println("faculty");
		System.out.println("name:"+name+" universityId: "+universityId+" Rank:"+rank);
	}
	
} 
class staff extends details{
	staff(String name,long universityId){
		super();
		System.out.println("staff");
		System.out.println("name:"+name+" universityId: "+universityId);
	}
	
}
class undergraduate extends details{
	int yearsOfStudy;
	undergraduate(String name,long universityId,int yearsOfStudy){
		super();
		this.yearsOfStudy=yearsOfStudy;
		System.out.println("undergraduate");
		System.out.println("name:"+name+" universityId: "+universityId+" Yearsofstudy:"+yearsOfStudy);
	}
}class graduate extends details{
	long supervisorUniversityId;
	graduate(String name,long universityId,long supervisorUniversityId){
		super();
		this.supervisorUniversityId=supervisorUniversityId;	
		System.out.println("graduate");
		System.out.println("name:"+name+" universityId: "+universityId+" supervisorid:"+supervisorUniversityId);
	}
}

public class university {
	public static void main(String[] args) {
		System.out.println("faculty rank 1: Assistant Professor,2: Associate Professor,3:Full Professor");
		details obj1=new faculty("kavya",822719108,1);
		details obj2=new staff("jey",9089786);
		details obj3=new undergraduate("kavi",860919108,1);
		details obj4=new graduate("joe",587439554,822719108);
					
		}
	}


