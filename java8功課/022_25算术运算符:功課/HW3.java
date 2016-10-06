
import java.util.Scanner;
/*
定義一個5個數字，計出其和
*/
public class HW3{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("please input the num of day");
		int num = input.nextInt();
		int weeks = num / 7;
		int days = num % 7 ;
		System.out.println("you in put the num is : "+num+". And the weeks is :"+weeks+". the day is :"+days);


	}
}


