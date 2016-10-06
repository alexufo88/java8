public class HW2 {

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //  TODO code application logic here
        for(int i=0; i<5;i++){
          for(int j=i;j<4 ; j++){
            System.out.print(" ");

          }
          for(int j=0; j<=(i*2);j++){
            System.out.print("*");
          }
          System.out.println();
        }
        
        
        
    }
}