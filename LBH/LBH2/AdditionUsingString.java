package M2_A;

import java.io.ObjectInputStream.GetField;

public class AdditionUsingString {
  public static void main(String art[]){
	  System.out.println(getSum("1234", "56"));

  }
  private static String getSum(String input1,String input2){
        
	    int LENGTH= 0;
	  
	    if(input1.length()<input2.length()){
	    	
	    	input1= getZeros(input1,  findDiff(input1.length(), input2.length()) );
	    	LENGTH= input1.length();
	    	
	    }else if(input2.length()<input1.length()){
	    	
	    	input2= getZeros(input2,  findDiff(input1.length(), input2.length()) );
	    	LENGTH= input2.length();
	    	
	    }else{
	    	LENGTH= input2.length();
	    }
	  
	  return findSum(input1, input2, LENGTH);
  }
  private static String getZeros(String str,int zeros){
	  String ZEROS= "";
	  for(int i=0;i<zeros;i++){
		  ZEROS+="0";
	  }
	  return ZEROS+str;
  }
  private static int findDiff(int leng1,int leng2){
	  return Math.abs( (leng1 - leng2) );
  }

  private static String findSum(String input1,String input2,int LENGTH){
	  int sum= 0;
	  int carry= 0;
	  String SUM= "";
	  
	  for(int i=(LENGTH-1);i>=0;i--){
		
		  sum= (int) ( (int) (input1.charAt(i) - '0')  +  (int) (input2.charAt(i) - '0')  + carry   );
		  SUM+= sum%10;
		  carry= sum/10;
	  }
	  
	  if(carry>0)
		   SUM+=carry;
	  
	  
	  return new StringBuilder(SUM).reverse().toString();
  }

}
