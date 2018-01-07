package com.example.shdemo.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.example.shdemo.domain.Device;

@Component
@Transactional
public class DeviceManagerHibernateImpl implements DeviceManager {

	@Autowired
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public void addDevice(Device device) {
		device.setId(null);
		sessionFactory.getCurrentSession().persist(device);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Device> getAllDevices() {
		return sessionFactory.getCurrentSession()
				.getNamedQuery("device.all").list();
	}

	@Override
	public List<Device> findDevicesByName(Device device) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Device> findDevicesByScreenSize(Device device) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Device> findDevicesByDate(Device device) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateDevice(Device device, Device newDevice) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int removeDevicesByName(Device device) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void addDevices(List<Device> devices) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateDevices(List<Device> devices, List<Device> newDevices) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int deleteDevices(List<Device> devices) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
