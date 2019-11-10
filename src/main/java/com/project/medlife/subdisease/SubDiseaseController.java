package com.project.medlife.subdisease;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubDiseaseController {

	@Autowired
	private SubDiseaseService subDiseaseService;

	@RequestMapping(value = "/view-all-subdisease")
	public List<SubDisease> getAllSubDisease() {
		return subDiseaseService.getAllSubDisease();
	}
}
