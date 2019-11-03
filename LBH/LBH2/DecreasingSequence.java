package M2_A;

public class DecreasingSequence {
	
	public static void main(String...manish){
		DecreasingSequence.getCount(new int[]{9,8,7,6,5,4,3,2,1,0,10,1,12,-5,-6,1});
	}
    public static void getCount(int arr[]){
    	int count= 0;
    	int seq= 0;
    	boolean countseq= false;
    	int max= 0;
    	
    	for(int i=0;i<(arr.length-1);i++){
    		if(arr[i] > arr[i+1]){
    			
    			if(!countseq){
    			   countseq= true;	
    			   seq++;
    			}
    			count++;
    		}else{
    			
    			if(countseq){
    				
    				max= count>max?count:max;
    				countseq= false;
    			}
    			count= 0;
    		}
    	}
    	if(count>0)
    		 max= count;
    	
    	System.out.println("Sequence= "+seq+" MaxCount= "+max);
    }
}
