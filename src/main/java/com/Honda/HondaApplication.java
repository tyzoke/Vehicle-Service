package com.Honda;

import org.modelmapper.Conditions;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HondaApplication {

	public static void main(String[] args) {
		SpringApplication.run(HondaApplication.class, args);
	}
	
	@Bean
	public ModelMapper mapper() {
		ModelMapper modelmapper=new ModelMapper();
		modelmapper.getConfiguration()
		.setMatchingStrategy(MatchingStrategies.STRICT)
		.setPropertyCondition(Conditions.isNotNull());
		return modelmapper;
	}

}
