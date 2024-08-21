package com.Honda.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

//import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Honda.dto.ApiResponse;
import com.Honda.entity.Vechicle;
import com.Honda.exception.VechicleException;
import com.Honda.repository.VechicleRepository;

@Service
@Transactional
public class VechicleServiceImpl implements VechicleService{

	@Autowired
	private VechicleRepository vechiRepo;
	
//	@Autowired
//	private ModelMapper mapper;
//------------------------------------------------------------------------------------------------	
//create
//================================================================================================	
	@Override
	public Vechicle addVech(Vechicle vechicle) {
		
		return vechiRepo.save(vechicle);
	}

//-------------------------------------------------------------------------------------------------	
//Retrieve
//===================================================================================================	
@Override
public List<Vechicle> getVech() {
	
	return vechiRepo.findAll();
}


@Override
public Optional<Vechicle> getByIdNumber(Long id) {
	
	return vechiRepo.findById(id);
}

//@Override
//public VechicleDto getByIdNumber(Long id) {
//	Vechicle vechicle=vechiRepo.findById(id)
//                    .orElseThrow(()->new VechicleException("vechicle not found"));
//	return mapper.map(vechicle,VechicleDto.class);
//}

//-------------------------------------------------------------------------------------------------	
//Update
//===================================================================================================

@Override
public ApiResponse updateVechicleDetails(Long id, Vechicle vechicle) {
	String msg="Updation failed!!!";
	if(vechiRepo.existsById(id)) {
		vechiRepo.save(vechicle);
		msg="Updation Successfull!!!";
	}
	else {
		throw new VechicleException("Invalid vechicle Id");
	}
	return new ApiResponse(msg,LocalDateTime.now());
}
//-------------------------------------------------------------------------------------------------	
//Delete
//===================================================================================================
public ApiResponse removeVechicle(Long id) {
	Vechicle vechicle=vechiRepo.findById(id).orElseThrow(()->new VechicleException("This vechicle is not registered with us"));
	      vechiRepo.delete(vechicle);
	      return new ApiResponse("Vechicle removed ",LocalDateTime.now());
}


//---------------------------------------------------------------------------------------------------


}
