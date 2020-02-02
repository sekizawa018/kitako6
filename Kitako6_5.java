import java.util.*;
public class Kitako6_5{
	public static void main(String[] args){
		System.out.print("サイズ>");
		int a=new Scanner(System.in).nextInt();
		System.out.print("文字>");
		String s=new Scanner(System.in).nextLine();
		char c=s.charAt(0);
		triangle(a,c);
	}
	public static void triangle(int a,char c){
		for(int j=0;j<a;j++){
			for(int i=0;i<a;i++){
				if(i<=j){
				System.out.print(c);
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
}
