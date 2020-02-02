import java.util.*;
public class Kitako6_6{
	public static void main(String[] args){
		for(int i=1;i<=9;i++){
			kuku(i);
		}
	}
	public static void kuku(int a){
		for(int i=1;i<=9;i++){
			System.out.printf("%3d",(a*i));
		}
		System.out.println();
	}
}
