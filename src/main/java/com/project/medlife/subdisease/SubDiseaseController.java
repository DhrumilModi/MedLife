package com.project.medlife.subdisease;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin
@RestController
public class SubDiseaseController {

	@Autowired
	private SubDiseaseService subDiseaseService;

	@RequestMapping(value = "/view-all-subdisease")
	public List<SubDisease> getAllSubDisease() {
		return subDiseaseService.getAllSubDisease();
	}
	
	@RequestMapping(value = "/view-subdisease-by-disease/{diseaseId}")
	public List<SubDisease> getAllSubDiseaseByDisease(@PathVariable("diseaseId") int diseaseId) {
		return subDiseaseService.getAllSubDiseaseByDiseaseId(diseaseId);
	}
	
	@PostMapping(value = "/deleteSubDisease/{subDiseaseId}")
	public void deleteDisease(@PathVariable("subDiseaseId") int subDiseaseId) {
		subDiseaseService.deleteSubDisease(subDiseaseId);
	}
}
