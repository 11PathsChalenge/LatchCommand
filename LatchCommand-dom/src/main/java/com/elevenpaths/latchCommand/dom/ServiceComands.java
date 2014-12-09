package com.elevenpaths.latchCommand.dom;

public class ServiceComands {
	
	private String appId;
	private String latchId;
	private String nameOfCommand;
	private String commandOn;
	private String commandOff;
	private String latchSecret;
	private boolean enabled;
	
	public String getCommandOff() {
		return commandOff;
	}
	public void setCommandOff(String commandOff) {
		this.commandOff = commandOff;
	}
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public String getNameOfCommand() {
		return nameOfCommand;
	}
	public void setNameOfCommand(String nameOfCommand) {
		this.nameOfCommand = nameOfCommand;
	}
	public String getLatchSecret() {
		return latchSecret;
	}
	public void setLatchSecret(String latchSecret) {
		this.latchSecret = latchSecret;
	}
	public String getLatchId() {
		return latchId;
	}
	public void setLatchId(String latchId) {
		this.latchId = latchId;
	}
	public String getCommandOn() {
		return commandOn;
	}
	public void setCommandOn(String command) {
		this.commandOn = command;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
}
