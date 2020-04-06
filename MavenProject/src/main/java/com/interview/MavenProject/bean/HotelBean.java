package com.interview.MavenProject.bean;

import javax.persistence.Column;
import javax.persistence.Id;

@javax.persistence.Entity
@javax.persistence.Table(name="hotel")

public class HotelBean {

	@Id
	@Column(name="hotelId")
	private int hotelId;
	@Column(name="hotelName")
	private String hotelName;
	@Column(name="hotelCity")
	private String hotelCity;
	@Column(name="noOfRooms")
	private int noOfRooms;
	@Column(name="wifi")
	private String wifi;
	@Column(name="AC")
	private String AC;
	@Column(name="restaurantAvailable")
	private String restaurantAvailable;
	@Column(name="noOfStars")
	private int noOfStars;
	@Column(name="meals")
	private String meals;
	@Column(name="costOfStay")
	private int costOfStay;
	public int getHotelId() {
		return hotelId;
	}
	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getHotelCity() {
		return hotelCity;
	}
	public void setHotelCity(String hotelCity) {
		this.hotelCity = hotelCity;
	}
	public int getNoOfRooms() {
		return noOfRooms;
	}
	public void setNoOfRooms(int noOfRooms) {
		this.noOfRooms = noOfRooms;
	}
	public String getWifi() {
		return wifi;
	}
	public void setWifi(String wifi) {
		this.wifi = wifi;
	}
	public String getAC() {
		return AC;
	}
	public void setAC(String aC) {
		AC = aC;
	}
	public String getRestaurantAvailable() {
		return restaurantAvailable;
	}
	public void setRestaurantAvailable(String restaurantAvailable) {
		this.restaurantAvailable = restaurantAvailable;
	}
	public int getNoOfStars() {
		return noOfStars;
	}
	public void setNoOfStars(int noOfStars) {
		this.noOfStars = noOfStars;
	}
	public String getMeals() {
		return meals;
	}
	public void setMeals(String meals) {
		this.meals = meals;
	}
	public int getCostOfStay() {
		return costOfStay;
	}
	public void setCostOfStay(int costOfStay) {
		this.costOfStay = costOfStay;
	}
	@Override
	public String toString() {
		return "HotelBean [hotelId=" + hotelId + ", hotelName=" + hotelName + ", hotelCity=" + hotelCity
				+ ", noOfRooms=" + noOfRooms + ", wifi=" + wifi + ", AC=" + AC + ", restaurantAvailable="
				+ restaurantAvailable + ", noOfStars=" + noOfStars + ", meals=" + meals + ", costOfStay=" + costOfStay
				+ "]";
	}
	public HotelBean(int hotelId, String hotelName, String hotelCity, int noOfRooms, String wifi, String aC,
			String restaurantAvailable, int noOfStars, String meals, int costOfStay) {
		super();
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.hotelCity = hotelCity;
		this.noOfRooms = noOfRooms;
		this.wifi = wifi;
		AC = aC;
		this.restaurantAvailable = restaurantAvailable;
		this.noOfStars = noOfStars;
		this.meals = meals;
		this.costOfStay = costOfStay;
	}
	public HotelBean() {
		super();
	}
}

