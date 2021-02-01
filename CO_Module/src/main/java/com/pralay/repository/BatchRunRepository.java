package com.pralay.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pralay.entity.BatchRun;

public interface BatchRunRepository extends JpaRepository<BatchRun,Serializable>{

}
