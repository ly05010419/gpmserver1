package com.management.server1;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentDao {

	private SessionFactory sessionFactory;
	private Session session;

	public StudentDao() {
		Configuration configuration = new Configuration().configure();// 创建配置对象
		sessionFactory = configuration.buildSessionFactory();// 创建会话工厂
		session = sessionFactory.openSession();// 开启会话
	}

	public List<Student> getAllStudents() {

		List<Student> list = session.createQuery("from Student c").list();
		return list;
	}

	public Student getStudentById(String id) {
		List<Student> list = session.createQuery("from Student c where id=?").setString(0, id).list();

		Student thesis = null;

		for (Student t : list) {
			thesis = (Student) t;
		}

		return thesis;
	}

	public Student updateStudentById(String id, String passed_colloquium, String passed_bachelor_thesis) {

		Student thesis = getStudentById(id);

		thesis.setPassed_colloquium(passed_colloquium);
		thesis.setPassed_bachelor_thesis(passed_bachelor_thesis);

		session.beginTransaction();
		session.save(thesis);
		session.getTransaction().commit();

		return thesis;
	}

}
