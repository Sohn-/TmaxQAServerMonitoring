package com.tmaxqa.dao;

import com.tmaxqa.entity.CPU;



public interface CPUDao {
	
	int insertCPU(CPU cpu);
	int updateCPU(CPU cpu);
	int deleteCPU(String ip);
	
	CPU getCPUByCPUIp(String ip);

}
