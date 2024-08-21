package com.Honda.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="users")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class User extends BaseEntity{
	@Column(name="Uname",length=20,nullable=true)
private String name;
	@Column(name="Email",length=30,nullable=true,unique =true)
private String email;
	@Column(name="Password",length=20,nullable=true)
	@Size(min=6)
private String password;
	@Column(name="City",length=20,nullable=true)
private String city;
	@Column(name="Contact_No",length=10,nullable=true,unique = true)
private String contactNo;
}
