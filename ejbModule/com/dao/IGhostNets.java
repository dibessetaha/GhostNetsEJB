package com.dao;

import java.util.List;

import com.entities.GhostNets;

public interface IGhostNets {
	
	public List<GhostNets> getAll() ; 
	public GhostNets getOne(Long id) ; 
	public void addOne(GhostNets ghostNets) ; 
	public GhostNets updateOne(Long id, GhostNets ghostNets) ; 
	public void reportGhostNet(Long id, String status) ; 
	


}
