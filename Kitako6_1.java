import java.util.*;
public class Kitako6_1{
	public static void main(String[] args){
		System.out.print("整数>");
		int x=new Scanner(System.in).nextInt();
		System.out.printf("%dの2乗は%d%n",x,pow(x));
	}
	public static int pow(int x){
		int num =x*x;
		return num;
	}
}
