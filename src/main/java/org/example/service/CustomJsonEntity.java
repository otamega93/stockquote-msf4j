package org.example.service;

public class CustomJsonEntity {

	private String name;
	
	private String description;

	public CustomJsonEntity(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}

	public CustomJsonEntity() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "CustomJsonEntity [name=" + name + ", description=" + description + "]";
	}

}
