package com.project.medlife.subdisease;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SubDiseaseRepo extends JpaRepository<SubDisease, Integer> {

	List<SubDisease> findByDiseaseDiseaseId(int diseaseId);
	
}
