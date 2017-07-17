package com.tmaxqa.dao;

import com.tmaxqa.entity.Com;



public interface ComDao {
	
	int insertCom(Com com);
	int updateCom(Com com);
	int deleteCom(String ip);
	
	Com getComByComIp(String ip);

}
