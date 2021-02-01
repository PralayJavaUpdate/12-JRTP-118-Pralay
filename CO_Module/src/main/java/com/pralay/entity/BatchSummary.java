package com.pralay.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="BATCH_SUMMARY")
public class BatchSummary {
	@Id
	@Column(name="SUMMARY_ID")
	private  Integer summaryId;
	
	@Column(name="BATCH_NAME")
	private String batchName;
	
	@Column(name="FAILURE_TRIGGER_COUNT")
	private Integer failuretriggerCount;
	
	@Column(name="SUCCESS_TRIGGER_COUNT")
	private  Integer successTriggerCount;
	
	@Column(name="TotalTriggerCount")
	private Integer totalTriggerCount;
	

}
