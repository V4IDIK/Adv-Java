import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Tester {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		Test1 test=new Test1();
		test.setName("don");
		test.setFees(0);
		entityManager.persist(test);
		entityManager.getTransaction().commit();
	}
}
