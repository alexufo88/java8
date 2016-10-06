import java.util.Scanner;

public class HW1{
	public static void main (String[] args){

		Scanner input = new Scanner(System.in);
		
		int[] num = {10,20,30,40};
		System.out.println("please input you num : ");
		
		boolean flag = false;
		int test = input.nextInt();
		
		for(int i=0 ; i<num.length; i++ ){
			if (num[i]==test){
				flag = true;
				break;
			}
			
			
			
		} 

		if(flag){
			System.out.println("you finish ");
		}else{
			System.out.println(" try again");
		}

	}
}