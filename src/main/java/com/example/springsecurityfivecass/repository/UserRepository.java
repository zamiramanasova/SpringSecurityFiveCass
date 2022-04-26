package com.example.springsecurityfivecass.repository;

import com.example.springsecurityfivecass.entity.securemodel.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("Select u from User u where u.userName = :username")
    public User getUserByUsername(@Param("username") String username);
}