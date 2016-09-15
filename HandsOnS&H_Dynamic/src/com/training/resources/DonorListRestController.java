/**
 * 
 */
package com.training.resources;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.MediaType;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.training.entity.Donor;
import com.training.entity.Project;

/**
 * @author akaul5
 *
 */
@RestController
public class DonorListRestController {
  
  @Autowired
  HibernateTemplate template;
  //String data = "";
  @RequestMapping(value="ViewDonorList/{projectId}")  
  public @ResponseBody Set<Donor> getDonorList(@PathVariable("projectId") long projectId) {
	Project project = template.get(Project.class, projectId);
	Set<Donor> donorList = project.getDonorList();
	/*
    System.out.println(projectId);
    data = "[";
    for(Donor d : donorList){
    	data += d.toJson();
    	data += ", ";
    }
    data = data.substring(0, data.length() - 2);
    data += "]";
    return data;
    */
	return donorList;
  }
}
