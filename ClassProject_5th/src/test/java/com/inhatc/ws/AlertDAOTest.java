package com.inhatc.ws;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.inhatc.domain.AlertVO;
import com.inhatc.persistence.AlertDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/**/*.xml" })

public class AlertDAOTest {
	
	@Inject
	private AlertDAO dao;
	
	@Test
	public void testInsertAlert() throws Exception {
		AlertVO vo = new AlertVO();
		vo.setBno(1);
		vo.setCategory("category1");
		vo.setTitle("titleao");
		vo.setContent("contentao");
		vo.setWriter("writer11");
		
		dao.insertAlert(vo);
	}
	
	@Test
	public void testSelectAlert() throws Exception {
		
		dao.readAlert("title");
	}

}
