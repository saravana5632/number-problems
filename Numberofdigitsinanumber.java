package numberproblems;

public class Numberofdigitsinanumber {
	public static void main(String[] args) {
		long a = 64346523;
		int count=0;
		while (a>0) {
			count+=1;
			a/=10;
		}
		System.out.println(count);
	}
}