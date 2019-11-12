package com.training.entity;

import java.sql.Date;

public class TripDetails {
	
	private int tripCode;
	private String tourName;
	private Date startDate;
	private Date endDate;
	private String placesCovered;
	private double tripCost;
	
	public TripDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TripDetails(int tripCode, String tourName, Date startDate, Date endDate, String placesCovered,
			double tripCost) {
		super();
		this.tripCode = tripCode;
		this.tourName = tourName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.placesCovered = placesCovered;
		this.tripCost = tripCost;
	}

	public int getTripCode() {
		return tripCode;
	}

	public void setTripCode(int tripCode) {
		this.tripCode = tripCode;
	}

	public String getTourName() {
		return tourName;
	}

	public void setTourName(String tourName) {
		this.tourName = tourName;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getPlacesCovered() {
		return placesCovered;
	}

	public void setPlacesCovered(String placesCovered) {
		this.placesCovered = placesCovered;
	}

	public double getTripCost() {
		return tripCost;
	}

	public void setTripCost(double tripCost) {
		this.tripCost = tripCost;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result + ((placesCovered == null) ? 0 : placesCovered.hashCode());
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
		result = prime * result + ((tourName == null) ? 0 : tourName.hashCode());
		result = prime * result + tripCode;
		long temp;
		temp = Double.doubleToLongBits(tripCost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TripDetails other = (TripDetails) obj;
		if (endDate == null) {
			if (other.endDate != null)
				return false;
		} else if (!endDate.equals(other.endDate))
			return false;
		if (placesCovered == null) {
			if (other.placesCovered != null)
				return false;
		} else if (!placesCovered.equals(other.placesCovered))
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		if (tourName == null) {
			if (other.tourName != null)
				return false;
		} else if (!tourName.equals(other.tourName))
			return false;
		if (tripCode != other.tripCode)
			return false;
		if (Double.doubleToLongBits(tripCost) != Double.doubleToLongBits(other.tripCost))
			return false;
		return true;
	}
	
	
	
	

}
