package com.hutshed.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "BOOKING_HISTORY")
public class BookingHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "BOOKING_ID")
    private int id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "GENDER")
    private String gender;

    @Column(name = "DATE_OF_BIRTH")
    @Temporal(TemporalType.DATE)
    private Date dob;

    @Column(name = "CHECK_IN")
    @Temporal(TemporalType.DATE)
    private Date checkIn;

    @Column(name = "CHECK_OUT")
    @Temporal(TemporalType.DATE)
    private Date checkOut;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PHONE")
    private String phone;

    @Column(name = "ID_TYPE")
    private String idType;

    @Column(name = "ID_NUMBER")
    private String idNumber;

    @Column(name = "NO_ADULTS")
    private int noOfAdults;

    @Column(name = "NO_CHILDRENS")
    private int noOfChildrens;

    @Column(name = "PERMANENT_ADDRESS")
    private String permanentAddress;

    @Column(name = "STATE")
    private String state;

    @Column(name = "PINCODE")
    private int pincode;

    @Column(name="ROOM_NO")
    private int roomNo;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BookingHistory that = (BookingHistory) o;

        if (id != that.id) return false;
        if (noOfAdults != that.noOfAdults) return false;
        if (noOfChildrens != that.noOfChildrens) return false;
        if (pincode != that.pincode) return false;
        if (roomNo != that.roomNo) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (gender != null ? !gender.equals(that.gender) : that.gender != null) return false;
        if (dob != null ? !dob.equals(that.dob) : that.dob != null) return false;
        if (checkIn != null ? !checkIn.equals(that.checkIn) : that.checkIn != null) return false;
        if (checkOut != null ? !checkOut.equals(that.checkOut) : that.checkOut != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (idType != null ? !idType.equals(that.idType) : that.idType != null) return false;
        if (idNumber != null ? !idNumber.equals(that.idNumber) : that.idNumber != null) return false;
        if (permanentAddress != null ? !permanentAddress.equals(that.permanentAddress) : that.permanentAddress != null)
            return false;
        return state != null ? state.equals(that.state) : that.state == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (dob != null ? dob.hashCode() : 0);
        result = 31 * result + (checkIn != null ? checkIn.hashCode() : 0);
        result = 31 * result + (checkOut != null ? checkOut.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (idType != null ? idType.hashCode() : 0);
        result = 31 * result + (idNumber != null ? idNumber.hashCode() : 0);
        result = 31 * result + noOfAdults;
        result = 31 * result + noOfChildrens;
        result = 31 * result + (permanentAddress != null ? permanentAddress.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + pincode;
        result = 31 * result + roomNo;
        return result;
    }

    @Override
    public String toString() {
        return "BookingHistory{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", dob=" + dob +
                ", checkIn=" + checkIn +
                ", checkOut=" + checkOut +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", idType='" + idType + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", noOfAdults=" + noOfAdults +
                ", noOfChildrens=" + noOfChildrens +
                ", permanentAddress='" + permanentAddress + '\'' +
                ", state='" + state + '\'' +
                ", pincode=" + pincode +
                ", roomNo=" + roomNo +
                '}';
    }
}
