package LBH1;

/*
 Write a program to get n prime number. 
 */

public class NPRimeNUmber {
  public static void main(String...manish){
	  System.out.println(getNPrime(104));
  }
  
 private static int getNPrime(int N){
	  
	   int count=0;
	   int numchk=1;
	   
	  while(count!= N){
		  
		     numchk++;
		     
		   if(checkPrime(numchk))
			     count++;  
	  }
	  
	  return numchk;
 }
 public static boolean checkPrime(int num){
	  for(int i=2;i<=(num/2);i++){
		  if(num % i == 0)
			   return false;
	  }
	  
	  return true;
  }
}
