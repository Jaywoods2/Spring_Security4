package com.hand.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.hand.vo.DbUser;

public class UserDao {
	 protected static Logger logger = Logger.getLogger("dao");  
	 //模拟从数据库查询用户，查询到用户名相同，就返回该用户对象。(如果配置了DB的话，就可以使用sql查询。这里使用list数据模拟)
	 public DbUser getDatabase(String username) { 
		 List<DbUser> users = internalDatabase();  
		 for (DbUser dbUser : users) {  
	            if (dbUser.getUsername().equals(username) == true) {  
	                logger.debug("User found");  
	                return dbUser;  
	            }  
	        }  
	        logger.error("User does not exist!");  
	        throw new RuntimeException("User does not exist!");
	 }

	//模拟数据库数据
	private List<DbUser> internalDatabase() {
		List<DbUser> users = new ArrayList<DbUser>();  
        DbUser user = null;  
  
        user = new DbUser();  
        user.setUsername("admin"); 

        // "admin"经过MD5加密后  
        user.setPassword("21232f297a57a5a743894a0e4a801fc3");  
        user.setAccess(1);  
  
        users.add(user);  
  
        user = new DbUser();  
        user.setUsername("user");  

        // "user"经过MD5加密后  
        user.setPassword("ee11cbb19052e40b07aac0ca060c23ee");  
        user.setAccess(2);  
  
        users.add(user);  
  
        return users;
	}
}
