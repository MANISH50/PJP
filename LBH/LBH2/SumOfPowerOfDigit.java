package M2_A;

public class SumOfPowerOfDigit {
	public static void main(String arg[]){
		System.out.println( SumOfPowerOfDigit.sumOfDigitPower(123) );
	}
    
	public static int sumOfDigitPower(int number){
		
		String numb= String.valueOf(number);
		int[] newArr= returnArrayNumber(numb);
		int sum=0;
		
		for(int i=0;i<(newArr.length-1);i++){
			sum+=Math.pow(newArr[i], newArr[i+1]);
		}
		
		return sum+1;
	}
	
public static int[] returnArrayNumber(String numb){
	int[] arr= new int[numb.length()];
    
	for(int i=0;i<arr.length;i++){
		arr[i]= Integer.parseInt( String.valueOf( numb.charAt(i) ) );
	}
	return arr;
}
}
