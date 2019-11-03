package mini2.com.mile1.service;

import mini2.com.mile1.bean.Student;

public class StudentService {
	
	public int finadNumberOfNullMarksArray(Student s[]){
		int C= 0;
		
		if(s!= null){
			
			for(Student s_obj: s)
				if(s_obj!= null)
				   if(s_obj.getMarks() == null)
					      C++;
			
		}
		
		return C;
	}

	
	public int finadNumberOfNullName(Student s[]) throws NullPointerException{
		int C= 0;
		
		if(s!= null){
			
			for(Student s_obj: s)
				if(s_obj!= null)
				   if(s_obj.getName() == null)
					          C++;
			
		}
		
		return C;
	}

	public int findNumberOfNullObjects(Student s[]){
		int C=0;
		for(Student s2: s){
			 if(s2 == null)
				    C++;
		}
		return C;
	}

}
