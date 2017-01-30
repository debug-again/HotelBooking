package com.hutshed.service;

import com.hutshed.dao.BookingDAO;
import com.hutshed.model.Bookings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service("bookingService")
public class BookingServiceImpl implements BookingService {

    @Autowired
    BookingDAO bookingDAO;

    @Transactional
    public long createBooking(Bookings bookings) {
        bookings.setCheckIn(new Date());
        return bookingDAO.createBooking(bookings);
    }
}
