package com.jagadeesh.poc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import com.jagadeesh.poc.repoSoftdelete.UserSoftdeleteRepository;

@SpringBootTest
class BasicPocApplicationTests {
	
@Autowired
private UserSoftdeleteRepository userSoftdeleteRepository;

	@Test
	@Transactional
@Rollback(false)
	public void testdeleteByusername()

	{	
    userSoftdeleteRepository.deleteUserByusername("jaga");
}
	
	
	
	@Test
	public void testfindalluserNQ() {
		System.out.println(userSoftdeleteRepository.findAllUsersNQ());
	}
}