package com.cg.payroll.daoservices;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.cg.payroll.bean.Associate;
import com.cg.payroll.bean.BankDetails;
import com.cg.payroll.bean.Salary;
import com.cg.payroll.exceptions.PayrollServicesDownException;
import com.cg.payroll.utilities.PayrollUtility;
@Component(value="payrollDAOServices")
public class PayrollDAOServicesImpl implements PayrollDAOServices {
	@Autowired
	private SessionFactory sessionFactory;

	public int insertAssociate(Associate associate) throws SQLException {
		Session session=sessionFactory.openSession();
		Transaction tx =session.beginTransaction();
		try{
			Integer associateId=(Integer) session.save(associate);
			tx.commit();
			return associateId;
		}catch(HibernateException e){
			tx.rollback();
			e.printStackTrace();
			throw e;
		}	
		finally{
			session.close();
		}
	}

	public boolean updateAssociate(Associate associate) throws SQLException {

		Session session = sessionFactory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction(); 
			session.update(associate); 
			tx.commit();
		} catch (HibernateException e) {
			if (tx!=null) tx.rollback();
			e.printStackTrace(); 
		} finally {
			session.close(); 
		}
		return true;
	}

	public boolean deleteAssociate(int associateID) {
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Associate associate=(Associate) session.get(Associate.class, associateID);
			session.delete(associate); 
			tx.commit();
		} catch (HibernateException e) {
			if (tx!=null) tx.rollback();
			e.printStackTrace(); 
		} finally {
			session.close(); 
		}
		return true;
	}


	public Associate getAssociate(int associateID) {
		return (Associate) sessionFactory.openSession().get(Associate.class,associateID);
	}

	public List<Associate> getAssociates() {
		Session session =sessionFactory.openSession();
		Query query= session.createQuery("from Associate a");
		return query.list();
	}

}