package numberproblems;

public class SumOfSquaresOfDigitInaNumber {
public static void main(String[] args) {
	int a =12345;
	int sum =0;
	while(a!=0) {
		int temp = a%10;
		sum+=temp*temp;
		a/=10;
	}
	System.out.println(sum);
}
}
