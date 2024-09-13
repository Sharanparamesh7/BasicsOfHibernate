package com.iisn.hibernate.BasicsOfHibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BusRouteDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int busNo;
    private String busRoute;
	public int getBusNo() {
		return busNo;
	}
	public void setBusNo(int busNo) {
		this.busNo = busNo;
	}
	public String getBusRoute() {
		return busRoute;
	}
	public void setBusRoute(String busRoute) {
		this.busRoute = busRoute;
	}
	
    
    
}
