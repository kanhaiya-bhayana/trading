package com.sanchi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sanchi.model.User;
public interface UserRepository extends JpaRepository<User,Long> {
}
