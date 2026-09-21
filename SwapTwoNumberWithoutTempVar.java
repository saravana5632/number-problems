package numberproblems;

public class SwapTwoNumberWithoutTempVar {	
public static void main(String[] args) {
	int a =10; 
	int b =60;
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("a = "+ a +"\nb = "+b);
	}
}