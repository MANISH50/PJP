package mini2.com.mile1.service;
import java.lang.reflect.Array;
import java.util.Arrays;

import mini2.com.mile1.bean.Student;
import mini2.com.mile1.exception.NullMarksArrayException;
import mini2.com.mile1.exception.NullNameException;
import mini2.com.mile1.exception.NullStudentObjectException;

public class StudentReport {
	
	public String findGrades(Student studentObject){
		String GRADE= "";
		int marks_sum=0;
		
		if(studentObject!= null){
			int marks[]= studentObject.getMarks();
			
			if( Arrays.binarySearch(marks, 35) > 0)
				         return "F";
			
			for(int i:marks)
		 		marks_sum+=i;
		
			
		    if(marks_sum<150){
				GRADE= "C";
			}else if(marks_sum<200){
				GRADE= "B";
			}else if(marks_sum<250){
				GRADE= "A";
			}else{
				GRADE= "A+";
			}
		}
		
		return GRADE;
	}
	
	public String validate(Student s) throws NullNameException,NullMarksArrayException,NullStudentObjectException{
		if(s == null)
			 throw new NullStudentObjectException();
		else{
			
			if(s.getName()== null)
				throw new NullNameException();
			else if(s.getMarks() == null)
				 throw new NullMarksArrayException();
			else
				return "VALID";
		}
	}
}
