/**
 * 
 */
package com.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.training.entity.Project;
import com.training.utils.ProjectDao;

/**
 * @author akaul5
 *
 */
@Controller
public class PhilanthropyController {
  
  @Autowired
  ModelAndView modelView;
  
  @Autowired
  ProjectDao dao;
  
  @RequestMapping("/")
  public String indexPage(){
    return "index";
  }
  
  @RequestMapping("getProjects")
  public ModelAndView getProjects(){
	List<Project> list = dao.findAll();
	modelView.addObject("list",list);
	modelView.setViewName("ViewProjects");
    return modelView;
  }
}
