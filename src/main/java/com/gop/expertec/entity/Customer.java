package com.gop.expertec.entity;

import com.gop.expertec.entite.Personne;

public class Customer extends Personne {
	protected Long customerNumber;

	public Long getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(Long customerNumber) {
		this.customerNumber = customerNumber;
	}

	@Override
	public String toString() {
		return "Customer [customerNumber=" + customerNumber + ", toString()="
				+ super.toString() + "]";
	}
	

}
