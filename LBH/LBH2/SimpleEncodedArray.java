package M2_A;

public class SimpleEncodedArray {
 public static void main(String...manish){
	 Result result= encodeArr(new int[]{1,2,3});
	 result.display();
 }
 private static Result encodeArr(int arr[]){
	 
	 int[] orgArr= new int[arr.length];
	 int sum= 0;
	 
	 for(int i=(arr.length-1);i>=0;i--){
		 
		 if( i == (arr.length-1) ){
			 
			 orgArr[i]= arr[i];
			 sum= orgArr[i];
		
		 }else{
			 
			 orgArr[i]= orgArr[i+1] - arr[i];
			 sum+=orgArr[i];
		 }
	 }
	 
	 
	 return new Result( orgArr[0] , sum );
 }
 static class Result{
	 
	 int out1= 0;
	 int out2= 0;
	 
	 Result(int out1,int out2){
		 this.out1= out1;
		 this.out2= out2;
	 }
	 
	 public void display(){
		 System.out.print("Out= "+out1+" Out2= "+out2);
	 }
 }
}
