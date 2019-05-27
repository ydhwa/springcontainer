package com.cafe24.springcontainer.user;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import config.user.UserConfig01;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = UserConfig01.class)
//@ContextConfiguration(locations = {""}) // xml 위치 알려줌
public class UserTest {
	@Autowired
	private User user;
	
	@Test
	public void testUser() {
		assertNotNull(user);
	}
	
}
