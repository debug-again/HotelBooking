package com.hutshed.controllers;

import com.hutshed.model.Bookings;
import com.hutshed.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/rest")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @RequestMapping(value = "/createBooking", method = RequestMethod.POST)
    public long createBooking(@RequestBody Bookings bookings) {
        return bookingService.createBooking(bookings);
    }
}
