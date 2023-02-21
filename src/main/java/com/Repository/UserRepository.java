package com.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity,Integer> {

}
