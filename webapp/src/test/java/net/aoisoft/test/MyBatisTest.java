package net.aoisoft.test;

import javax.annotation.Resource;

import net.aoisoft.pojo.User;
import net.aoisoft.service.IUserService;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class MyBatisTest {
	private static Logger logger = Logger.getLogger(MyBatisTest.class);
	@Resource
	private IUserService userService = null;
	
	@Test
	public void test01() {
		User user = userService.getUserById(1);
		System.out.println(user.getUserName());
	}
}
