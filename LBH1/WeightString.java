package LBH1;

//Find the weight of the String.

public class WeightString {
  public static void main(String...manish){
	  //System.out.println(WeightString.getCount(Character.toLowerCase('D')));
	  
	  System.out.println(WeightString.getWeight("Hello World", 0));
	  
  }
  
  
  private static int getCount(char ch){
	  
	  char cha= 'a';
	  int count= 1;
	  
	   while(Character.toLowerCase(ch)!=cha){
		   cha++;
		   count++;
	   }
	   
	   return count;
  }
  
  private static int getWeight(String input1,int input2){
	  int count= 0;
	  String vowels= "aAeEiIoOuU";
	  if(input2 == 1){
		  
		  for(int i=0;i<input1.length();i++){
			  
			   if(Character.isAlphabetic(input1.charAt(i))){
				   count=count+getCount( input1.charAt(i) );
			   }
		  }
		  
	  }else{
		  
		  for(int i=0;i<input1.length();i++){
			  
			   if( Character.isAlphabetic(  input1.charAt(i)) && !vowels.contains( String.valueOf(input1.charAt(i)) ) ){
				   count=count+getCount(input1.charAt(i));
			   }
		  }
		  
	  }
	  
	  return count;
  }
  
}
