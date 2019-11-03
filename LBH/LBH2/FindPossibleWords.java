package M2_A;

public class FindPossibleWords {
  public static void main(String...mm){
	  System.out.println( FindPossibleWords.getCode("Fi_er", "fixer:fever:filter:fiber") );
  }
  public static String getCode(String input1,String input2){
	String[] getWords= input2.split(":");
	StringBuilder builder= new StringBuilder();

	for(int i=0;i<getWords.length;i++){
	   String getStr= getWords[i];

	   if( isContain(input1, getStr) )
	       builder.append(getStr).append(":");
	}  

    if(builder.length()>0){
      //System.out.print(builder.deleteCharAt(builder.length()-1).toString().toUpperCase());		
	  return builder.deleteCharAt(builder.length()-1).toString().toUpperCase();
	}
    else
	 return "ERROR-009";
}
public static boolean isContain(String str1,String str2){
	if(str1.length()!=str2.length())
         return false;

		boolean process= false;

	for(int i=0;i<str1.length();i++){
        if( String.valueOf(str1.charAt(i)).equalsIgnoreCase( String.valueOf(str2.charAt(i)))){
			  process= true;
		}else if("_".equals( String.valueOf(str1.charAt(i)) )){
			process= true;
		}else{
			return false;
		}   
	}
	return process;
}
}
