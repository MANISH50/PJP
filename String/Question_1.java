/*

Given a string, return a string where for every char in the original, there are two chars.


doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree"
*/

public String doubleChar(String str) {
  StringBuilder strbuilder= new StringBuilder();
  for(int i=0;i<str.length();i++){
     strbuilder.append(""+str.charAt(i)+""+str.charAt(i));
  }
  return strbuilder.toString();
}
