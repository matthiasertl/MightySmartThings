/**
 *  Shelly 1 Switch
 *  (Model: unknown)
 *
 *  Author: 
 *    Matthias Ertl
 *
 *
 *
 *	THIS DEVICE IS NOT WORKING !!!!!!
 *
 *
 *
 */
 
metadata {
	definition (
		name: "Shelly Cloud 1 Switch", 
		namespace: "MightySmartThings", 
		author: "Matthias Ertl"
	) {
		capability "Actuator"
		capability "Sensor"
		capability "Switch"		
		capability "Outlet"
		capability "Power Meter"
		capability "Energy Meter"
		capability "Voltage Measurement"
		capability "Acceleration Sensor"
		capability "Contact Sensor"
		capability "Configuration"
		capability "Refresh"
		capability "Polling"
		
		attribute "lastCheckin", "number"
		attribute "status", "string"
		attribute "current", "number"
		attribute "currentL", "number"
		attribute "currentH", "number"
		attribute "voltageL", "number"
		attribute "voltageH", "number"
		attribute "powerL", "number"
		attribute "powerH", "number"
		attribute "energyTime", "number"
		attribute "energyCost", "number"
		attribute "energyDuration", "string"
		attribute "prevEnergyCost", "number"
		attribute "prevEnergyDuration", "string"
		
		command "resetEnergy"
		command "resetPower"
		command "resetVoltage"
		command "resetCurrent"
		
	}
	
