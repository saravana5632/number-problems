package numberproblems;

public class RepeatationofNumber {
public static void main(String[] args) {
	int a = 87878;
	int count = 0 ;
	int target = 8;
	while (a != 0) {
		if (a%10 == target)
			count+=1;
		a/=10;
	}
	System.out.println(count);
}
}