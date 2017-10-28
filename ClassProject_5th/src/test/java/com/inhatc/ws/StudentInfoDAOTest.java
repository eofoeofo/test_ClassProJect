package com.inhatc.ws;


import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.inhatc.domain.StudentInfoVO;
import com.inhatc.persistence.StudentInfoDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/**/*.xml" })

public class StudentInfoDAOTest {
	
	@Inject
	private StudentInfoDAO dao;
	
	@Test
	public void testInsertStudentInfo() throws Exception {
		StudentInfoVO vo = new StudentInfoVO();
		vo.setClassnum("00000000");
		vo.setUsername("user00");
		vo.setAddr("USER");
		vo.setPhone("010-0000-0000");
		vo.setEmail("user00@aaa.com");
		
		dao.insertStudentInfo(vo);
	}
	
	@Test
	public void testSelectStudentInfo() throws Exception {
		
		dao.readStudentInfo("201244049");
	}

	
	

}
