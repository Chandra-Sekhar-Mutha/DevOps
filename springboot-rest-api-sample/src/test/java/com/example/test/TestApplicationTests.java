package com.example.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.test.entity.User;

import junit.framework.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
public class TestApplicationTests {

	@Autowired private TestRestTemplate restTemplate;
	
	@Test
	public void testGetUsers() {
		User[] users = restTemplate.getForObject("/users", User[].class);
		Assert.assertEquals(1, users.length);
	}

}
