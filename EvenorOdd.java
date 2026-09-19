package numberproblems;

import java.util.Scanner;
public class EvenorOdd {
static boolean check(int a){
	return a%2==0;
}
public static void main(String [] args) {
	Scanner sc =new Scanner (System.in);
	while(true) {
	int a = sc.nextInt();
	if(a<0) {
		System.out.println("End");
		break;
	}
		
	if(check(a))
		System.out.println("Even");
	else 
		System.out.println("Odd");
	}
	sc.close();
}}