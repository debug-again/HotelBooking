package com.hutshed.dao;

import com.hutshed.model.Bookings;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("bookingDAO")
public class BookingDAOImpl implements BookingDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public long createBooking(Bookings bookings) {

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(bookings);
        transaction.commit();
        session.close();
        return 0;
    }
}
