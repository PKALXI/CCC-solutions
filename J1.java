/**
 *
 * @author PK
 */
//import Scanner for file reading
import java.util.Scanner;
public class J1{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //initiate scanner for console input
       Scanner in = new Scanner(System.in);
       
       //get the value of x coordinate
       int x = in.nextInt();
       //get the value of the y coordinate
       int y = in.nextInt();
       
      //decision tree to spit out quadrant number
       if(x>0 && y>0){
           System.out.print(1);
       }else if(x<0 && y>0){
           System.out.print(2);
       }else if(x<0 && y<0){
           System.out.print(3);
       }else{
           System.out.print(4);
       }
       
    }
    
}
