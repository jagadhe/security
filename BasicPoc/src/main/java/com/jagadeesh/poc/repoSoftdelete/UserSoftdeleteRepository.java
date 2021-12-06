package com.jagadeesh.poc.repoSoftdelete; 

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.jagadeesh.poc.model.User;

public interface UserSoftdeleteRepository extends JpaRepository<User, Integer> {
	/* @Override
	@Modifying
	@Transactional(readOnly = true)
	@Query("delete e from User where soft_delete =false")
			public List<User> findAll();
	
	@Modifying
	@Query("select e from User e where e.soft_delete=true")
	@Transactional(readOnly = true)
	 public List<User> findallDeleted();

	
	@Query("update User e set e.soft_delete=true where e.userid=?1")
	@Transactional
	@Modifying
	public void softDelete(int userid); */

     @Modifying	
	@Query("delete from User where username= :username")
	void deleteUserByusername(@Param("username") String username);

     @Query(value ="select * from User", nativeQuery = true)
    List<User> findAllUsersNQ();
	

	
	
	

}
