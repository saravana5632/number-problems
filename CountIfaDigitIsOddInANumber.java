package numberproblems;

public class CountIfaDigitIsOddInANumber {
public static void main(String[] args) {
	int a =1234567;
	int count =0;
	while(a!=0) {
		int temp = a%10;
		if(temp%2!=0)
			count+=1;
		a/=10;
	}
	System.out.println(count);
}
}