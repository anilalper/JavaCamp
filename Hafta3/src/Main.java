import business.*;
import entities.Instructor;
import entities.Student;
import logger.*;
public class Main {

	public static void main(String[] args) {
		StudentManager studentManager = new StudentManager(new FileLogger());
		InstructorManager instructorManager = new InstructorManager(new DatabaseLogger());
		
		Student student1=new Student(1, "alper1", "avdan1", "alper1@alper1.com","123qwe1","123451","12341");
		Student student2=new Student(2, "alper2", "avdan2", "alper2@alper2.com","123qwe2","123452","12342");
		Student student3=new Student(3, "alper3", "avdan3", "alper3@alper3.com","123qwe3","123453","12343");
		Student student4=new Student(4, "alper4", "avdan4", "alper4@alper4.com","123qwe4","123454","12344");
		
		studentManager.add(student1);
		studentManager.add(student2);
		studentManager.add(student3);
		studentManager.add(student4);
		
		studentManager.addStudentNumber(student4, "N123456");
		studentManager.list(student1,student2,student3,student4);
		
		studentManager.update(new Student(2,"anil","adem","anil@adem.com","qwe123","4366","3211"));
		
		studentManager.delete(student4);
		
		System.out.println("EndOfStudent");
		
		Instructor instructor1=new Instructor(1,"engin","demiroğ","engin@gmail.com","1234","4321","Prof. Dr","Bilgisayar");		
		Instructor instructor2=new Instructor(2,"kerem","Varış","kerem@gmail.com","1234","4321","Prof. Dr","Bilgisayar");
		
		instructorManager.add(instructor1);
		instructorManager.add(instructor2);
		
		instructorManager.addDepartment(instructor2, "Bilişim");
		instructorManager.addTitle(instructor2, "Doktor");
		
		instructorManager.list(instructor1,instructor2);
		
		System.out.println("EndofInstructor");
	}

}
