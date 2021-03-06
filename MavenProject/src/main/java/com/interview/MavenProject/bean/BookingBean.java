package com.interview.MavenProject.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="booking")

public class BookingBean {
	
	@Id
	@Column(name="bookingId")
	private int bookingId;
	@Column(name="userId")
	private int userId;
	@Column(name="hotelId")
	private HotelBean hotelId;
	@Column(name="review")
	private String review;
	@Column(name="reservationCapacity")
	private int reservationCapacity;
	public BookingBean(int bookingId, int userId, HotelBean hotelId, String review, int reservationCapacity) {
		super();
		this.bookingId = bookingId;
		this.userId = userId;
		this.hotelId = hotelId;
		this.review = review;
		this.reservationCapacity = reservationCapacity;
	}
	public int getReservationCapacity() {
		return reservationCapacity;
	}
	public void setReservationCapacity(int reservationCapacity) {
		this.reservationCapacity = reservationCapacity;
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public HotelBean getHotelId() {
		return hotelId;
	}
	public void setHotelId(HotelBean hotelId) {
		this.hotelId = hotelId;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	@Override
	public String toString() {
		return "BookingBean [bookingId=" + bookingId + ", userId=" + userId + ", hotelId=" + hotelId + ", review="
				+ review + ", reservationCapacity=" + reservationCapacity + "]";
	}
	
	public BookingBean() {
		super();
	}
	

}



