package com.project.medlife.disease;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class DiseaseController {

	@Autowired
	private DiseaseService diseaseService;

	@RequestMapping(value = "/view-all-disease")
	public List<Disease> viewDisease() {
		return diseaseService.viewDiseaseList();
	}

	@PostMapping(value = "/addDisease")
	public String addDisease(@RequestBody Disease disease) {
		return diseaseService.addDisease(disease);
		
	}

	@PostMapping(value = "/updateDisease")
	public void updateDisease(@RequestBody Disease disease) {
		diseaseService.addDisease(disease);
	}

	@PostMapping(value = "/deleteDisease/{diseaseId}")
	public void updateDisease(@PathVariable("diseaseId") int diseaseId) {
		diseaseService.deleteDisease(diseaseId);
	}

}
