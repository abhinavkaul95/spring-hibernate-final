/**
 * 
 */
package com.training.utils;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Service;

import com.training.entity.Donor;
import com.training.entity.Project;

/**
 * @author akaul5
 *
 */

@Service
public class DonorDao {
	
  @Autowired
  HibernateTemplate hibernateTemplate;
		  
  public Object add(Donor donor) {
    Object rowAdded = hibernateTemplate.save(donor);
	return rowAdded;
  }
  
  public Donor find(Serializable key) {
	Donor donor = hibernateTemplate.get(Donor.class, key);
	return donor;
}
  public List<Donor> findAll() {
	  List<Donor> donorList = (List<Donor>)hibernateTemplate.find("FROM Donor");
		return donorList;
	}
}
