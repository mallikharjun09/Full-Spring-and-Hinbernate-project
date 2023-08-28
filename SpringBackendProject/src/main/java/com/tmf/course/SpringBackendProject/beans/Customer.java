package com.tmf.course.SpringBackendProject.beans;

import org.springframework.stereotype.Component;

@Component
public class Customer {
	int customerId;
	String customerName;
	String customerCity;
	
	public Customer() {
		System.out.println("Welcome to Customer object...");
	}
	
	public Customer(int customerId, String customerName, String customerCity) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerCity = customerCity;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerCity="
				+ customerCity + "]";
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerCity() {
		return customerCity;
	}
	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}
}
