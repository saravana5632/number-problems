package numberproblems;

public class PlaceValueofEachDigit {
public static void main(String[] args) {
	int a = 1234;
	int s =1;
	while (a!=0) {
		System.out.println((a%10)*s);
		s*=10;
		a/=10;
	}
	
}
}