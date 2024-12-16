package com.MobileApplication.demo.repository;

import com.MobileApplication.demo.entity.MobileEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MobileRepository extends JpaRepository<MobileEntity,Long> {
    
}
