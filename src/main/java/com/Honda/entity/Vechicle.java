package com.Honda.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="vechicles")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Vechicle extends BaseEntity {
	@Column(name="Vname",nullable=true,length=20)
private String name;
	@Column(name="Vcompany",nullable=true,length=20)
private String Company;
	@Column(name="Vnumber",nullable=true,length=20)
private String Number;
	@Enumerated(EnumType.STRING)
	@Column(name="Vtype",nullable=true,length=20)
private VType type;
	@ManyToOne
	@JoinColumn(name="user_id")
private User usr;
}
