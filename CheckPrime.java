import java.util.Scanner;

public class CheckPrime{
 public static void main(String...manish){
     Scanner scan=new Scanner(System.in);
     System.out.println("\nEnter Number To Be Check !!");
     int num= scan.nextInt(); 
     boolean progress= true;

     for(int j=2;j<num;j++)
          if(num%j== 0){
              progress= false;
              break;
           }  
    if(progress)
        System.out.println("\nNumber is Prime.");
    else
        System.out.println("\nNumber is not Prime.");      
 }
}