package com.pralay.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pralay.entity.CoPdf;

public interface CoPdfRepository extends JpaRepository<CoPdf,Serializable> {

}
