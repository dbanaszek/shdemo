package com.example.shdemo.service;

import java.util.List;

import com.example.shdemo.domain.Device;

  interface DeviceManager {
	
	void addDevice(Device device);
	List<Device> getAllDevices();
	List<Device> findDevicesByName(String name);
	List<Device> findDevicesByScreenSize(double screenSize);
	void updateDevice(Long deviceId, Device newDevice);
	void addDevices(List<Device> devices);
	void updateDevices(List<Device> devices, List<Device> newDevices);
	void deleteDevices(List<Device> devices);
}
