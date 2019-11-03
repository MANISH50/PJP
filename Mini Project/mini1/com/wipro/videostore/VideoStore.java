package mini1.com.wipro.videostore;
import java.util.ArrayList;

import mini1.com.wipro.video.*;

public class VideoStore {
	
	public int i=4;
	
	public void setIndex(int index){
		this.i= index;
	}
	
	public Video[] video= new Video[i];
	
	
	public void addVideo(String name){
		String str[]= name.split(" ");
		
		for(int i=0;i<4;i++){
			 video[i]= new Video(str[i]);
		}
	}
	public void doCheckOut(String name){
		
		for(Video vid: video){
			if(name.equalsIgnoreCase(vid.getName())){
				vid.doCheckout();
				System.out.println("Your Video "+name+" get checkout successfully");
				break;
			}
		}
		System.out.println(video[0].getName());
	}
	
	public void doReturn(String name){
		int flag= 0;
		
		for(Video vid: video){
			if(name.equalsIgnoreCase(vid.getName())){
				flag= 1;
				break;
			}
		}
		if(flag == 1)
		  System.out.println("Video name: "+name+" get returned successfully.");
		else
			System.out.println("Video name: "+name+" not found.");
	}
	public void receiveRating(String name,int rating){
		int flag= 0;
		
		for(Video vid: video){
			if( vid.getName().equalsIgnoreCase(name) ){
				flag= 1;
				vid.receiveRating(rating);
				break;
			}
		}
		if(flag== 1){
			System.out.println("Rating Received !!");
		}else{
			System.out.println("Failed To Received Rating!!");
		}
	}
	
	public void listinventory(){
		System.out.println("----------------------------------------------------------------");
		System.out.printf("%-20s | %-20s  | %s\n","Video Name","CheckOut Status","Rating");
		for(Video vid: video){
		System.out.printf("%-20s %-22s  %s","","|","|");
		System.out.println();
		
		System.out.printf("%-25s  %-25s  %s\n",vid.getName(),vid.getCheckOut(),vid.getrating());
			
		}
		System.out.println("----------------------------------------------------------------");
	}

}
