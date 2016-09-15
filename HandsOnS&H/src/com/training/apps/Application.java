/**
 * 
 */

package com.training.apps;

import com.training.entity.Project;
import com.training.utils.ProjectDao;


import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/** Application.
 * @author akaul5
 *
 */

public class Application {

  /** Command Line Argument.
   * @param args arguments
   */

  public static void main(String[] args) {

    /** Root Logger.
     * 
     */

    final Logger root = Logger.getRootLogger();
    try (ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml")) {
      root.error("Logging Started!");
      Project proj = ctx.getBean(Project.class);
      ProjectDao dao = ctx.getBean(ProjectDao.class);
      System.out.println(dao.add(proj));
      
    }
  }
}
