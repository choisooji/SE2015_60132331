import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class HacksaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Professor professor = new Professor("choi");
		//Lecture lecture = new Lecture("소프트웨어 공학");
		
		ApplicationContext factory = 
				new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
		
		Professor professor = (Professor)factory.getBean("professor");
		Lecture lecture2 = (Lecture)factory.getBean("lecture2");
		Lecture student = (Lecture)factory.getBean("student");
		
		professor.addLecture(lecture2);
		professor.showLecture();
		lecture2.addStudent(student);
		lecture2.showLecture();
		
		//professor.addLecture(lecture1);
		//professor.showLecture();
	}

}
