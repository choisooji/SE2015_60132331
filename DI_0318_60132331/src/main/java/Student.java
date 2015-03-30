
public class Student {
	
	private String name;
	private Lecture student;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Student(){
		
	}
	
	public Student(String name){
		this.name = name;
	}
	
	public void addStudent(Lecture student){
		this.student = student;
	}
	
}
