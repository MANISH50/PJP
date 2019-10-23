public class CMD_ARG_1{
 public static void main(String...manish){

  try{
       System.out.println(manish[0]+" technologies "+manish[1]); 
  }catch(java.lang.ArrayIndexOutOfBoundsException aiobe){
       System.out.println("Missing Command Line Argument !!"); 
  }
 }
}