package hal.controller;

import java.util.ArrayList;
import hal.Actuator;
import hal.ActuatorType;
import hal.Device;
import hal.HalFactory;
import hal.HomeAutomationSystem;
import hal.Room;
import hal.Sensor;
import hal.SensorType;
import hal.SmartHome;
import hal.application.HALApplication;

public class HALController {
	
	public static String addRoom(String roomName) {
		if (isStringValid(roomName)) {
			return "Room name must be specified";
		}
		if (existsRoom(roomName)) {
			return "Room with name " + roomName + " already exists";
		}
		HomeAutomationSystem homeAutomationSystem = HALApplication.getHomeAutomationSystem();
		SmartHome smartHome = homeAutomationSystem.getSmarthome().get(0);
        Room r = HalFactory.eINSTANCE.createRoom();
        r.setName(roomName);
		smartHome.getRoom().add(r);
		HALApplication.save();
		return null;
	}
	
	//returns a list of <deviceName, deviceType>
	public static ArrayList<ArrayList<String>> showDevicesOfRoom(String roomName) {
		ArrayList<ArrayList<String>> returnList = new ArrayList<ArrayList<String>>();
		for (Device device : findRoom(roomName).getDevice()) {
			ArrayList<String> entry = new ArrayList<String>();
			entry.add(device.getName());
			if (device instanceof Sensor) {
				entry.add(((Sensor) device).getType().getName());
			} else {
				entry.add(((Actuator) device).getType().getName());
			}
			returnList.add(entry);
		}
		return returnList;
	}
	
	public static String updateRoomName(String oldRoomName, String newRoomName) {
		if (isStringValid(oldRoomName)) {
			return "Old room name must be specified";
		}
		if (isStringValid(newRoomName)) {
			return "New room name must be specified";
		}
		if (existsRoom(newRoomName)) {
			return "Room with name " + newRoomName + " already exists";
		}
		if (!existsRoom(oldRoomName)) {
			return "Room with name " + oldRoomName + " does not exist";
		}
        Room r = findRoom(oldRoomName);
        r.setName(newRoomName);
		HALApplication.save();
		return null;
	}
	
	public static String deleteRoom(String roomName) {
		if (isStringValid(roomName)) {
			return "Room name must be specified";
		}
		if (!existsRoom(roomName)) {
			return "Room with name " + roomName + " does not exist";
		}
		HomeAutomationSystem homeAutomationSystem = HALApplication.getHomeAutomationSystem();
		SmartHome smartHome = homeAutomationSystem.getSmarthome().get(0);
		Room room = findRoom(roomName);
		smartHome.getRoom().remove(room);
		HALApplication.save();
		return null;
	}
	
	public static String addDeviceToRoom(String roomName, String deviceName, boolean isSensor, int deviceType) {
		if (isStringValid(roomName) || isStringValid(deviceName)) {
			return "Room name must be specified";
		}
		if (!existsRoom(roomName)) {
			return "Room with name " + roomName + " does not exist";
		}
		if (existsDevice(deviceName)) {
			return "Device with name " + deviceName + " already exists";
		}
		if (deviceType > 2) {
			return "Invalid device type";
		}
		Room room = findRoom(roomName);
		if(isSensor) {
			Sensor sensor = HalFactory.eINSTANCE.createSensor();
			sensor.setName(deviceName);
			sensor.setType(SensorType.get(deviceType));
			room.getDevice().add(sensor);
		} else {
			Actuator actuator = HalFactory.eINSTANCE.createActuator();
			actuator.setName(deviceName);
			actuator.setType(ActuatorType.get(deviceType));
			room.getDevice().add(actuator);
		}
		HALApplication.save();
		return null;
	}
	
	public static String deleteDeviceFromRoom(String roomName, String deviceName) {
		if (isStringValid(roomName) && isStringValid(deviceName)) {
			return "Room name must be specified";
		}
		if (!existsRoom(roomName)) {
			return "Room with name " + roomName + " does not exist";
		}
		if (!existsDevice(deviceName)) {
			return "Device with name " + deviceName + " does not exist";
		}
		Room room = findRoom(roomName);
		Device device = findDevice(deviceName);
		room.getDevice().remove(device);
		HALApplication.save();
		return null;
	}
	
	// validation

	private static boolean existsRoom(String roomName) {
		return findRoom(roomName) != null;
	}
	
	private static boolean existsDevice(String deviceName) {
		return findDevice(deviceName) != null;
	}

	private static boolean isStringValid( String s) {
		return s == null || s.length() == 0;
	}
	
	// helper methods
	
	private static Room findRoom(String roomName) {
		HomeAutomationSystem homeAutomationSystem = HALApplication.getHomeAutomationSystem();
		SmartHome smartHome = homeAutomationSystem.getSmarthome().get(0);
		for (Room r : smartHome.getRoom()) {
			if (r.getName().equals(roomName)) {
				return r;
			}
		}
		return null;
	}
	
	private static Device findDevice(String deviceName) {
		HomeAutomationSystem homeAutomationSystem = HALApplication.getHomeAutomationSystem();
		SmartHome smartHome = homeAutomationSystem.getSmarthome().get(0);
		for (Room r : smartHome.getRoom()) {
			for (Device d : r.getDevice()) {
				if (d.getName().equals(deviceName)) {
					return d;
				}
			}
		}
		return null;
	}

}
