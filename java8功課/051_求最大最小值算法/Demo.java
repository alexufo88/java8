
public class Demo{
	public static void main(String[] args){
		int[] num = {10,20,50,3,6,60,50,60,1};
		int max = num[0];
		int min = num[0];
		for(int i=1 ; i<num.length;i++){    //for loop 6 
			if (num[i] > max){              //for max num
				max = num[i];
			}

			if(num[i] < min)
				min = num[i];
			


		}
		System.out.println("the max num is:"+max);
		System.out.println("the max min is:"+min);


	}
}