package org.acme.getting.started.config;

import io.quarkus.arc.config.ConfigProperties;

@ConfigProperties(prefix = "container") 
public class ContainerConfig {
	
	private String name;
	
	private String path;
	
	private String script;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getScript() {
		return script;
	}

	public void setScript(String script) {
		this.script = script;
	}
}
