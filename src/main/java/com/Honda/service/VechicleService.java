package com.Honda.service;

import java.util.List;
import java.util.Optional;

import com.Honda.dto.ApiResponse;
import com.Honda.entity.Vechicle;

public interface VechicleService {
	 //Create
     Vechicle addVech(Vechicle vechicle);
     
     //Retrieve
     List<Vechicle> getVech();
     Optional<Vechicle> getByIdNumber(Long id);
     
     //Update
     ApiResponse updateVechicleDetails(Long id,Vechicle vechi);
	
     //Delete
     ApiResponse removeVechicle(Long Id);
	

}
