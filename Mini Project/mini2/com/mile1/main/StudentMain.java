package mini2.com.mile1.main;
import mini2.com.mile1.bean.Student;
import mini2.com.mile1.exception.NullMarksArrayException;
import mini2.com.mile1.exception.NullNameException;
import mini2.com.mile1.exception.NullStudentObjectException;
import mini2.com.mile1.service.StudentReport;
import mini2.com.mile1.service.StudentService;;

public class StudentMain {
    
	Student data [] = new Student[4];
	public StudentMain() {
		// TODO Auto-generated constructor stub
		for(int i=0;i<data.length;i++){
			data[i]= new Student();
		}
		
		data[0]= new Student("Sekar", new int[]{85,75,95});
		data[1]= new Student(null, new int[]{11,22,33});
		data[2]= null;
		data[3]= new Student("Manoj", null);
		
		
	}
 public static void main(String...manish){
	StudentReport studentReport= new StudentReport();
	StudentService studentService= new StudentService();

	for(Student sd: new StudentMain().data){
		
	  try{
		 
		   if(studentReport.validate(sd).equalsIgnoreCase("VALID")){
			     System.out.println("Grades: "+studentReport.findGrades(sd));
		   }
		 
	  }catch(NullStudentObjectException nullStudentObjectException){
		  System.out.println("Total Null Object: "+studentService.findNumberOfNullObjects( new StudentMain().data )); 
		  nullStudentObjectException.printStackTrace();
	  }catch (NullMarksArrayException nullMarksArrayException) {
		  System.out.println("Total Null Marks: "+studentService.finadNumberOfNullMarksArray( new StudentMain().data )); 		  
		nullMarksArrayException.printStackTrace();
	}catch(NullNameException nullNameException){
		 System.out.println("Total Null Name: "+studentService.finadNumberOfNullName( new StudentMain().data )); 
		nullNameException.printStackTrace();
	}
		 
 }
 }
}
