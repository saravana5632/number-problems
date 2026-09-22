package numberproblems;

public class FindSmallestNumberInaDigit {
public static void main(String[] args) {
	int a =32454;
	int small = Integer.MAX_VALUE;
	while(a!=0) {
		int temp = a %10;
		if(temp<small)
			small = temp ;
		a/=10;
	}
	System.out.println(small);
}
}
