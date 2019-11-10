package com.project.medlife.subdisease;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.project.medlife.disease.Disease;

@Entity
@Table
public class SubDisease {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int subDiseaseId;

	private String name;

	private String discription;

	@OneToOne
	@JoinColumn(name = "diseaseId", nullable = false)
	private Disease disease;

	public int getSubDiseaseId() {
		return subDiseaseId;
	}

	public void setSubDiseaseId(int subDiseaseId) {
		this.subDiseaseId = subDiseaseId;
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

	public Disease getDisease() {
		return disease;
	}

	public void setDisease(Disease disease) {
		this.disease = disease;
	}

}
