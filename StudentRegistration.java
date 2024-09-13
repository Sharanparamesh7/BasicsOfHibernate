package com.iisn.hibernate.BasicsOfHibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class StudentRegistration {
    
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int regNo;
    private String name;
    private String dept;
    @OneToOne
    private BusRouteDetails busRoute;
    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

	public BusRouteDetails getBusRoute() {
		return busRoute;
	}

	public void setBusRoute(BusRouteDetails busRoute) {
		this.busRoute = busRoute;
	}
    
    
}
