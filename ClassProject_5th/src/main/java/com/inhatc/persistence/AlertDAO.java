package com.inhatc.persistence;

import com.inhatc.domain.AlertVO;

public interface AlertDAO {
	
	public void insertAlert(AlertVO vo);
	
	public AlertVO readAlert(String bno)throws Exception;


}
