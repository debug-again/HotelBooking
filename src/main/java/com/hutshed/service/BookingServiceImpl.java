package com.hutshed.service;

import com.hutshed.dao.BookingDAO;
import com.hutshed.model.BookingHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("bookingService")
public class BookingServiceImpl implements BookingService {

    @Autowired
    BookingDAO bookingDAO;

    @Transactional
    public long createBooking(BookingHistory bookingHistory) {
        return bookingDAO.createBooking(bookingHistory);
    }
}
