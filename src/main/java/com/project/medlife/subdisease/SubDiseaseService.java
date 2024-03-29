package com.project.medlife.subdisease;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubDiseaseService {

	@Autowired
	private SubDiseaseRepo subDiseaseRepo;

	public List<SubDisease> getAllSubDisease() {
		return subDiseaseRepo.findAll();
	}
	
	public List<SubDisease> getAllSubDiseaseByDiseaseId(int diseaseId){
		return subDiseaseRepo.findByDiseaseDiseaseId(diseaseId);
	}
	
	public void deleteSubDisease(int subDiseaseId) {
		subDiseaseRepo.deleteById(subDiseaseId);
	}

}
