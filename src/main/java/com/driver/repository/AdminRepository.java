package com.driver.repository;

import com.driver.model.Admin;
import jdk.internal.misc.CarrierThreadLocal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer>{
}