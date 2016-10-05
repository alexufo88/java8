

import java.util.Scanner;
import java.util.Random;


public class Demo{

    public static void main(String[] args) {
     
        
        int[] sysRedBallNum = new int[6]; //0-5
        int sysBlueBallNum;

        
        Random r = new Random();

        //System random blue ball
        sysBlueBallNum = r.nextInt(16)+1;
        
        //System rand red ball
        int[] redNum = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,21,23,24,25,26,27,28,29,30,31,32,33};  
        
        for(int i=0 ; i<sysRedBallNum.length;i++){
            while(true){
                int index = r.nextInt(33);
                if(redNum[index]!= -1){
                    sysRedBallNum[i] = redNum[index];
                    redNum[index] = -1 ;
                    break;
                }
                
                
            }
            
        }
    
        System.out.println("New Star the GAME! ------");
        System.out.println("Please in put the Blue Num");
        
        //recept the num 
        Scanner input = new Scanner(System.in);
        int userBlueBallNum ;
        int[] userRedBallNum = new int[6];
        
        
        userBlueBallNum = input.nextInt();//Accept num
        if(userBlueBallNum <= 0 || userBlueBallNum >=18  ){
            System.out.println("this is worry num");
            
        }
        
        
        System.out.println("Please in put the 6 Red Num ");
        //accpept red arr 
        for(int i=0 ; i<userRedBallNum.length ; i++){
            userRedBallNum[i]= input.nextInt();
            }
        
        //驗紅球
        int redBall =0;
        int blueBall = 0;
        
        if(userBlueBallNum == sysBlueBallNum){
            blueBall = 1;
        }
        
        for(int i=0; i<userRedBallNum.length; i++){
            for(int j=0; j<sysRedBallNum.length;j++){
                if(userRedBallNum[i] == sysRedBallNum[j]){
                redBall++;
                break;
                }
            }
        }
        
        
        
        //對是否中
        if(redBall == 6 && blueBall == 1){
            System.out.println("一等");
        }else if(redBall == 6 ){
            System.out.println("2等");
        }else if (redBall == 5 && blueBall ==1){
            System.out.println("3等");
        }else if (redBall == 5 || (redBall == 4 && blueBall == 1)){
            System.out.println("4等");
        }else if (redBall == 4 || (redBall == 3 && blueBall == 1)){
            System.out.println("5等");
        }else if (blueBall == 1){
            System.out.println("1等");
        }else{
            System.out.println("沒中");
        }
        //bobul 排出systemNUM
        
        
       
        }
}