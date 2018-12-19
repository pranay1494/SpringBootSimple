package com.pranay.demo.hello;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Characters {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String specialMove;
	
	public Characters() {
		
	}
	
	public Characters(String name,String specialMove){
		this.name = name;
		this.specialMove = specialMove;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecialMove() {
		return specialMove;
	}
	public void setSpecialMove(String specialMove) {
		this.specialMove = specialMove;
	}

}
