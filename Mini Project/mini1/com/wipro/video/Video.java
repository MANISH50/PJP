package mini1.com.wipro.video;

public class Video {
 
 private String videoName;
 private boolean checkout;
 private int rating;
 
 public Video(){
	 //Not To Do.
 }
 
 public Video(String name){
   this.videoName= name;
   
 }
 public String getName(){
	 return this.videoName;
 }
 public void doCheckout(){
	 this.checkout= true;
 }
 public void doReturn(){
	 
 }
 public void receiveRating(int rating){
	 this.rating= rating;
 }
 public int getrating(){
	 
	 return this.rating;
 }
 public boolean getCheckOut(){
	 return this.checkout;
 }
}
