package com.project.medlife.healthtipse;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HealthTipsService {

	@Autowired
	private HealthTipsRepo healthTipsRepo;

	public List<HealthTips> getAllHealthTips() {
		return healthTipsRepo.findAll();
	}

}
