package numberproblems;

public class CountIfADigitIsEvenInaNumber{
public static void main(String[] args) {
	int a =1235436;
	int count=0;
	while(a!=0) {
		int temp=a%10;
		if(temp %2 ==0 )
			count+=1;
		a/=10;
	}
	System.out.println(count);
}
}
