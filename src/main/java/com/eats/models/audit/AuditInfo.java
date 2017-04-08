package com.eats.models.audit;

import java.time.LocalDateTime;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
public class AuditInfo {

	@CreatedBy
	private String createdBy;

	@LastModifiedBy
	private String updatedBy;

	@CreatedDate
	private LocalDateTime addedOn;

	@LastModifiedDate
	private LocalDateTime updatedOn;
}
