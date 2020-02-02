import java.util.*;
public class Kitako6_4{
	public static void main(String[] args){
		triangle(3);
		triangle(4);
		triangle(5);
	}
	public static void triangle(int a){
		for(int j=0;j<a;j++){
			for(int i=0;i<a;i++){
				if(i<=j){
				System.out.print("$");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
}
