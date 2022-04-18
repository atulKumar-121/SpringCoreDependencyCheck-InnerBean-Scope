package com.learn.spring.dependencycheck;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

public class Prescription {
	private int id;
	private String name;
	private List<String> medicines;

	@Override
	public String toString() {
		return "Prescription [id=" + id + ", name=" + name + ", medicines=" + medicines + "]";
	}

	public int getId() {
		return id;
	}
	@SuppressWarnings("deprecation")
	@Required
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	@SuppressWarnings("deprecation")
	@Required
	public void setName(String name) {
		this.name = name;
	}

	public List<String> getMedicines() {
		return medicines;
	}
	@SuppressWarnings("deprecation")
	@Required
	public void setMedicines(List<String> medicines) {
		this.medicines = medicines;
	}

}
