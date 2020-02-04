import java.util.*;
public class Kitako6_7{
	public static void main(String[] args){
		for(int a=10000;a<10100;a++){
			if(prime(a)){
				System.out.print(a+" ");
			}
		}
	}
	public static boolean prime(int a){
		if(a<=3){
			return true;
		}
		for(int i=2;i<a;i++){
			if(a%i==0){
				return false;
			}
		}
		return true;
	}
}
