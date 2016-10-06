public class HW2{
    public static void main(String[] args) {

    	char[] num= {'a','b','c','d','e','f','g'};
    	//looping for 5
    	for(int i=0;i<num.length;i++){

    		//print the " " ;
    		for(int j=i ; j<num.length-1; j++)
    			System.out.print(" ");

    		//print*
    		for(int j=0;j<=i*2;j++){
    			System.out.print(num[i]);
    		}
    		System.out.println();



    	}

    

    
    
    
    
    
    }
}
