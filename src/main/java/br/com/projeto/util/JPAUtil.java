package br.com.projeto.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {	
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjetoPU");	
	public static EntityManager getEntityManager() {
		EntityManager em = emf.createEntityManager();
		if(em != null) {
			return em;
		}else {
			return null;
		}		
	}
}
