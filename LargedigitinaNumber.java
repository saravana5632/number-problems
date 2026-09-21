package numberproblems;

public class LargedigitinaNumber {
public static void main(String[] args) {
	int a=32465;
	int large=Integer.MIN_VALUE;
	while(a!=0) {
		int temp= a%10;
		if(temp>large)
			large = temp;
		a/=10;
	}
	System.out.println(large);
}
}
