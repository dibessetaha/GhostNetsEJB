package com.daoImpl;

import java.util.List;

import com.dao.IGhostNets;
import com.entities.GhostNets;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;

@Stateless
public class GhostNetsImp implements IGhostNets  {

	@PersistenceContext(unitName = "UP_GHOSTNETS" )
	private EntityManager em ; 
	
	
	@Override
	public List<GhostNets> getAll() {
		Query req = em.createQuery("Select g from GhostNets g ") ; 
		return req.getResultList();
	}


	@Override
	public GhostNets getOne(Long id) {
		GhostNets ghostNets = em.find(GhostNets.class, id) ; 
		if(ghostNets == null) throw new RuntimeException("Data not found")  ; 
		return ghostNets ; 
	}


	@Override
	public void addOne(GhostNets ghostNets) {
		em.persist(ghostNets);
	}


	@Override 
	public GhostNets updateOne(Long id , GhostNets ghostNets) {
		GhostNets ghNets =  getOne(id) ; 
		ghNets.setLocation(ghostNets.getLocation());
		ghNets.setSize(ghostNets.getSize());
		ghNets.setStatus(ghostNets.getStatus());
		ghNets.setSalvingPerson(ghostNets.getSalvingPerson());
		em.persist(ghNets);		
		return ghNets;
	}


	@Override
	public void reportGhostNet(Long id, String status) {
		GhostNets ghostNets = getOne(id); 
		if(ghostNets == null) throw new RuntimeException("Data not found")  ; 
		em.persist(ghostNets);
		
	}


	@Override
	public void deleteOne(Long id) {
		GhostNets ghost = getOne(id) ; 
		em.remove(ghost);
		
	}

}
