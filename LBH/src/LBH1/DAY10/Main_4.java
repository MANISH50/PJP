package LBH1.DAY10;
import java.io.ObjectInputStream.GetField;
import java.lang.reflect.Array;
/*
 * Find Most Frequent Digit
 */
import java.util.ArrayList;
import java.util.Collections;
  
public class Main_4 {
 public static void main(String...manish){
	Main_4.mostFrequesnt(99, 99, 0, 8);
 }
 
 private static void mostFrequesnt(int input1,int input2,int input3,int input4){
	 ArrayList<Integer> arrayList= new ArrayList();
	 
	 Main_4.countNumber(input1, arrayList);
	 Main_4.countNumber(input2, arrayList);
	 Main_4.countNumber(input3, arrayList);
	 Main_4.countNumber(input4, arrayList);
	 
	 Collections.sort(arrayList);
	 System.out.println(arrayList);
	 
	 int count=0;
	 int MAX=0;
	 int NUM=0;
	 int TNUM=0;
	 
	 for(int i=0;i<arrayList.size()-1;i++){
		 if( (int) arrayList.get(i)  == (int) arrayList.get(i+1) ){
			 count++;
			 TNUM= (int) arrayList.get(i);
		 }
		 else{
			 if(count>=MAX){
				 
				 MAX= count;
				 if(TNUM>NUM)
				   NUM= TNUM;
			 }
			 count= 0;
		 }
			 
	 }
	 if(NUM== 0 && TNUM>NUM)
		    NUM= TNUM;
	 
	 System.out.println(NUM);
 }
 
 private static void countNumber(int num,ArrayList<Integer> arrayList){
	 while(num!=0){
		 int n= num%10;
		 arrayList.add(new Integer(n));
		 num/=10;
	 }
 }
}
