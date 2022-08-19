package com.NikheelIT.Phone_Book_Application.Model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PhoneBook {
	@Id
	
  private Integer contactId ;
	
	private String contactName;
	
	private String contactNumber;
	
	private String contactEmail;
	
	private Character activeSwitch;
	
	private LocalDate createDate;
	
	private LocalDate updateDate ;

	public Integer getContactId() {
		return contactId;
	}

	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public Character getActiveSwitch() {
		return activeSwitch;
	}

	public void setActiveSwitch(Character activeSwitch) {
		this.activeSwitch = activeSwitch;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	public LocalDate getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(LocalDate updateDate) {
		this.updateDate = updateDate;
	}

	@Override
	public String toString() {
		return "PhoneBook [contactId=" + contactId + ", contactName=" + contactName + ", contactNumber=" + contactNumber
				+ ", contactEmail=" + contactEmail + ", activeSwitch=" + activeSwitch + ", createDate=" + createDate
				+ ", updateDate=" + updateDate + "]";
	}
	
}
