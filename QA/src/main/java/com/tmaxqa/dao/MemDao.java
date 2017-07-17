package com.tmaxqa.dao;

import com.tmaxqa.entity.Mem;



public interface MemDao {
	
	int insertMem(Mem mem);
	int updateMem(Mem mem);
	int deleteMem(String ip);
	
	Mem getMemByMemIp(String ip);

}
