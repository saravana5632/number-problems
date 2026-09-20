package numberproblems;

public class ReverseaNumber {
public static void main(String[] args) {
	int a = 45123;
	int res =0 ;
	while(a!=0) {
		res = res*10+(a%10);
		a/=10;
	}
	System.out.println(res);
}
}