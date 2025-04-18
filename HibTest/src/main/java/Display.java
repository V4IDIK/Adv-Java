
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Display {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
	    configuration.configure("hibernate.cfg.xml");
	    SessionFactory factor=configuration.buildSessionFactory();
	    Session session=factor.openSession();
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter the id:");
	    Clg_DB employee=session.get(Clg_DB.class,scanner.nextInt());
	    System.out.println(employee.getName());
	    
	    Query query =session.createQuery("from Employee");
	    List<Clg_DB> list= query.list();
	    
	    
	    for(Clg_DB e :list) {
	    	System.out.println(e.getId()+" "+e.getName()+" "+e.getFees());
	    }
	    factor.close(); 
	}

}
