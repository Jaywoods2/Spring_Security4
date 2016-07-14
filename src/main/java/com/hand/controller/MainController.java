package com.hand.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	 protected static Logger logger = Logger.getLogger("controller");  

	 /**
	  * 跳转到comminpage页面
	  * @return
	  */
	 @RequestMapping("common")
	 public String getCommonPage(){
		 logger.debug("Received request to show common page");  
		 return "commonpage";
	 }
	 
	 /**
	  * 跳转到adminpage页面
	  * @return
	  */
	 @RequestMapping("admin")
	 public String getAdminPage(){
		 logger.debug("Received request to show admin page");
		 return "adminpage";
	 }
}
