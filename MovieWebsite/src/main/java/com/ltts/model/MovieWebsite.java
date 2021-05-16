package com.ltts.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MovieWebsite {

	@Id
	private String movieName;
	private String circleType;
	private String dateOfBooking;
	private String showDate;
	private int noOfTickets;
	private String showtime;
	public String getShowtime() {
		return showtime;
	}
	public void setShowtime(String showtime) {
		this.showtime = showtime;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getCircleType() {
		return circleType;
	}
	public void setCircleType(String circleType) {
		this.circleType = circleType;
	}
	public String getDateOfBooking() {
		return dateOfBooking;
	}
	public void setDateOfBooking(String dateOfBooking) {
		this.dateOfBooking = dateOfBooking;
	}
	public String getShowDate() {
		return showDate;
	}
	public void setShowDate(String showDate) {
		this.showDate = showDate;
	}
	public int getNoOfTickets() {
		return noOfTickets;
	}
	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}
	public MovieWebsite(String movieName, String circleType, String dateOfBooking, String showDate, int noOfTickets, String showtime) {
		
		this.movieName = movieName;
		this.circleType = circleType;
		this.dateOfBooking = dateOfBooking;
		this.showDate = showDate;
		this.noOfTickets = 500;
		this.showtime = showtime;
	}
	public MovieWebsite() {
		super();
	}
	@Override
	public String toString() {
		return "MovieWebsite [movieName=" + movieName + ", circleType=" + circleType + ", dateOfBooking="
				+ dateOfBooking + ", showDate=" + showDate + ", noOfTickets=" + noOfTickets + ", showtime= " + showtime +"]";
	}
	
	
	
	
}
