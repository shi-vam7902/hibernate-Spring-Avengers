package com.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Entity.DeveloperEntity;

@Repository
public interface  DeveloperRepository extends JpaRepository<DeveloperEntity, Integer> {

}
