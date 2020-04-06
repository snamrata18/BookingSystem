package com.interview.MavenProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.interview.MavenProject.bean.BookingBean;
import com.interview.MavenProject.bean.HotelBean;
import com.interview.MavenProject.bean.UserProfileBean;
import com.interview.MavenProject.dao.Dao;



@RestController
@CrossOrigin("*")
public class Controller {

//	@Autowired
//	CustomerService customerService;
//	
//	@Autowired
//	AdminService adminService;
	
	@Autowired
	Dao dao;
	
	
	/*-----------------HOTEL----------------------*/
	@PostMapping("/Admin/AddHotel")
	public HotelBean addHotel(@RequestBody HotelBean addhotel) {
		System.out.println(addhotel);
		HotelBean hotelbean=dao.addHotel(addhotel);
		return hotelbean;
		
	}

	@GetMapping("/Admin/ListHotel")
	public List<HotelBean> listHotel(){
		List<HotelBean> hotelList=dao.hotelList();
		return hotelList;
	}
	

	@DeleteMapping("/Admin/DelHotel/{Id}")
	public HotelBean delHotel(@PathVariable("Id") int hotelid) {

		HotelBean hotelbean=dao.delHotel(hotelid);
		return hotelbean;
	}
	
	@PutMapping("/Admin/UpdateHotel")
	public HotelBean updateHotel(@RequestBody HotelBean updateHotel) {
		System.out.println(updateHotel);
		HotelBean hotelbean=dao.updateHotel(updateHotel);
		return hotelbean;
	}
	

	/*----------------------------USER---------------------*/
	public UserProfileBean addUser(@RequestBody UserProfileBean adduser) {
		System.out.println(adduser);
		UserProfileBean userbean=dao.addUser(adduser);
		return userbean;
		
	}
	
	@DeleteMapping("/Admin/DelUser/{Id}")
	public UserProfileBean delUser(@PathVariable("Id") int userid) {

		UserProfileBean userbean=dao.delUser(userid);
		return userbean;
	}
	
	@PutMapping("/Admin/UpdateUser")
	public UserProfileBean updateUser(@RequestBody UserProfileBean updateUser) {
		System.out.println(updateUser);
		UserProfileBean userbean=dao.updateUser(updateUser);
		return userbean;
	}
	
	/*---------------------------SEARCH BY----------------------------------------*/
	
	@GetMapping("/Customer/ListHotelByCity/{id}")
	public List<HotelBean> searchByCity(@PathVariable("id") String city){		
		System.out.println(city);
		List<HotelBean> searchByCity=(List<HotelBean>) dao.searchByCity(city);
		return searchByCity;
	}
	
	@GetMapping("/Customer/ListHotelByRooms/{id}")
	public List<HotelBean> searchByRooms(@PathVariable("id") int noOfRooms){		
		System.out.println(noOfRooms);
		List<HotelBean> searchByRooms=(List<HotelBean>) dao.searchByRooms(noOfRooms);
		return searchByRooms;
	}
	
	@GetMapping("/Customer/ListHotelByStars/{id}")
	public List<HotelBean> searchByStars(@PathVariable("id") int stars){		
		System.out.println(stars);
		List<HotelBean> searchByStars=(List<HotelBean>) dao.searchByStars(stars);
		return searchByStars;
	}
	
	@GetMapping("/Customer/ListHotelByTraveller/{id}")
	public List<HotelBean> searchByTraveller(@PathVariable("id") int traveller){		
		System.out.println(traveller);
		List<HotelBean> searchByTraveller=(List<HotelBean>) dao.searchByTraveller(traveller);
		return searchByTraveller;
	}
	
	@GetMapping("/Customer/ListHotelByWifi/{id}")
	public List<HotelBean> searchByWifi(@PathVariable("id") String wifi){		
		List<HotelBean> searchByWifi=(List<HotelBean>) dao.searchByWifi(wifi);
		return searchByWifi;
	}
	
	@GetMapping("/Customer/ListHotelByAC/{id}")
	public List<HotelBean> searchByAC(@PathVariable("id") String ac){		
		List<HotelBean> searchByAC=(List<HotelBean>) dao.searchByAC(ac);
		return searchByAC;
	}
	
	@GetMapping("/Customer/ListHotelByRestaurant/{id}")
	public List<HotelBean> searchByRestaurantAvailable(@PathVariable("id") String ra){		
		List<HotelBean> searchByRestaurant=(List<HotelBean>) dao.searchByRestaurant(ra);
		return searchByRestaurant;
	}
	
	@GetMapping("/Customer/ListHotelByCost/{id}")
	public List<HotelBean> searchByCost(@PathVariable("id") int cost){		
		List<HotelBean> searchByCost=(List<HotelBean>) dao.searchByCost(cost);
		return searchByCost;
	}
	
	@GetMapping("/Customer/ListHotelByRating/{id}")
	public List<HotelBean> searchByRating(@PathVariable("id") int rating){		
		List<HotelBean> searchByRating=(List<HotelBean>) dao.searchByRating(rating);
		return searchByRating;
	}
	
	@PostMapping("/Customer/bookRoom")
	public BookingBean bookRoom(@RequestBody BookingBean bookingBean )
	{
		BookingBean bookingbeanBook= dao.bookRoom(bookingBean);
		return bookingbeanBook;
	}
	
	
	
	
}
