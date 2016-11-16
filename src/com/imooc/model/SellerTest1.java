package com.imooc.model;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.junit.Before;
import org.junit.Test;

import com.imooc.util.HibernateSessionFactory;

public class SellerTest1 {
	private Session session=null;
	@Test
	public void testSeller(){
		String hql="from";
		Query query=session.createQuery(hql);
		List<Seller> sellers=query.list();
		for(Seller seller:sellers){
			System.out.println(seller);
		}
	}
	@Before
	public void setUp() throws Exception{
		session=HibernateSessionFactory.getCurrentSession();
	}
}
