package com.hutshed.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "BOOKINGS")
public class Bookings {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BookingIdSeq")
    @SequenceGenerator(name = "BookingIdSeq", sequenceName = "BOOKING_ID_SEQ", allocationSize = 1, initialValue = 1000)
    @Column(name = "BOOKING_ID", nullable = false, unique = true)
    private int id;

    @Column(name = "NAME", nullable = false, length = 50)
    private String name;

    @Column(name = "GENDER", nullable = false, length = 10)
    private String gender;

    @Column(name = "DATE_OF_BIRTH", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dob;

    @Column(name = "CHECK_IN", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date checkIn;

    @Column(name = "CHECK_OUT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date checkOut;

    @Column(name = "EMAIL", nullable = true, length = 30)
    private String email;

    @Column(name = "PHONE", nullable = false, length = 20)
    private String phone;

    @Column(name = "ID_TYPE", nullable = false, length = 20)
    private String idType;

    @Column(name = "ID_NUMBER", nullable = false, length = 20)
    private String idNumber;

    @Column(name = "NO_ADULTS", nullable = false, precision = 2, scale = 0)
    private int noOfAdults;

    @Column(name = "NO_CHILDRENS", nullable = true, precision = 2, scale = 0)
    private int noOfChildrens;

    @Column(name = "PERMANENT_ADDRESS", nullable = false, length = 450)
    private String permanentAddress;

    @Column(name = "STATE", nullable = false, length = 30)
    private String state;

    @Column(name = "PINCODE", nullable = false, length = 6)
    private int pincode;

    @Column(name = "ROOM_NO", nullable = false, length = 4)
    private int roomNo;

    @Column(name = "BOOKING_TIME", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date bookingTime;

    public Date getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(Date bookingTime) {
        this.bookingTime = bookingTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public int getNoOfAdults() {
        return noOfAdults;
    }

    public void setNoOfAdults(int noOfAdults) {
        this.noOfAdults = noOfAdults;
    }

    public int getNoOfChildrens() {
        return noOfChildrens;
    }

    public void setNoOfChildrens(int noOfChildrens) {
        this.noOfChildrens = noOfChildrens;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

}
