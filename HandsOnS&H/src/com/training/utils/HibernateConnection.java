/**
 * 
 */
package com.training.utils;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate3.HibernateTemplate;

/**
 * @author akaul5
 *
 */
public class HibernateConnection {
@Autowired
private static HibernateTemplate hibernateTemplate;
public static HibernateTemplate getHibernateTemplate() {
  if(hibernateTemplate != null){
	  hibernateTemplate = new ClassPathXmlApplicationContext("bean.xml").getBean(HibernateTemplate.class);
  }
  return hibernateTemplate;
}
}
