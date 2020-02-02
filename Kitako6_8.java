import java.util.*;
public class Kitako6_8{
	public static void main(String[] args){
		for(int i=11;i<=20;i++){
			System.out.println(fibonacci(i)+",");
		}
	}
	public static int fibonacci(int a){
		if(a==0){
			return 0;
		}else if(a==1){
			return 1;
		}else{
		return fibonacci(a-2)+fibonacci(a-1);
		}
	}
}
