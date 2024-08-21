package com.Honda.dto;

import com.Honda.entity.User;
import com.Honda.entity.VType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class VechicleDto {
	@JsonProperty(access = Access.READ_ONLY)
    private String name;
	@JsonProperty(access = Access.READ_ONLY)
    private String Company;
	@JsonProperty(access = Access.READ_ONLY)
    private String Number;
	@JsonProperty(access = Access.READ_ONLY)
    private VType type;
	@JsonProperty(access = Access.READ_ONLY)
    private User usr;
    
	

}
