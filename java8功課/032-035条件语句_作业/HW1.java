import java.util.Scanner;

public class HW1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("please input a num:");
        int a = input.nextInt() ;
        System.out.println("please input b num:");
        int b =input.nextInt() ;
        int c = a % b;

        /*
        int div = a % b
        int  sum = a + b;
        if(div == 0 || sum > 1000){
             print  conditional 
        }


        */

        if ( c == 0  || (a + b) > 1000 ){
            System.out.println("print a");
        }else{
            System.out.println("print b");
        }

    }
}
