package M2_A;

public class FindStringCode {
	public static void main(String...manish){
		
	}
	
	
 public int getStringCode(String input1){	
	String[] splitStr= input1.split(" ");

    int NEWDIGIT= 0; 
	int HUND= 1;
	int SUM= 0;
	int OUTPUT=0;

    for(int i=0;i<splitStr.length;i++){
         SUM= getSumDiff(splitStr[i]);
		 
		 for(int j=1; j<=countDigit(SUM);j++){
            HUND*=10;
		 }
		 OUTPUT=OUTPUT*HUND+SUM;
		 HUND= 1;
	}
	
   return OUTPUT;
}

public int getSumDiff(String st){
	
	int mid= (st.length()-1)/2;
	int sum=0;
	int length= st.length()-1;

     if(st.length()%2== 0){
           
		 for(int i=0;i<st.length()/2;i++){
            sum+= Math.abs( 
				 (getCharCode(st.charAt(i)) - getCharCode(st.charAt(length)))
			);
			length--; 
		 }
	 }else{

        for(int i=0;i<=mid;i++){
          
		   if(i == mid)
		      sum+=Math.abs( getCharCode( st.charAt(i) ) );
           else{
		   	sum+= Math.abs( 
				 (getCharCode(st.charAt(i)) - getCharCode(st.charAt(length)))
			);
			length--;
		   }
		}

	 }

	return sum;
}

public int getCharCode(char ch){
	int CHAS= 64;
	int ASCII= (int) Character.toUpperCase(ch);

    return ASCII-CHAS;
}

public int countDigit(int num){
	int count= 0;
     while(num!=0){
       count++;
	   num/=10;
	 }
	 return count;
}

}
