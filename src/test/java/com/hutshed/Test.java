package com.hutshed;

import com.hutshed.model.BookingHistory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

    public static void main(String[] args) {

        Session session = null;
        Transaction txn = null;
        try {
            SessionFactory sessionFactory =  new Configuration().configure("test/hibernate-test.cfg.xml").buildSessionFactory();
            session = sessionFactory.openSession();
            txn = session.beginTransaction();
            BookingHistory bookingHistory = new BookingHistory();
            bookingHistory.setId(1);
            bookingHistory.setName("test");
            session.save(bookingHistory);
            txn.commit();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (!txn.wasCommitted()) {
                txn.rollback();
            }

            session.flush();
            session.close();
        }
    }
}
