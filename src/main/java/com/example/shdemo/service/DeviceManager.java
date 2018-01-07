package com.example.shdemo.service;

import java.util.List;

import com.example.shdemo.domain.Device;

  interface DeviceManager {
	
	void addDevice(Device device);
	List<Device> getAllDevices();
	List<Device> findDevicesByName(Device device);
	List<Device> findDevicesByScreenSize(Device device);
	List<Device> findDevicesByDate(Device device);
	int updateDevice(Device device, Device newDevice);
	int removeDevicesByName(Device device);
	void addDevices(List<Device> devices);
	void updateDevices(List<Device> devices, List<Device> newDevices);
	int deleteDevices(List<Device> devices);
}
