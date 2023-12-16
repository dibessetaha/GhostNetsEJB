package com.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Salvings")
public class SalvingPerson implements Serializable {
	
	@Id
	private Long id ; 
	
	private String firstName ; 
	
	private String lastName ; 
	
	@Column(unique = true)
	private String username ; 
	
	private String password ;
	
	@OneToMany(mappedBy = "salvingPerson")
    private List<GhostNets> ghostNets = new ArrayList<>();
	



	public SalvingPerson() {
	}
	
	

	public SalvingPerson(String firstName, String lastName, String username, String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	} 
	
	public List<GhostNets> getSalvingPersons() {
		return ghostNets;
	}



	public void setSalvingPersons(List<GhostNets> ghostNets) {
		this.ghostNets = ghostNets;
	}

	
}
