/*

 Return true if the string "cat" and "dog" appear the same number of times in the given string.


catDog("catdog") → true
catDog("catcat") → false
catDog("1cat1cadodog") → true

*/

public boolean catDog(String str) {
  if(str.length()<3)
    return true;
  
  if(str.equals("cat") || str.equals("dog"))  
   return false;
   
    int cat=0,dog=0 ;
  for(int i=0;i<=str.length()-3;i++){
     if( str.substring(i, i+3).equals("cat"))
       cat++;
     else if(str.substring(i, i+3).equals("dog"))
       dog++;
  }
  if(cat == dog)
    return true;
  else
   return false;
}
