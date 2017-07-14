package com.tmaxqa.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Repository;

import com.tmaxqa.dao.UsersDao;
import com.tmaxqa.entity.Users;

@Configurable
@Repository
public class UsersDaoTest {
	
	static final Logger LOG = LoggerFactory.getLogger(UsersDaoTest.class);
	
	@Autowired
	//@Qualifier("Users") //한번 넣어보자... 빈 found 0: 뜨는 에러 때문에 작성
	UsersDao dao;
	
	public UsersDaoTest(){
		ApplicationContext ctx = new GenericXmlApplicationContext("spring/application-config.xml");
		dao = ctx.getBean(UsersDao.class);
		
	}
	
	public static void main(String[] args) {
		
		// Mybatis 세션연결 
		//SqlSession sqlSession = MyBatisConnectionFactory.getSqlSessionFactory() .openSession(true);
		
		// Mapper 연결
		//UsersDao user = sqlSession.getMapper(UsersDao.class);

			
		UsersDaoTest test = new UsersDaoTest();
		test.daoTest();
		
	}
	
	
	public void daoTest(){
		Users user1 = new Users();
		Users user2;
		
		user1.setId("userid");
		user1.setPw("1234");
		user1.setDept("OQA2");
		user1.setName("admin");
		
		
		//LOG.trace("수업 1 : 부서의 개수는 [dao]: "+dao.insertUser(user1)); //OK
		System.out.println("test");
		LOG.warn(user1.toString());
		LOG.debug("수업 1 :  "+dao.updateUser(user1)); //OK
		LOG.trace("수업 1:" +dao.getUsersByUserId("OQA2"));
		//LOG.trace("수업 1:" +dao.getUsersByUserMail("asdf24243324"));
		//LOG.trace("수업 1:" +dao.getUsersForIdFind(user1));
		//LOG.trace("수업1:"+dao.getUsersForPassWordFind(user1));
		LOG.info("수업"+dao.updateUser(user1));
		LOG.info("수업:"+dao.getUsersByUserId("userid"));
		//확인하려면 이것들 주석 해제하기!! 17.6.11
		//dao.insertUser(user1);
		//user2 = dao.getUsersByUserId("userid");
		
		//user2.toString();
		
	}
	


}
