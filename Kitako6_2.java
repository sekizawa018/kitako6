import java.util.*;
public class Kitako6_2{
	public static void main(String[] args){
		System.out.print("整数>");
		int x=new Scanner(System.in).nextInt();
		System.out.print("整数>");
		int y=new Scanner(System.in).nextInt();
		System.out.printf("%dと%dの平均は%d%n",x,y,average(x,y));
	}
	public static int average(int x,int y){
		return (x+y)/2;

	}
}
