package com.project.medlife.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {

	User findByEmailIdAndPassword(String email, String password);

}
