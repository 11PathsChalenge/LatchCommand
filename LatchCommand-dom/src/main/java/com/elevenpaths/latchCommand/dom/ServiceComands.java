package com.elevenpaths.latchCommand.dom;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Column;
@PersistenceCapable()
public class ServiceComands {

	private String latchId;
	private String command;
	private boolean enabled;
	@Column(allowsNull="false")
	public String getLatchId() {
		return latchId;
	}
	public void setLatchId(String latchId) {
		this.latchId = latchId;
	}
	@Column(allowsNull="false")
	public String getCommand() {
		return command;
	}
	public void setCommand(String command) {
		this.command = command;
	}
	@Column(allowsNull="false")
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
}
