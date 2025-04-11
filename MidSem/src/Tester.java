import java.util.HashSet;
import java.util.Set;

public class Tester {
	public static void main(String[] args) {
		
		Student s1=new Student(1,"xyz",100);
		Student s2=new Student(2,"abc",150);
		Student s3=new Student(1,"xyz",100);
		
		Set<Student> set=new HashSet<>();
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.forEach(stu->System.out.println(stu));

	}
}
