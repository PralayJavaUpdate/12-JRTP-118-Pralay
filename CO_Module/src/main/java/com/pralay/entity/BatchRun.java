package com.pralay.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Batch_Run_Details")
public class BatchRun {
	@Id
	@Column(name="BATCH_RUN_SEQ")
	 private Integer batchRunSeq;
	
	@Column(name="BATCH_NAME")
	 private String batchName;
	
	@Column(name="RUN_STATUS")
	 private String runStatus;
	
	@Column(name="END_DATE")
	 private long  endDate;
	
	@Column(name="INSTANCE_NUMBER")
	 private Integer instanceNumber;
	
	@Column(name="START_DATE")
	 private long startDate;

}
