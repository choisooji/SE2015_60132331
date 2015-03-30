
public class Lecture {

	private String name;
	private Lecture student;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Lecture(){
		
	}

	public Lecture(String name){
		this.name = name;
	}

	public void addStudent(Lecture student) {
		this.student = student;
	}
	
	public void showLecture(){
		System.out.println(student.getName());
	}
}
