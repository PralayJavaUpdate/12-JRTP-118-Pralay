package com.pralay.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pralay.entity.BatchSummary;

public interface BatchSummaryRepository  extends JpaRepository<BatchSummary,Serializable>{

}
