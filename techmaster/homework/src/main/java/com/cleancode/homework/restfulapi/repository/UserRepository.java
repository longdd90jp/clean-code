package com.cleancode.homework.restfulapi.repository;

import com.cleancode.homework.restfulapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Integer> {
    @Query("SELECT CASE WHEN COUNT(userId) > 0 THEN true ELSE false END FROM User WHERE email = :email")
    boolean existsByEmail(@Param("email") String email);
}
