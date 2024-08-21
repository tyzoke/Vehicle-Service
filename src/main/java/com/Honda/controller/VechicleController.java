package com.Honda.controller;

import java.time.LocalDateTime;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Honda.dto.ApiResponse;
import com.Honda.entity.Vechicle;
import com.Honda.service.VechicleService;

import io.swagger.v3.oas.annotations.Operation;



@RestController
@RequestMapping("/vech")
public class VechicleController {
@Autowired
private VechicleService vechicleService;
	
	public VechicleController() {
		System.out.println("in ctor of " +getClass());
	}
	
//*************************************************************************************************
	//Create
//-------------------------------------------------------------------------------------------------	
	//URL-http://localhost:8080/vech
	//Method-POST
	
	@PostMapping
	public ResponseEntity<?> addVech(@RequestBody Vechicle vechicle){
		
		System.out.println("Adding Vechicle!!!!");
		return ResponseEntity.status(HttpStatus.CREATED).body(vechicleService.addVech(vechicle));
	}
	
//*************************************************************************************************
//Retrieve
//--------------------------------------------------------------------------------------------------	
	//URL-http://localhost:8080/vech
	//Method-GET
	
	@GetMapping
public ResponseEntity<?> getVech() {
		System.out.println("in getting list of vechicle");
		return ResponseEntity.ok(vechicleService.getVech());
	}
	
//---------------------------------------------------------------------------------------------------	
	//URL-http://localhost:8080/vech/1
	//Method-GET
	
	@GetMapping("/{vechicleId}")
	@Operation(description="Get vechicle by Id")
	public ResponseEntity<?> getDetailById(@PathVariable Long vechicleId){
		System.out.println("in get detail by id"+vechicleId);
		try {
			return ResponseEntity.status(HttpStatus.OK).body(vechicleService.getByIdNumber(vechicleId));
		}catch (RuntimeException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ApiResponse(e.getMessage(), LocalDateTime.now()));
		}
	}
//***************************************************************************************************
	//Update
//---------------------------------------------------------------------------------------------------
	//URl-http://localhost:8080/vech/1
		//Method =PUT
	
	@PutMapping("/{vechicleId}")
	public ResponseEntity<?> updateVechicle(@PathVariable Long id,@RequestBody Vechicle vechicle){
		
		return ResponseEntity.status(HttpStatus.OK).body(vechicleService.updateVechicleDetails(id, vechicle));
	}
	
//***************************************************************************************************	
//Delete
//------------------------------------------------------------------------------------------------	
	//URl-http://localhost:8080/vech/1
	//Method =Delete
	
	@DeleteMapping("/{vechicleId}")
	public ResponseEntity<?> removeVechicle(@PathVariable Long vechicleId){
		
	return ResponseEntity.ok(vechicleService.removeVechicle(vechicleId)); 	
	}
//---------------------------------------------------------------------------------------------------	
//***************************************************************************************************
}
