import java.util.Scanner;

public class HW1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please input first Num A :");
        int a = input.nextInt();
        System.out.println("Please input secoudily B :");
        int b = input.nextInt();

        System.out.println("your A :"+a+ "your b :"+b);

        int c = a;
        a = b;
        b = c;
        System.out.println("交換後A是"+a+"交換後b"+b);
    }
}
