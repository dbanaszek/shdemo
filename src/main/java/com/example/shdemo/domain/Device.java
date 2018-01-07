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
		@NamedQuery(name = "device.byName", query = "Select d from Device d where d.deviceName = :name"),
		@NamedQuery(name = "device.byScreen", query = "Select d from Device d where d.screenSize = :screenSize"),
		@NamedQuery(name = "device.byDate", query = "Select d from Device d where d.dateOfRelease = :date")
})

public class Device {
	
	private Long id;
	private String deviceName;
	private double screenSize;
	private Calendar dateOfRelease;


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
