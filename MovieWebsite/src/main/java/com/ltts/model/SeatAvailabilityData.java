package com.ltts.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SeatAvailabilityData {

	@Id
	private String movieName;
	private String showDate;
	private int seatsRemaining;
	private int previousBill;
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getShowDate() {
		return showDate;
	}
	public void setShowDate(String showDate) {
		this.showDate = showDate;
	}
	public int getSeatsRemaining() {
		return seatsRemaining;
	}
	public void setSeatsRemaining(int seatsRemaining) {
		this.seatsRemaining = seatsRemaining;
	}
	public int getPreviousBill() {
		return previousBill;
	}
	public void setPreviousBill(int previousBill) {
		this.previousBill = previousBill;
	}
	public SeatAvailabilityData(String movieName, String showDate, int seatsRemaining, int previousBill) {
		super();
		this.movieName = movieName;
		this.showDate = showDate;
		this.seatsRemaining = seatsRemaining;
		this.previousBill = previousBill;
	}
	public SeatAvailabilityData() {
		super();
	}
	@Override
	public String toString() {
		return "SeatAvailabilityData [movieName=" + movieName + ", showDate=" + showDate + ", seatsRemaining="
				+ seatsRemaining + ", previousBill=" + previousBill + "]";
	}
	
	
	
}
