/**
 * 
 */
package com.training.utils;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Service;

import com.training.entity.Project;

/**
 * @author akaul5
 *
 */

@Service
public class ProjectDao {
	
  @Autowired
  HibernateTemplate hibernateTemplate;
  
  public Object add(Project project) {
    Object rowAdded = hibernateTemplate.save(project);
	return rowAdded;
  }
  
  public Project find(Serializable key) {
	Project project = hibernateTemplate.get(Project.class, key);
	return project;
}
  public List<Project> findAll() {
	  List<Project> projectList = (List<Project>)hibernateTemplate.find("FROM Project");
		return projectList;
	}
}
