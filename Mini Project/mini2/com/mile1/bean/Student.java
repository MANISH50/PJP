package mini2.com.mile1.bean;

public class Student {
  
  private String name;
  private int marks[];
  private String grade;
  
  public Student() {
	// TODO Auto-generated constructor stub
}
  
  public Student(String name,int marks[],String grade){
	  this.grade= grade;
	  this.name= name;
	  this.marks= marks;
  }
  
  public Student(String name,int marks[]){
	  this.name= name;
	  this.marks= marks;
  }

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int[] getMarks() {
	return marks;
}

public void setMarks(int[] marks) {
	this.marks = marks;
}

public String getGrade() {
	return grade;
}

public void setGrade(String grade) {
	this.grade = grade;
}
  
  
  
}
