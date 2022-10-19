package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import domain.Client;

public class Program {

	public static void main(String[] args) {

//	Already Commited
//		Client p1 = new Client (null, "Carlos da Silva", "carlos@gmail.com");
//		Client p2 = new Client (null, "Joaquim Torre", "joaquim@gmail.com");
//		Client p3 = new Client (null, "Ana Maria", "ana@gmail.com");
//		em.getTransaction().begin();
//		em.persist(p1);
//		em.persist(p3);
//		em.persist(p2);
//		em.getTransaction().commit();
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("example-jpa");
		EntityManager em = emf.createEntityManager();

		Client c = em.find(Client.class, 2);
		
		em.getTransaction().begin();
		em.remove(c);		
		em.getTransaction().commit();
				
		System.out.println("Ready!");
		em.close();
		emf.close();
	}

}
