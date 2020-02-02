import java.util.*;
public class Kitako6_3{
	public static void main(String[] args){
		System.out.print("x>");
		int x=new Scanner(System.in).nextInt();
		System.out.print("y>");
		int y=new Scanner(System.in).nextInt();
		System.out.print("z>");
		int z=new Scanner(System.in).nextInt();
		System.out.println(comparisonBig((comparisonBig(x,y)),z));
	}
	public static int comparisonBig(int a,int b){
		if(a>b){
			return a;
		}else{
			return b;
		}

	}
}
