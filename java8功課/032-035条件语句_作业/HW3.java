import java.util.Scanner;

public class HW3{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("please in put num :");

        int num = input.nextInt();
        int result  = num % 2 ;
        if (result == 0 ){
            System.out.println("this is 奇數");

        }else {
            System.out.println(" this is not");
        }

    }
}