package br.com.projeto.test;

import javax.persistence.EntityManager;

import br.com.projeto.util.JPAUtil;

public class TesteConn {
	
	EntityManager em = JPAUtil.getEntityManager();
	
//	@Test
	public void test() {
			System.out.println(em);
			em.close();
			System.out.println(em);
	}
}
