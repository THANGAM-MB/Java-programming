package MyPackage;

public class substring {
	public static void main(String[] args) {
		String s="ghigghig";
		String sub="";
		int count=0;
		//char sub1 = 0;
		int length=0;
		char[] arr=new char[s.length()];
		for(int i=0;i<s.length();i++) {
			arr[i]=s.charAt(i);
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] +" ");
		}
		for(int i=0;i<arr.length;i++) {
			sub=sub+arr[i];
			for(int j=i+1;j<arr.length;j++) {
				System.out.println("jj:"+j);
				if(arr[i]!=arr[j]) {
					for(int k=j-1;k>=i;k--) {
						if(arr[j]!=arr[k]) {
							count=0;
						}
					else{count=1;
						break;}
						System.out.println("i:"+i+"j:"+j+"k:"+k);}
					if(count==0) {
					sub=sub+arr[j];}
					else {
						sub=sub;
						break;
					}
					System.out.println("substring:"+sub+"length:"+sub.length());
					}

				else{
					i=j-1;
					System.out.println("i:"+i);
					break;}}
			
			if(length<sub.length()) {
			length=sub.length();
			}sub="";}
System.out.println("Substring length is:"+length);		}
	}

