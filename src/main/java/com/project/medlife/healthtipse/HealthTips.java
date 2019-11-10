package com.project.medlife.healthtipse;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class HealthTips {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int healthTipId;

	private String name;

	private String discription;

	public int getHealthTipId() {
		return healthTipId;
	}

	public void setHealthTipId(int healthTipId) {
		this.healthTipId = healthTipId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

}
