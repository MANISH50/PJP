package mini1.com.wipro.videolauncher;

import java.util.Scanner;

import mini1.com.wipro.videostore.VideoStore;

public class VideoLauncher {
	 public static VideoStore videoStore= new VideoStore();
  public static void main(String...manish){
	 
	  int option= 1;
	  int go= 1;
	  Scanner scan= new Scanner(System.in);
	  
	  
	 while(go != 0){ 
		 
		 printOption(); 
		 
	 System.out.println("\nEnter Option: ");
	 option= scan.nextInt();
		 
	  switch(option){
	  case 1:
		  additionVideo();
		  break; 
		
	  case 2:
		  System.out.println("\nEnter Video name to check out: Matrix");
		  videoStore.doCheckOut("Matrix");
		  break; 
		  
	  case 3:
		  System.out.println("\nEnter Video name to Receive Rating: Pikachu");
		  System.out.println("\nEnter Rating: ");
		  int rate= scan.nextInt();
		  
		  videoStore.receiveRating("Pikachu", rate);
		  break;
		  
	  case 4:
		  videoStore.listinventory();
		  break;
		  
	  case 6:
		 go= 0;
		  break;	  
		  
	  }
	  
	   if(go!=0){
	    System.out.print("Enter More (1/0): ");
	    go= scan.nextInt();
	   }
	 }
	 
	 System.out.println("\nThanks for using this application.");
	 
  }
  public static void printOption(){
	  
	  System.out.println("MAIN MENU");
	  System.out.println("1.Add Video");
	  System.out.println("2.Check Out Video");
	  System.out.println("3.Receive Rating");
	  System.out.println("4.List Inventory");
	  System.out.println("6.Exit");
  }
  
  public static void additionVideo(){
	   
	   System.out.println("Enter any four videos: \nLIKE Vid1 Vid2 Vid3 Vid4");
	   String vidoName= "Matrix Pikachu HagiMaru ABS";
	   videoStore.addVideo(vidoName);
  }
}
