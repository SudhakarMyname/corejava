package Practice;
import java.util.*;

public class AA{

	 public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         
         
         System.out.println("================================");
         for(int i=0;i<3;i++)
         {
             String s1=sc.next();
             int x=sc.nextInt();
             //Complete this line
              int len = s1.length();
              String st = "";
             System.out.println(x);
            for(int j=len; j<15 ; j++)
            {                
                st=st+" ";
            }
            if(x < 100 && x >= 10){
             System.out.println(s1+st+0+x);
             }
         else if(x >= 0 && x <= 9)
         {
             System.out.println(s1+st+0+0+x);
         }
         else
         {
             System.out.println(s1+st+x);
         }
             }
         System.out.println("================================");
 }

}




