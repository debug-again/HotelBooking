package com.hutshed.dao;

import com.hutshed.model.BookingHistory;

public interface BookingDAO {
    long createBooking(BookingHistory bookingHistory);
}
