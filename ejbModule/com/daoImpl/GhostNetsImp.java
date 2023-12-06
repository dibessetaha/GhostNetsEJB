package com.daoImpl;

import java.util.List;

import com.dao.IGhostNets;
import com.entities.GhostNets;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Stateless
public class GhostNetsImp implements IGhostNets  {

	@PersistenceContext(unitName = "UP_GHOSTNETS" )
	private EntityManager em ; 
	
	
	@Override
	public List<GhostNets> getAll() {
		Query req = em.createQuery("Select g from GhostNets g ") ; 
		return req.getResultList();
	}

}
