package com.example.shdemo.domain;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@NamedQueries({ 
	@NamedQuery(name = "device.all", query = "Select d from Device d"),
	//@NamedQuery(name = "person.byPin", query = "Select p from Person p where p.pin = :pin")
})

public class Device {
	
	private Long id;
	private String deviceName;
	private double screenSize;
	private Calendar dateOfRelease;
	
	public Device() {
		super();
	}
	
	public Device(String deviceName, double screenSize, Calendar dateOfRelease) {
		super();
		this.deviceName = deviceName;
		this.screenSize = screenSize;
		this.dateOfRelease = dateOfRelease;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(unique = true, nullable = false)
	public String getDeviceName() {
		return deviceName;
	}
	
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	
	@Column(unique = false, nullable = false)
	public double getScreenSize() {
		return screenSize;
	}
	
	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}
	
	@Column(unique = false, nullable = false)
	@Temporal(TemporalType.DATE)
	public Calendar getDateOfRelease() {
		return dateOfRelease;
	}
	
	public void setDateOfRelease(Calendar dateOfRelease) {
		this.dateOfRelease = dateOfRelease;
	}
}
