package com.project.medlife.healthtipse;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthTipsController {

	@Autowired
	private HealthTipsService healthTipsService;

	@RequestMapping(value = "/view-all-healthtips")
	public List<HealthTips> getAllHealthTips() {
		return healthTipsService.getAllHealthTips();
	}

}
