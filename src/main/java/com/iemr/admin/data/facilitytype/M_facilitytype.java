package com.iemr.admin.data.facilitytype;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.google.gson.annotations.Expose;
import com.iemr.admin.utils.mapper.OutputMapper;

@Entity
@Table(name="m_facilitytype")
public class M_facilitytype {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "FacilityTypeID")
	@Expose
	private Integer facilityTypeID;
	
	@Column(name = "FacilityTypeName")
	@Expose
	private String facilityTypeName;
	
	@Column(name = "FacilityTypeDesc")
	@Expose
	private String facilityTypeDesc;
	
	@Column(name = "FacilityTypeCode")
	@Expose
	private String facilityTypeCode;
	
	@Column(name = "Status")
	@Expose
	private String status;
	
	@Column(name = "ProviderServiceMapID")
	@Expose
	private Integer providerServiceMapID;
	
	@Column(name = "Deleted", insertable = false, updatable = true)
	@Expose
	private Boolean deleted;
	
	@Column(name = "CreatedBy")
	@Expose
	private String createdBy;
	
	@Column(name = "CreatedDate", insertable = false, updatable = false)
	@Expose
	private Timestamp createdDate;
	
	@Column(name = "ModifiedBy")
	@Expose
	private String modifiedBy;
	
	@Column(name = "LastModDate", insertable = false, updatable = false)
	@Expose
	private Timestamp lastModDate;
	
	
	
	public M_facilitytype() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
	public Integer getFacilityTypeID() {
		return facilityTypeID;
	}

	public void setFacilityTypeID(Integer facilityTypeID) {
		facilityTypeID = facilityTypeID;
	}

	public String getFacilityTypeName() {
		return facilityTypeName;
	}

	public void setFacilityTypeName(String facilityTypeName) {
		this.facilityTypeName = facilityTypeName;
	}

	public String getFacilityTypeDesc() {
		return facilityTypeDesc;
	}

	public void setFacilityTypeDesc(String facilityTypeDesc) {
		this.facilityTypeDesc = facilityTypeDesc;
	}

	public String getFacilityTypeCode() {
		return facilityTypeCode;
	}

	public void setFacilityTypeCode(String facilityTypeCode) {
		this.facilityTypeCode = facilityTypeCode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getProviderServiceMapID() {
		return providerServiceMapID;
	}

	public void setProviderServiceMapID(Integer providerServiceMapID) {
		this.providerServiceMapID = providerServiceMapID;
	}

	public Boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	

	public Timestamp getCreatedDate() {
		return createdDate;
	}







	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}







	public Timestamp getLastModDate() {
		return lastModDate;
	}







	public void setLastModDate(Timestamp lastModDate) {
		this.lastModDate = lastModDate;
	}



	@Transient
	private OutputMapper outputMapper = new OutputMapper();

	@Override
	public String toString() {
		return outputMapper.gson().toJson(this);
	}

}