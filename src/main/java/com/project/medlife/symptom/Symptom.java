package com.project.medlife.symptom;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Symptom {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int symptomId;

	private String shortDiscription;

	private String longDiscription;

	public int getSymptomId() {
		return symptomId;
	}

	public void setSymptomId(int symptomId) {
		this.symptomId = symptomId;
	}

	public String getShortDiscription() {
		return shortDiscription;
	}

	public void setShortDiscription(String shortDiscription) {
		this.shortDiscription = shortDiscription;
	}

	public String getLongDiscription() {
		return longDiscription;
	}

	public void setLongDiscription(String longDiscription) {
		this.longDiscription = longDiscription;
	}

}
