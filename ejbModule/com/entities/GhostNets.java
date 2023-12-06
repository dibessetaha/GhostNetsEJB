package com.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ghost_nets")
public class GhostNets {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id ; 
	
	private String location ; 
	
	private String status ; 
	
	private double size ;
	
	@ManyToOne
	private SalvingPerson salvingPerson; 
	
	


	public GhostNets() {}
	

	public GhostNets( String location, String status, double size,SalvingPerson salvingPerson) {
		this.location = location;
		this.status = status;
		this.size = size;
		this.salvingPerson = salvingPerson;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	} 
	
	public SalvingPerson getSalvingPerson() {
		return salvingPerson;
	}


	public void setSalvingPerson(SalvingPerson salvingPerson) {
		this.salvingPerson = salvingPerson;
	}
	
	
	
	
	

}
