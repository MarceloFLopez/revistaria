package br.com.projeto.util;

import javax.persistence.EntityManager;

public class UtilTest {

	public static void main(String[] args) {
		

		EntityManager em = JPAUtil.getEntityManager();
		
				System.out.println(em);
				em.close();
				System.out.println(em);
	}
}
