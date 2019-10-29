/*
  
  Given two strings, return true if either of the strings appears at the very end of the other string, 
  ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). 
  Note: str.toLowerCase() returns the lowercase version of a string.

endOther("Hiabc", "abc") → true
endOther("AbC", "HiaBc") → true
endOther("abc", "abXabc") → true

*/

public boolean endOther(String a, String b) {
  
  if( a.equals("") || b.equals("") )
    return false;
  else if(a.length() == 1){
     return a.substring( a.length()-1,a.length()).equalsIgnoreCase( b.substring( b.length()-1,b.length()) );
  }  
  else{
    
    String back1= a.substring( a.length()-2,a.length() );
    String back2= b.substring( b.length()-2,b.length() );
    
    return back1.equalsIgnoreCase(back2);
  } 
}
