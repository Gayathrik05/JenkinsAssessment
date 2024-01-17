package com.rts.evaluation.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Car {
	@Id
	private int carNo;
	@Id
	private String dateOfBooking;
	@Id
	private String fromLocation;
	@Id
	private String toLocation;
	@Id
	private String bookedName;
	@Id
	private String bookedPhoneNumber;
	
	public Car() {
		super();
	}
	public Car(int carNo, String dateOfBooking, String fromLocation, String toLocation, String bookedName,
			String bookedPhoneNumber) {
		super();
		this.carNo = carNo;
		this.dateOfBooking = dateOfBooking;
		this.fromLocation = fromLocation;
		this.toLocation = toLocation;
		this.bookedName = bookedName;
		this.bookedPhoneNumber = bookedPhoneNumber;
	}
	public int getCarNo() {
		return carNo;
	}
	public void setCarNo(int carNo) {
		this.carNo = carNo;
	}
	public String getDateOfBooking() {
		return dateOfBooking;
	}
	public void setDateOfBooking(String dateOfBooking) {
		this.dateOfBooking = dateOfBooking;
	}
	public String getFromLocation() {
		return fromLocation;
	}
	public void setFromLocation(String fromLocation) {
		this.fromLocation = fromLocation;
	}
	public String getToLocation() {
		return toLocation;
	}
	public void setToLocation(String toLocation) {
		this.toLocation = toLocation;
	}
	public String getBookedName() {
		return bookedName;
	}
	public void setBookedName(String bookedName) {
		this.bookedName = bookedName;
	}
	public String getBookedPhoneNumber() {
		return bookedPhoneNumber;
	}
	public void setBookedPhoneNumber(String bookedPhoneNumber) {
		this.bookedPhoneNumber = bookedPhoneNumber;
	}
	@Override
	public String toString() {
		return "Car [carNo=" + carNo + ", dateOfBooking=" + dateOfBooking + ", fromLocation=" + fromLocation
				+ ", toLocation=" + toLocation + ", bookedName=" + bookedName + ", bookedPhoneNumber="
				+ bookedPhoneNumber + "]";
	}
}
