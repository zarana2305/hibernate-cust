package com.cg.jpacrud.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer implements Serializable {

	private static final long serialVersionUID = 1L;
		@Id
		private int customerId;
		private String name;
		private Date dob;
		//private LocalDate dob;
		
		@Column(name="cust_phone")
		private long phone;
		
		public Date getDob() {
			return dob;
		}
		public void setDob(Date dob) {
			this.dob = dob;
		}
		public long getPhone() {
			return phone;
		}
		public void setPhone(long phone) {
			this.phone = phone;
		}
		public int getCustomerId() {
			return customerId;
		}
		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		@Override
		public String toString() {
			return "Customer [customerId=" + customerId + ", name=" + name
					+ ", dob=" + dob + ", phone=" + phone + "]";
		}
	
}
