package com.project.medlife.disease;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiseaseService {

	@Autowired
	private DiseaseRepo diseaseRepo;

	public List<Disease> viewDiseaseList() {
		return diseaseRepo.findAll();
	}

	public void addDisease(Disease disease) {
		diseaseRepo.save(disease);
	}

	public void deleteDisease(int diseaseId) {
		diseaseRepo.deleteById(diseaseId);
	}

}
